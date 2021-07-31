package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var `type`: JSXIdentifier
}
object `85` {
  
  @scala.inline
  def apply(): `85` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit class `85MutableBuilder`[Self <: `85`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
