package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElement extends TypeDerived {
  
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.native
  
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.native
  
  /**
    * Is the primary Id of the element
    */
  var id: String = js.native
}
object BaseElement {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String): BaseElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement]
  }
  
  @scala.inline
  implicit class BaseElementOps[Self <: BaseElement] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$attrs(value: StringDictionary[js.Any]): Self = this.set("$attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$attrs: Self = this.set("$attrs", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: Documentation*): Self = this.set("documentation", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[Documentation]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = this.set("extensionDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = this.set("extensionDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionDefinitions: Self = this.set("extensionDefinitions", js.undefined)
    
    @scala.inline
    def setExtensionElements(value: ExtensionElements): Self = this.set("extensionElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionElements: Self = this.set("extensionElements", js.undefined)
  }
}
