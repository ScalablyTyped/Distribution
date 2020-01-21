package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAssetPropertyValueEntry extends js.Object {
  /**
    * The ID of the AWS IoT SiteWise asset. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var assetId: js.UndefOr[AssetId] = js.native
  /**
    * Optional. A unique identifier for this entry that you can define to better track which message caused an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.native
  /**
    * The name of the property alias associated with your asset property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset's property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.native
  /**
    * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
    */
  var propertyValues: AssetPropertyValueList = js.native
}

object PutAssetPropertyValueEntry {
  @scala.inline
  def apply(
    propertyValues: AssetPropertyValueList,
    assetId: AssetId = null,
    entryId: AssetPropertyEntryId = null,
    propertyAlias: AssetPropertyAlias = null,
    propertyId: AssetPropertyId = null
  ): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (entryId != null) __obj.updateDynamic("entryId")(entryId.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyId != null) __obj.updateDynamic("propertyId")(propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
}

