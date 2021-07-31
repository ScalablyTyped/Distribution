package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseAction extends StObject {
  
  /**
    * The ID of the asset that has the specified property. You can specify an expression.
    */
  var assetId: js.UndefOr[AssetId] = js.undefined
  
  /**
    * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier. You can also specify an expression.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined
  
  /**
    * The alias of the asset property. You can also specify an expression.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property. You can specify an expression.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.undefined
  
  /**
    * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information. 
    */
  var propertyValue: AssetPropertyValue
}
object IotSiteWiseAction {
  
  @scala.inline
  def apply(propertyValue: AssetPropertyValue): IotSiteWiseAction = {
    val __obj = js.Dynamic.literal(propertyValue = propertyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseAction]
  }
  
  @scala.inline
  implicit class IotSiteWiseActionMutableBuilder[Self <: IotSiteWiseAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: AssetId): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setEntryId(value: AssetPropertyEntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryIdUndefined: Self = StObject.set(x, "entryId", js.undefined)
    
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyId(value: AssetPropertyId): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    @scala.inline
    def setPropertyValue(value: AssetPropertyValue): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
  }
}
