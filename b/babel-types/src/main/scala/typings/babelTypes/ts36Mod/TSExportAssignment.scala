package typings.babelTypes.ts36Mod

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
  
  @JSImport("babel-types/ts3.6", "TSExportAssignment")
  @js.native
  def apply(expression: Expression): TSExportAssignment = js.native
  
  @scala.inline
  implicit class TSExportAssignmentMutableBuilder[Self <: TSExportAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
