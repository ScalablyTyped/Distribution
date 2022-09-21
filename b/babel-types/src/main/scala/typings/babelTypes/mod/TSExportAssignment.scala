package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExportAssignment
  extends StObject
     with Node
     with Statement {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSExportAssignment: typings.babelTypes.babelTypesStrings.TSExportAssignment
}
object TSExportAssignment {
  
  @JSImport("babel-types", "TSExportAssignment")
  @js.native
  def apply(expression: Expression): TSExportAssignment = js.native
  
  extension [Self <: TSExportAssignment](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
