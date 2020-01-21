package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeKeyboardShowOptions extends js.Object {
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
  /**
    * Callback function, which is being called as soon as the user submits
    */
  def onSubmit(text: String): Unit
}

object NativeKeyboardShowOptions {
  @scala.inline
  def apply(
    onSubmit: String => Unit,
    animated: js.UndefOr[Boolean] = js.undefined,
    appearance: String = null,
    autoscrollElement: js.Any = null,
    backgroundColor: String = null,
    counterStyle: String = null,
    keepOpenAfterSubmit: js.UndefOr[Boolean] = js.undefined,
    leftButton: LeftButtonOptions = null,
    maxChars: Int | Double = null,
    onKeyboardDidHide: () => Unit = null,
    onKeyboardDidShow: () => Unit = null,
    onKeyboardWillHide: () => Unit = null,
    onKeyboardWillShow: () => Unit = null,
    onTextChanged: /* text */ String => Unit = null,
    placeholder: String = null,
    placeholderColor: String = null,
    rightButton: ButtonOptions = null,
    scrollToBottomAfterMessengerShows: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    showKeyboard: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textColor: String = null,
    textViewBackgroundColor: String = null,
    textViewBorderColor: String = null,
    `type`: String = null
  ): NativeKeyboardShowOptions = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (autoscrollElement != null) __obj.updateDynamic("autoscrollElement")(autoscrollElement.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (counterStyle != null) __obj.updateDynamic("counterStyle")(counterStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpenAfterSubmit)) __obj.updateDynamic("keepOpenAfterSubmit")(keepOpenAfterSubmit.asInstanceOf[js.Any])
    if (leftButton != null) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (maxChars != null) __obj.updateDynamic("maxChars")(maxChars.asInstanceOf[js.Any])
    if (onKeyboardDidHide != null) __obj.updateDynamic("onKeyboardDidHide")(js.Any.fromFunction0(onKeyboardDidHide))
    if (onKeyboardDidShow != null) __obj.updateDynamic("onKeyboardDidShow")(js.Any.fromFunction0(onKeyboardDidShow))
    if (onKeyboardWillHide != null) __obj.updateDynamic("onKeyboardWillHide")(js.Any.fromFunction0(onKeyboardWillHide))
    if (onKeyboardWillShow != null) __obj.updateDynamic("onKeyboardWillShow")(js.Any.fromFunction0(onKeyboardWillShow))
    if (onTextChanged != null) __obj.updateDynamic("onTextChanged")(js.Any.fromFunction1(onTextChanged))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor.asInstanceOf[js.Any])
    if (rightButton != null) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToBottomAfterMessengerShows)) __obj.updateDynamic("scrollToBottomAfterMessengerShows")(scrollToBottomAfterMessengerShows.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(showKeyboard)) __obj.updateDynamic("showKeyboard")(showKeyboard.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textViewBackgroundColor != null) __obj.updateDynamic("textViewBackgroundColor")(textViewBackgroundColor.asInstanceOf[js.Any])
    if (textViewBorderColor != null) __obj.updateDynamic("textViewBorderColor")(textViewBorderColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeKeyboardShowOptions]
  }
}

