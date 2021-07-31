package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var `type`: JSXAttribute
}
object `100` {
  
  @scala.inline
  def apply(): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit class `100MutableBuilder`[Self <: `100`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
