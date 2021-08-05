package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrelationPropertyBinding
  extends StObject
     with BaseElement {
  
  var correlationPropertyRef: CorrelationProperty
  
  var dataPath: FormalExpression
}
object CorrelationPropertyBinding {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    dataPath: FormalExpression,
    id: String
  ): CorrelationPropertyBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRef = correlationPropertyRef.asInstanceOf[js.Any], dataPath = dataPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyBinding]
  }
  
  extension [Self <: CorrelationPropertyBinding](x: Self) {
    
    inline def setCorrelationPropertyRef(value: CorrelationProperty): Self = StObject.set(x, "correlationPropertyRef", value.asInstanceOf[js.Any])
    
    inline def setDataPath(value: FormalExpression): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
  }
}
