package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowStatement_
  extends StObject
     with Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var argument: Expression
  
  @JSName("type")
  var type_ThrowStatement_ : ThrowStatement
}
object ThrowStatement_ {
  
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[ThrowStatement_]
  }
  
  @scala.inline
  implicit class ThrowStatement_MutableBuilder[Self <: ThrowStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
