package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var effect: String
}
object Action {
  
  @scala.inline
  def apply(action: String, effect: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
