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
  def apply(propertyValues: AssetPropertyValueList): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  @scala.inline
  implicit class PutAssetPropertyValueEntryOps[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = this.set("propertyValues", js.Array(value :_*))
    @scala.inline
    def setPropertyValues(value: AssetPropertyValueList): Self = this.set("propertyValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetId(value: AssetId): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setEntryId(value: AssetPropertyEntryId): Self = this.set("entryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryId: Self = this.set("entryId", js.undefined)
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = this.set("propertyAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyAlias: Self = this.set("propertyAlias", js.undefined)
    @scala.inline
    def setPropertyId(value: AssetPropertyId): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyId: Self = this.set("propertyId", js.undefined)
  }
  
}

