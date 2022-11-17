package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExportAssignment__
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSExportAssignment__ : "TSExportAssignment"
}
object TSExportAssignment__ {
  
  inline def apply(expression: Expression): TSExportAssignment__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[TSExportAssignment__]
  }
  
  extension [Self <: TSExportAssignment__](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSExportAssignment"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
