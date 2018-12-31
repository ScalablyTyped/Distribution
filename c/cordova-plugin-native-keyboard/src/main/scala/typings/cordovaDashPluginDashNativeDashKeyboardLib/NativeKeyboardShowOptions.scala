package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeKeyboardShowOptions extends js.Object {
  /**
    * Makes the messenger bar slide in from the bottom.
    *
    * Default: false
    */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options are: "light", "dark".
    *
    * Default: "default"
    */
  var appearance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * DOM element, which should be scrolled automatically
    */
  var autoscrollElement: js.UndefOr[js.Any] = js.undefined
  /**
    * The background color of the messenger bar.
    *
    * Default: #F6F6F6
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options are: "none", "split", "countdown", "countdownreversed".
    * Note that if maxChars is set, "none" will still show a counter.
    *
    * Default: "none"
    */
  var counterStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean value indicating if the keyboard should be kept open after submitting the entered
    * text
    *
    * Default: false
    */
  var keepOpenAfterSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The left button of the messenger bar
    */
  var leftButton: js.UndefOr[LeftButtonOptions] = js.undefined
  /**
    * Maximum amount of chars that can be entered
    */
  var maxChars: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback function which is being executed as soon as the keyboard did hide
    */
  var onKeyboardDidHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function which is being executed as soon as the keyboard did show
    */
  var onKeyboardDidShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function which is being executed as soon as the keyboard will hide
    */
  var onKeyboardWillHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function which is being executed as soon as the keyboard will show
    */
  var onKeyboardWillShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function which is being executed as soon as the entered text changes. Will
    * return the new text
    */
  var onTextChanged: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * A placeholder which will be in the messenger bar, when opening and the input field is
    * empty
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the placeholder.
    *
    * Default: #ccc
    */
  var placeholderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The right button of the messenger bar
    */
  var rightButton: js.UndefOr[ButtonOptions] = js.undefined
  /**
    * Boolean value indicating if the content should be scrolled to the end after the messenger is
    * shown
    */
  var scrollToBottomAfterMessengerShows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables things like the Emoji keyboard and the Predicive text entry bar
    *
    * Default: false
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Open the keyboard when showing the messenger.
    *
    * Default: false
    */
  var showKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A text which will be in the messenger bar, when opening
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the typed text in HEX.
    *
    * Default: #444
    */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the textview. Looks nicest on Android
    * if it's the same color as the backgroundColor property.
    *
    * Default: #F6F6F6
    */
  var textViewBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The border color of the textview.
    *
    * Default: #666666
    */
  var textViewBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options are: "default", "decimalpad", "phonepad", "numberpad", "namephonepad",
    * "number", "email", "twitter", "url", "alphabet", "search", "ascii"
    *
    * Default: "default"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function, which is being called as soon as the user submits
    */
  def onSubmit(text: java.lang.String): scala.Unit
}

