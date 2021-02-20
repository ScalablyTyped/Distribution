package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionAttributeDefinition extends TypeDerived {
  
  /**
    * @default false
    */
  var isReference: Boolean = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
}
object ExtensionAttributeDefinition {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, isReference: Boolean, name: String, `type`: String): ExtensionAttributeDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isReference = isReference.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAttributeDefinition]
  }
  
  @scala.inline
  implicit class ExtensionAttributeDefinitionMutableBuilder[Self <: ExtensionAttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsReference(value: Boolean): Self = StObject.set(x, "isReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
