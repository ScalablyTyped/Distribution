package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatement_
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement = js.native
}
object ReturnStatement_ {
  
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: ReturnStatement): ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  @scala.inline
  implicit class ReturnStatement_MutableBuilder[Self <: ReturnStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
