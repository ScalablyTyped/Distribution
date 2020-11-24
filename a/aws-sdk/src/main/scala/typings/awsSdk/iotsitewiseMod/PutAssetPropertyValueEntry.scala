package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
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
  def apply(entryId: EntryId, propertyValues: AssetPropertyValues): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  
  @scala.inline
  implicit class PutAssetPropertyValueEntryOps[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryId(value: EntryId): Self = this.set("entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = this.set("propertyValues", js.Array(value :_*))
    
    @scala.inline
    def setPropertyValues(value: AssetPropertyValues): Self = this.set("propertyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = this.set("propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyAlias: Self = this.set("propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyId(value: ID): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyId: Self = this.set("propertyId", js.undefined)
  }
}
