package typings.baseui.selectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var value: Value
}
object State {
  
  @scala.inline
  def apply(value: Value): State = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
