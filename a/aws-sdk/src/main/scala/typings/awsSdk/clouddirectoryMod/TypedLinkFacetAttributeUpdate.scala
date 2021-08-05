package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedLinkFacetAttributeUpdate extends StObject {
  
  /**
    * The action to perform when updating the attribute.
    */
  var Action: UpdateActionType
  
  /**
    * The attribute to update.
    */
  var Attribute: TypedLinkAttributeDefinition
}
object TypedLinkFacetAttributeUpdate {
  
  inline def apply(Action: UpdateActionType, Attribute: TypedLinkAttributeDefinition): TypedLinkFacetAttributeUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
  }
  
  extension [Self <: TypedLinkFacetAttributeUpdate](x: Self) {
    
    inline def setAction(value: UpdateActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setAttribute(value: TypedLinkAttributeDefinition): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
  }
}
