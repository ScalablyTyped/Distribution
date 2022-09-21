package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExportAssignment
  extends StObject
     with BaseNode
     with Node
     with Statement
     with TypeScript {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSExportAssignment: typings.babelTypes.babelTypesStrings.TSExportAssignment
}
object TSExportAssignment {
  
  inline def apply(expression: Expression): TSExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[TSExportAssignment]
  }
  
  extension [Self <: TSExportAssignment](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
