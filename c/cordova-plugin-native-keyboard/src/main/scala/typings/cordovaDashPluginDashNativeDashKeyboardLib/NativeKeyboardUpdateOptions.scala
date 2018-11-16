package typings
package cordovaDashPluginDashNativeDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NativeKeyboardUpdateOptions extends js.Object {
  /**
       * Position the cursor anywhere in the text range. Defaults to the end of the text.
       */
  var caretIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * If false or omitted no changes to the keyboard state are made.
       */
  var showKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Replace the messenger's text by this. The current text remains if omitted.
       */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

