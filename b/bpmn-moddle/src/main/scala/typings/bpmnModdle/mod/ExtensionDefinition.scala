package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDefinition
  extends StObject
     with TypeDerived {
  
  var extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition]
  
  var name: String
}
object ExtensionDefinition {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition],
    name: String
  ): ExtensionDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinitions = extensionAttributeDefinitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDefinition]
  }
  
  extension [Self <: ExtensionDefinition](x: Self) {
    
    inline def setExtensionAttributeDefinitions(value: js.Array[ExtensionAttributeDefinition]): Self = StObject.set(x, "extensionAttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setExtensionAttributeDefinitionsVarargs(value: ExtensionAttributeDefinition*): Self = StObject.set(x, "extensionAttributeDefinitions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
