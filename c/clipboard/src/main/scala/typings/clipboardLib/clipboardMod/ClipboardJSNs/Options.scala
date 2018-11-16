package typings
package clipboardLib.clipboardMod.ClipboardJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Overwrites default command ('cut' or 'copy').
           * @param elem Current element
           */
  var action: js.UndefOr[
    js.Function1[
      /* elem */ stdLib.Element, 
      clipboardLib.clipboardLibStrings.cut | clipboardLib.clipboardLibStrings.copy
    ]
  ] = js.undefined
  /**
           * For use in Bootstrap Modals or with any
           * other library that changes the focus
           * you'll want to set the focused element
           * as the container value.
           */
  var container: js.UndefOr[stdLib.Element] = js.undefined
  /**
           * Overwrites default target input element.
           * @param elem Current element
           * @returns <input> element to use.
           */
  var target: js.UndefOr[js.Function1[/* elem */ stdLib.Element, stdLib.Element]] = js.undefined
  /**
           * Returns the explicit text to copy.
           * @param elem Current element
           * @returns Text to be copied.
           */
  var text: js.UndefOr[js.Function1[/* elem */ stdLib.Element, java.lang.String]] = js.undefined
}

