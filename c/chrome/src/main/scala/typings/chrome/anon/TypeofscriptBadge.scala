package typings.chrome.anon

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofscriptBadge extends StObject {
  
  def getAttention(details: AttentionDetails): Unit
  
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit
  
  var onClicked: ScriptBadgeClickedEvent
  
  def setPopup(details: SetPopupDetails): Unit
}
object TypeofscriptBadge {
  
  inline def apply(
    getAttention: AttentionDetails => Unit,
    getPopup: (GetPopupDetails, js.Function) => Unit,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Unit
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked.asInstanceOf[js.Any], setPopup = js.Any.fromFunction1(setPopup))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofscriptBadge] (val x: Self) extends AnyVal {
    
    inline def setGetAttention(value: AttentionDetails => Unit): Self = StObject.set(x, "getAttention", js.Any.fromFunction1(value))
    
    inline def setGetPopup(value: (GetPopupDetails, js.Function) => Unit): Self = StObject.set(x, "getPopup", js.Any.fromFunction2(value))
    
    inline def setOnClicked(value: ScriptBadgeClickedEvent): Self = StObject.set(x, "onClicked", value.asInstanceOf[js.Any])
    
    inline def setSetPopup(value: SetPopupDetails => Unit): Self = StObject.set(x, "setPopup", js.Any.fromFunction1(value))
  }
}
