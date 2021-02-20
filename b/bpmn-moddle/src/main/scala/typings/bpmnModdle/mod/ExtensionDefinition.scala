package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionDefinition extends TypeDerived {
  
  var extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition] = js.native
  
  var name: String = js.native
}
object ExtensionDefinition {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinitions: js.Array[ExtensionAttributeDefinition],
    name: String
  ): ExtensionDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinitions = extensionAttributeDefinitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDefinition]
  }
  
  @scala.inline
  implicit class ExtensionDefinitionMutableBuilder[Self <: ExtensionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionAttributeDefinitions(value: js.Array[ExtensionAttributeDefinition]): Self = StObject.set(x, "extensionAttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionAttributeDefinitionsVarargs(value: ExtensionAttributeDefinition*): Self = StObject.set(x, "extensionAttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
