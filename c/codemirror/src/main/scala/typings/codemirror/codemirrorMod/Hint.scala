package typings.codemirror.codemirrorMod

import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface used by showHint.js Codemirror add-on
  When completions aren't simple strings, they should be objects with the following properties: */
trait Hint extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var displayText: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Position] = js.undefined
  /** Called if a completion is picked. If provided *you* are responsible for applying the completion */
  var hint: js.UndefOr[js.Function3[/* cm */ Editor, /* data */ Hints, /* cur */ Hint, Unit]] = js.undefined
  var render: js.UndefOr[
    js.Function3[/* element */ HTMLLIElement, /* data */ Hints, /* cur */ Hint, Unit]
  ] = js.undefined
  var text: String
  var to: js.UndefOr[Position] = js.undefined
}

object Hint {
  @scala.inline
  def apply(
    text: String,
    className: String = null,
    displayText: String = null,
    from: Position = null,
    hint: (/* cm */ Editor, /* data */ Hints, /* cur */ Hint) => Unit = null,
    render: (/* element */ HTMLLIElement, /* data */ Hints, /* cur */ Hint) => Unit = null,
    to: Position = null
  ): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(js.Any.fromFunction3(hint))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
}

