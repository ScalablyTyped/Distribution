package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var `type`: NewExpression
}
object `58` {
  
  @scala.inline
  def apply(): `58` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit class `58MutableBuilder`[Self <: `58`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
