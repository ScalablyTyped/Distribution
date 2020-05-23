package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotSiteWiseAction extends js.Object {
  /**
    * The ID of the asset that has the specified property. You can specify an expression.
    */
  var assetId: js.UndefOr[AssetId] = js.native
  /**
    * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier. You can also specify an expression.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.native
  /**
    * The alias of the asset property. You can also specify an expression.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset property. You can specify an expression.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.native
  /**
    * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information. 
    */
  var propertyValue: AssetPropertyValue = js.native
}

object IotSiteWiseAction {
  @scala.inline
  def apply(
    propertyValue: AssetPropertyValue,
    assetId: AssetId = null,
    entryId: AssetPropertyEntryId = null,
    propertyAlias: AssetPropertyAlias = null,
    propertyId: AssetPropertyId = null
  ): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal(propertyValue = propertyValue.asInstanceOf[js.Any])
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (entryId != null) __obj.updateDynamic("entryId")(entryId.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyId != null) __obj.updateDynamic("propertyId")(propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAction]
  }
}

