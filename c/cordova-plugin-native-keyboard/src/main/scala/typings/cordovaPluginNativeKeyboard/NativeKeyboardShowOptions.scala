package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboardShowOptions extends js.Object {
  /**
    * Makes the messenger bar slide in from the bottom.
    *
    * Default: false
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Options are: "light", "dark".
    *
    * Default: "default"
    */
  var appearance: js.UndefOr[String] = js.native
  /**
    * DOM element, which should be scrolled automatically
    */
  var autoscrollElement: js.UndefOr[js.Any] = js.native
  /**
    * The background color of the messenger bar.
    *
    * Default: #F6F6F6
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Options are: "none", "split", "countdown", "countdownreversed".
    * Note that if maxChars is set, "none" will still show a counter.
    *
    * Default: "none"
    */
  var counterStyle: js.UndefOr[String] = js.native
  /**
    * Boolean value indicating if the keyboard should be kept open after submitting the entered
    * text
    *
    * Default: false
    */
  var keepOpenAfterSubmit: js.UndefOr[Boolean] = js.native
  /**
    * The left button of the messenger bar
    */
  var leftButton: js.UndefOr[LeftButtonOptions] = js.native
  /**
    * Maximum amount of chars that can be entered
    */
  var maxChars: js.UndefOr[Double] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard did hide
    */
  var onKeyboardDidHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard did show
    */
  var onKeyboardDidShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard will hide
    */
  var onKeyboardWillHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard will show
    */
  var onKeyboardWillShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the entered text changes. Will
    * return the new text
    */
  var onTextChanged: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  /**
    * A placeholder which will be in the messenger bar, when opening and the input field is
    * empty
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The color of the placeholder.
    *
    * Default: #ccc
    */
  var placeholderColor: js.UndefOr[String] = js.native
  /**
    * The right button of the messenger bar
    */
  var rightButton: js.UndefOr[ButtonOptions] = js.native
  /**
    * Boolean value indicating if the content should be scrolled to the end after the messenger is
    * shown
    */
  var scrollToBottomAfterMessengerShows: js.UndefOr[Boolean] = js.native
  /**
    * Disables things like the Emoji keyboard and the Predicive text entry bar
    *
    * Default: false
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Open the keyboard when showing the messenger.
    *
    * Default: false
    */
  var showKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * A text which will be in the messenger bar, when opening
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The color of the typed text in HEX.
    *
    * Default: #444
    */
  var textColor: js.UndefOr[String] = js.native
  /**
    * The background color of the textview. Looks nicest on Android
    * if it's the same color as the backgroundColor property.
    *
    * Default: #F6F6F6
    */
  var textViewBackgroundColor: js.UndefOr[String] = js.native
  /**
    * The border color of the textview.
    *
    * Default: #666666
    */
  var textViewBorderColor: js.UndefOr[String] = js.native
  /**
    * Options are: "default", "decimalpad", "phonepad", "numberpad", "namephonepad",
    * "number", "email", "twitter", "url", "alphabet", "search", "ascii"
    *
    * Default: "default"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Callback function, which is being called as soon as the user submits
    */
  def onSubmit(text: String): Unit = js.native
}

object NativeKeyboardShowOptions {
  @scala.inline
  def apply(onSubmit: String => Unit): NativeKeyboardShowOptions = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[NativeKeyboardShowOptions]
  }
  @scala.inline
  implicit class NativeKeyboardShowOptionsOps[Self <: NativeKeyboardShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnSubmit(value: String => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAppearance(value: String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setAutoscrollElement(value: js.Any): Self = this.set("autoscrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscrollElement: Self = this.set("autoscrollElement", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCounterStyle(value: String): Self = this.set("counterStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterStyle: Self = this.set("counterStyle", js.undefined)
    @scala.inline
    def setKeepOpenAfterSubmit(value: Boolean): Self = this.set("keepOpenAfterSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepOpenAfterSubmit: Self = this.set("keepOpenAfterSubmit", js.undefined)
    @scala.inline
    def setLeftButton(value: LeftButtonOptions): Self = this.set("leftButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButton: Self = this.set("leftButton", js.undefined)
    @scala.inline
    def setMaxChars(value: Double): Self = this.set("maxChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChars: Self = this.set("maxChars", js.undefined)
    @scala.inline
    def setOnKeyboardDidHide(value: () => Unit): Self = this.set("onKeyboardDidHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyboardDidHide: Self = this.set("onKeyboardDidHide", js.undefined)
    @scala.inline
    def setOnKeyboardDidShow(value: () => Unit): Self = this.set("onKeyboardDidShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyboardDidShow: Self = this.set("onKeyboardDidShow", js.undefined)
    @scala.inline
    def setOnKeyboardWillHide(value: () => Unit): Self = this.set("onKeyboardWillHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyboardWillHide: Self = this.set("onKeyboardWillHide", js.undefined)
    @scala.inline
    def setOnKeyboardWillShow(value: () => Unit): Self = this.set("onKeyboardWillShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyboardWillShow: Self = this.set("onKeyboardWillShow", js.undefined)
    @scala.inline
    def setOnTextChanged(value: /* text */ String => Unit): Self = this.set("onTextChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTextChanged: Self = this.set("onTextChanged", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderColor(value: String): Self = this.set("placeholderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderColor: Self = this.set("placeholderColor", js.undefined)
    @scala.inline
    def setRightButton(value: ButtonOptions): Self = this.set("rightButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButton: Self = this.set("rightButton", js.undefined)
    @scala.inline
    def setScrollToBottomAfterMessengerShows(value: Boolean): Self = this.set("scrollToBottomAfterMessengerShows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToBottomAfterMessengerShows: Self = this.set("scrollToBottomAfterMessengerShows", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setShowKeyboard(value: Boolean): Self = this.set("showKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowKeyboard: Self = this.set("showKeyboard", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextViewBackgroundColor(value: String): Self = this.set("textViewBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextViewBackgroundColor: Self = this.set("textViewBackgroundColor", js.undefined)
    @scala.inline
    def setTextViewBorderColor(value: String): Self = this.set("textViewBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextViewBorderColor: Self = this.set("textViewBorderColor", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

