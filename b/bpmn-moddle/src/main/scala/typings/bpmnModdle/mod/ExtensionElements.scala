package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionElements
  extends StObject
     with TypeDerived
     with /* key */ StringDictionary[Any] {
  
  var extensionAttributeDefinition: ExtensionAttributeDefinition
  
  var valueRef: BaseElement
  
  var values: js.Array[BaseElement]
}
object ExtensionElements {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    extensionAttributeDefinition: ExtensionAttributeDefinition,
    valueRef: BaseElement,
    values: js.Array[BaseElement]
  ): ExtensionElements = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], extensionAttributeDefinition = extensionAttributeDefinition.asInstanceOf[js.Any], valueRef = valueRef.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionElements]
  }
  
  extension [Self <: ExtensionElements](x: Self) {
    
    inline def setExtensionAttributeDefinition(value: ExtensionAttributeDefinition): Self = StObject.set(x, "extensionAttributeDefinition", value.asInstanceOf[js.Any])
    
    inline def setValueRef(value: BaseElement): Self = StObject.set(x, "valueRef", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[BaseElement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: BaseElement*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
