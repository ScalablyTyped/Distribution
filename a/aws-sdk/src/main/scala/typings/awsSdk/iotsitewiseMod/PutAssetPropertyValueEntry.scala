package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAssetPropertyValueEntry extends js.Object {
  /**
    * The ID of the asset to update.
    */
  var assetId: js.UndefOr[ID] = js.native
  /**
    * The user specified ID for the entry. You can use this ID to identify which entries failed.
    */
  var entryId: EntryId = js.native
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset property for this entry.
    */
  var propertyId: js.UndefOr[ID] = js.native
  /**
    * The list of property values to upload. You can specify up to 10 propertyValues array elements. 
    */
  var propertyValues: AssetPropertyValues = js.native
}

object PutAssetPropertyValueEntry {
  @scala.inline
  def apply(
    entryId: EntryId,
    propertyValues: AssetPropertyValues,
    assetId: ID = null,
    propertyAlias: AssetPropertyAlias = null,
    propertyId: ID = null
  ): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], propertyValues = propertyValues.asInstanceOf[js.Any])
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyId != null) __obj.updateDynamic("propertyId")(propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
}

