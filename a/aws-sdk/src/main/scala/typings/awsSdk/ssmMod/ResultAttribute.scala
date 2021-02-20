package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultAttribute extends StObject {
  
  /**
    * Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.
    */
  var TypeName: InventoryItemTypeName = js.native
}
object ResultAttribute {
  
  @scala.inline
  def apply(TypeName: InventoryItemTypeName): ResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultAttribute]
  }
  
  @scala.inline
  implicit class ResultAttributeMutableBuilder[Self <: ResultAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
