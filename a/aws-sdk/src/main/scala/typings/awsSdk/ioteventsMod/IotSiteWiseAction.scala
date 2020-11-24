package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(propertyValue: AssetPropertyValue): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal(propertyValue = propertyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAction]
  }
  
  @scala.inline
  implicit class IotSiteWiseActionOps[Self <: IotSiteWiseAction] (val x: Self) extends AnyVal {
    
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
    def setPropertyValue(value: AssetPropertyValue): Self = this.set("propertyValue", value.asInstanceOf[js.Any])
    
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
