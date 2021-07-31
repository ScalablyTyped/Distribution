package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var `type`: JSXMemberExpression
}
object `192` {
  
  @scala.inline
  def apply(): `192` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[`192`]
  }
  
  @scala.inline
  implicit class `192MutableBuilder`[Self <: `192`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
