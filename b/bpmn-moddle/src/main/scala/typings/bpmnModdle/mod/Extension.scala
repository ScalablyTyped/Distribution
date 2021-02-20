package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends TypeDerived {
  
  var definition: ExtensionDefinition = js.native
  
  /**
    * @default false
    */
  var mustUnderstand: Boolean = js.native
}
object Extension {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, definition: ExtensionDefinition, mustUnderstand: Boolean): Extension = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], mustUnderstand = mustUnderstand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: ExtensionDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustUnderstand(value: Boolean): Self = StObject.set(x, "mustUnderstand", value.asInstanceOf[js.Any])
  }
}
