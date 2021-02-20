package typings.chrome.anon

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofscriptBadge extends StObject {
  
  def getAttention(details: AttentionDetails): Unit = js.native
  
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  
  var onClicked: ScriptBadgeClickedEvent = js.native
  
  def setPopup(details: SetPopupDetails): Unit = js.native
}
object TypeofscriptBadge {
  
  @scala.inline
  def apply(
    getAttention: AttentionDetails => Unit,
    getPopup: (GetPopupDetails, js.Function) => Unit,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Unit
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked.asInstanceOf[js.Any], setPopup = js.Any.fromFunction1(setPopup))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
  
  @scala.inline
  implicit class TypeofscriptBadgeMutableBuilder[Self <: TypeofscriptBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttention(value: AttentionDetails => Unit): Self = StObject.set(x, "getAttention", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopup(value: (GetPopupDetails, js.Function) => Unit): Self = StObject.set(x, "getPopup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClicked(value: ScriptBadgeClickedEvent): Self = StObject.set(x, "onClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPopup(value: SetPopupDetails => Unit): Self = StObject.set(x, "setPopup", js.Any.fromFunction1(value))
  }
}
