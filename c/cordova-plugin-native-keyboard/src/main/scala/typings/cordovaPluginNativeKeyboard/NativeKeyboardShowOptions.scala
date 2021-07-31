package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeKeyboardShowOptions extends StObject {
  
  /**
    * Makes the messenger bar slide in from the bottom.
    *
    * Default: false
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options are: "light", "dark".
    *
    * Default: "default"
    */
  var appearance: js.UndefOr[String] = js.undefined
  
  /**
    * DOM element, which should be scrolled automatically
    */
  var autoscrollElement: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The background color of the messenger bar.
    *
    * Default: #F6F6F6
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Options are: "none", "split", "countdown", "countdownreversed".
    * Note that if maxChars is set, "none" will still show a counter.
    *
    * Default: "none"
    */
  var counterStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean value indicating if the keyboard should be kept open after submitting the entered
    * text
    *
    * Default: false
    */
  var keepOpenAfterSubmit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The left button of the messenger bar
    */
  var leftButton: js.UndefOr[LeftButtonOptions] = js.undefined
  
  /**
    * Maximum amount of chars that can be entered
    */
  var maxChars: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback function which is being executed as soon as the keyboard did hide
    */
  var onKeyboardDidHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback function which is being executed as soon as the keyboard did show
    */
  var onKeyboardDidShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback function which is being executed as soon as the keyboard will hide
    */
  var onKeyboardWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback function which is being executed as soon as the keyboard will show
    */
  var onKeyboardWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback function, which is being called as soon as the user submits
    */
  def onSubmit(text: String): Unit
  
  /**
    * Callback function which is being executed as soon as the entered text changes. Will
    * return the new text
    */
  var onTextChanged: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * A placeholder which will be in the messenger bar, when opening and the input field is
    * empty
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the placeholder.
    *
    * Default: #ccc
    */
  var placeholderColor: js.UndefOr[String] = js.undefined
  
  /**
    * The right button of the messenger bar
    */
  var rightButton: js.UndefOr[ButtonOptions] = js.undefined
  
  /**
    * Boolean value indicating if the content should be scrolled to the end after the messenger is
    * shown
    */
  var scrollToBottomAfterMessengerShows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disables things like the Emoji keyboard and the Predicive text entry bar
    *
    * Default: false
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Open the keyboard when showing the messenger.
    *
    * Default: false
    */
  var showKeyboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A text which will be in the messenger bar, when opening
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the typed text in HEX.
    *
    * Default: #444
    */
  var textColor: js.UndefOr[String] = js.undefined
  
  /**
    * The background color of the textview. Looks nicest on Android
    * if it's the same color as the backgroundColor property.
    *
    * Default: #F6F6F6
    */
  var textViewBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * The border color of the textview.
    *
    * Default: #666666
    */
  var textViewBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Options are: "default", "decimalpad", "phonepad", "numberpad", "namephonepad",
    * "number", "email", "twitter", "url", "alphabet", "search", "ascii"
    *
    * Default: "default"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object NativeKeyboardShowOptions {
  
  @scala.inline
  def apply(onSubmit: String => Unit): NativeKeyboardShowOptions = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[NativeKeyboardShowOptions]
  }
  
  @scala.inline
  implicit class NativeKeyboardShowOptionsMutableBuilder[Self <: NativeKeyboardShowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setAutoscrollElement(value: js.Any): Self = StObject.set(x, "autoscrollElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollElementUndefined: Self = StObject.set(x, "autoscrollElement", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCounterStyle(value: String): Self = StObject.set(x, "counterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterStyleUndefined: Self = StObject.set(x, "counterStyle", js.undefined)
    
    @scala.inline
    def setKeepOpenAfterSubmit(value: Boolean): Self = StObject.set(x, "keepOpenAfterSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOpenAfterSubmitUndefined: Self = StObject.set(x, "keepOpenAfterSubmit", js.undefined)
    
    @scala.inline
    def setLeftButton(value: LeftButtonOptions): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
    
    @scala.inline
    def setMaxChars(value: Double): Self = StObject.set(x, "maxChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCharsUndefined: Self = StObject.set(x, "maxChars", js.undefined)
    
    @scala.inline
    def setOnKeyboardDidHide(value: () => Unit): Self = StObject.set(x, "onKeyboardDidHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyboardDidHideUndefined: Self = StObject.set(x, "onKeyboardDidHide", js.undefined)
    
    @scala.inline
    def setOnKeyboardDidShow(value: () => Unit): Self = StObject.set(x, "onKeyboardDidShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyboardDidShowUndefined: Self = StObject.set(x, "onKeyboardDidShow", js.undefined)
    
    @scala.inline
    def setOnKeyboardWillHide(value: () => Unit): Self = StObject.set(x, "onKeyboardWillHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyboardWillHideUndefined: Self = StObject.set(x, "onKeyboardWillHide", js.undefined)
    
    @scala.inline
    def setOnKeyboardWillShow(value: () => Unit): Self = StObject.set(x, "onKeyboardWillShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyboardWillShowUndefined: Self = StObject.set(x, "onKeyboardWillShow", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextChanged(value: /* text */ String => Unit): Self = StObject.set(x, "onTextChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextChangedUndefined: Self = StObject.set(x, "onTextChanged", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderColorUndefined: Self = StObject.set(x, "placeholderColor", js.undefined)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRightButton(value: ButtonOptions): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
    
    @scala.inline
    def setScrollToBottomAfterMessengerShows(value: Boolean): Self = StObject.set(x, "scrollToBottomAfterMessengerShows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToBottomAfterMessengerShowsUndefined: Self = StObject.set(x, "scrollToBottomAfterMessengerShows", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setShowKeyboard(value: Boolean): Self = StObject.set(x, "showKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeyboardUndefined: Self = StObject.set(x, "showKeyboard", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextViewBackgroundColor(value: String): Self = StObject.set(x, "textViewBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextViewBackgroundColorUndefined: Self = StObject.set(x, "textViewBackgroundColor", js.undefined)
    
    @scala.inline
    def setTextViewBorderColor(value: String): Self = StObject.set(x, "textViewBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextViewBorderColorUndefined: Self = StObject.set(x, "textViewBorderColor", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
