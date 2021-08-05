package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAttributeDefinition
  extends StObject
     with TypeDerived {
  
  /**
    * @default false
    */
  var isReference: Boolean
  
  var name: String
  
  var `type`: String
}
object ExtensionAttributeDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, isReference: Boolean, name: String, `type`: String): ExtensionAttributeDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isReference = isReference.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAttributeDefinition]
  }
  
  extension [Self <: ExtensionAttributeDefinition](x: Self) {
    
    inline def setIsReference(value: Boolean): Self = StObject.set(x, "isReference", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
