package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface used by showHint.js Codemirror add-on
    When completions aren't simple strings, they should be objects with the following properties: */

trait Hint extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayText: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[Position] = js.undefined
  /** Called if a completion is picked. If provided *you* are responsible for applying the completion */
  var hint: js.UndefOr[js.Function3[/* cm */ Editor, /* data */ Hints, /* cur */ Hint, scala.Unit]] = js.undefined
  var render: js.UndefOr[
    js.Function3[/* element */ stdLib.HTMLLIElement, /* data */ Hints, /* cur */ Hint, scala.Unit]
  ] = js.undefined
  var text: java.lang.String
  var to: js.UndefOr[Position] = js.undefined
}

