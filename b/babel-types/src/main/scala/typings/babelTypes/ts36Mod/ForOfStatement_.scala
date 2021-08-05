package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForOfStatement_
  extends StObject
     with Node
     with BlockParent
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  
  var body: Statement
  
  var left: VariableDeclaration_ | LVal
  
  var right: Expression
  
  @JSName("type")
  var type_ForOfStatement_ : ForOfStatement
}
object ForOfStatement_ {
  
  inline def apply(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): ForOfStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[ForOfStatement_]
  }
  
  extension [Self <: ForOfStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: VariableDeclaration_ | LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
