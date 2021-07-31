package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YieldExpression_
  extends StObject
     with Node
     with Expression
     with Terminatorless {
  
  var argument: Expression
  
  var delegate: Boolean
  
  @JSName("type")
  var type_YieldExpression_ : YieldExpression
}
object YieldExpression_ {
  
  @scala.inline
  def apply(argument: Expression, delegate: Boolean, end: Double, loc: SourceLocation, start: Double): YieldExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[YieldExpression_]
  }
  
  @scala.inline
  implicit class YieldExpression_MutableBuilder[Self <: YieldExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
