package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class BaseElementMutableBuilder[Self <: BaseElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$attrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "$attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$attrsUndefined: Self = StObject.set(x, "$attrs", js.undefined)
    
    @scala.inline
    def setDocumentation(value: js.Array[Documentation]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: Documentation*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = StObject.set(x, "extensionDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionDefinitionsUndefined: Self = StObject.set(x, "extensionDefinitions", js.undefined)
    
    @scala.inline
    def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = StObject.set(x, "extensionDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setExtensionElements(value: ExtensionElements): Self = StObject.set(x, "extensionElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionElementsUndefined: Self = StObject.set(x, "extensionElements", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
