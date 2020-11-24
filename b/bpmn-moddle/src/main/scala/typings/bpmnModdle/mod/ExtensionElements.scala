package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionElements
  extends TypeDerived
     with /* key */ StringDictionary[js.Any] {
  
  var extensionAttributeDefinition: ExtensionAttributeDefinition = js.native
  
  var valueRef: BaseElement = js.native
  
  var values: js.Array[BaseElement] = js.native
}
object ExtensionElements {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinition: ExtensionAttributeDefinition,
    valueRef: BaseElement,
    values: js.Array[BaseElement]
  ): ExtensionElements = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinition = extensionAttributeDefinition.asInstanceOf[js.Any], valueRef = valueRef.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionElements]
  }
  
  @scala.inline
  implicit class ExtensionElementsOps[Self <: ExtensionElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensionAttributeDefinition(value: ExtensionAttributeDefinition): Self = this.set("extensionAttributeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRef(value: BaseElement): Self = this.set("valueRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: BaseElement*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[BaseElement]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
