package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterpreterDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var `type`: InterpreterDirective
}
object `86` {
  
  @scala.inline
  def apply(): `86` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[`86`]
  }
  
  @scala.inline
  implicit class `86MutableBuilder`[Self <: `86`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InterpreterDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
