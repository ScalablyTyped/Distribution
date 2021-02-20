package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwaitExpression_
  extends Node
     with Expression
     with Terminatorless {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_AwaitExpression_ : AwaitExpression = js.native
}
object AwaitExpression_ {
  
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: AwaitExpression): AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitExpression_]
  }
  
  @scala.inline
  implicit class AwaitExpression_MutableBuilder[Self <: AwaitExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
