package typings.cordovaPluginDialogs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object, passed to promptCallback */
@js.native
trait NotificationPromptResult extends StObject {
  
  /**
    * The index of the pressed button. Note that the index uses one-based indexing, so the value is 1, 2, 3, etc.
    * 0 is the result when the dialog is dismissed without a button press.
    */
  var buttonIndex: Double = js.native
  
  /** The text entered in the prompt dialog box. */
  var input1: String = js.native
}
object NotificationPromptResult {
  
  @scala.inline
  def apply(buttonIndex: Double, input1: String): NotificationPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPromptResult]
  }
  
  @scala.inline
  implicit class NotificationPromptResultMutableBuilder[Self <: NotificationPromptResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput1(value: String): Self = StObject.set(x, "input1", value.asInstanceOf[js.Any])
  }
}
