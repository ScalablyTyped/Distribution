package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeKeyboardUpdateOptions extends StObject {
  
  /**
    * Position the cursor anywhere in the text range. Defaults to the end of the text.
    */
  var caretIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * If false or omitted no changes to the keyboard state are made.
    */
  var showKeyboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replace the messenger's text by this. The current text remains if omitted.
    */
  var text: js.UndefOr[String] = js.undefined
}
object NativeKeyboardUpdateOptions {
  
  @scala.inline
  def apply(): NativeKeyboardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardUpdateOptions]
  }
  
  @scala.inline
  implicit class NativeKeyboardUpdateOptionsMutableBuilder[Self <: NativeKeyboardUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaretIndex(value: Double): Self = StObject.set(x, "caretIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaretIndexUndefined: Self = StObject.set(x, "caretIndex", js.undefined)
    
    @scala.inline
    def setShowKeyboard(value: Boolean): Self = StObject.set(x, "showKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeyboardUndefined: Self = StObject.set(x, "showKeyboard", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
