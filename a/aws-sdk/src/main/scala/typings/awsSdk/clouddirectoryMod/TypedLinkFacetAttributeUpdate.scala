package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedLinkFacetAttributeUpdate extends StObject {
  
  /**
    * The action to perform when updating the attribute.
    */
  var Action: UpdateActionType = js.native
  
  /**
    * The attribute to update.
    */
  var Attribute: TypedLinkAttributeDefinition = js.native
}
object TypedLinkFacetAttributeUpdate {
  
  @scala.inline
  def apply(Action: UpdateActionType, Attribute: TypedLinkAttributeDefinition): TypedLinkFacetAttributeUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
  }
  
  @scala.inline
  implicit class TypedLinkFacetAttributeUpdateMutableBuilder[Self <: TypedLinkFacetAttributeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: UpdateActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: TypedLinkAttributeDefinition): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
  }
}
