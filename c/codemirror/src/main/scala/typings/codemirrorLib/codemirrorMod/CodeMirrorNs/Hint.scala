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

object Hint {
  @scala.inline
  def apply(
    text: java.lang.String,
    className: java.lang.String = null,
    displayText: java.lang.String = null,
    from: Position = null,
    hint: (/* cm */ Editor, /* data */ Hints, /* cur */ Hint) => scala.Unit = null,
    render: (/* element */ stdLib.HTMLLIElement, /* data */ Hints, /* cur */ Hint) => scala.Unit = null,
    to: Position = null
  ): Hint = {
    val __obj = js.Dynamic.literal(text = text)
    if (className != null) __obj.updateDynamic("className")(className)
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (from != null) __obj.updateDynamic("from")(from)
    if (hint != null) __obj.updateDynamic("hint")(js.Any.fromFunction3(hint))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Hint]
  }
}

