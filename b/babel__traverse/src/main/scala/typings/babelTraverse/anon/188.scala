package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var `type`: FunctionExpression
}
object `188` {
  
  @scala.inline
  def apply(): `188` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
