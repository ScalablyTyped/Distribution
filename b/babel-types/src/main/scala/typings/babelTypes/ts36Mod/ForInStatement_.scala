package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ForInStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForInStatement_
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
  var type_ForInStatement_ : ForInStatement
}
object ForInStatement_ {
  
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[ForInStatement_]
  }
  
  @scala.inline
  implicit class ForInStatement_MutableBuilder[Self <: ForInStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: VariableDeclaration_ | LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
