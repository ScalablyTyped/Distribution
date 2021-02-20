package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemSchema extends StObject {
  
  /**
    * The schema attributes for inventory. This contains data type and attribute name.
    */
  var Attributes: InventoryItemAttributeList = js.native
  
  /**
    * The alias name of the inventory type. The alias name is used for display purposes.
    */
  var DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.native
  
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName = js.native
  
  /**
    * The schema version for the inventory item.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.native
}
object InventoryItemSchema {
  
  @scala.inline
  def apply(Attributes: InventoryItemAttributeList, TypeName: InventoryItemTypeName): InventoryItemSchema = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemSchema]
  }
  
  @scala.inline
  implicit class InventoryItemSchemaMutableBuilder[Self <: InventoryItemSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: InventoryItemAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: InventoryItemAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: InventoryTypeDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
