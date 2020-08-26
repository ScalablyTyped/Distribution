package typings.codemirror.mod

import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface used by showHint.js Codemirror add-on
  When completions aren't simple strings, they should be objects with the following properties: */
@js.native
trait Hint extends js.Object {
  var className: js.UndefOr[String] = js.native
  var displayText: js.UndefOr[String] = js.native
  var from: js.UndefOr[Position] = js.native
  /** Called if a completion is picked. If provided *you* are responsible for applying the completion */
  var hint: js.UndefOr[js.Function3[/* cm */ Editor, /* data */ Hints, /* cur */ this.type, Unit]] = js.native
  var render: js.UndefOr[
    js.Function3[/* element */ HTMLLIElement, /* data */ Hints, /* cur */ this.type, Unit]
  ] = js.native
  var text: String = js.native
  var to: js.UndefOr[Position] = js.native
}

object Hint {
  @scala.inline
  def apply(text: String): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    @scala.inline
    def setFrom(value: Position): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHint(value: (/* cm */ Editor, /* data */ Hints, Hint) => Unit): Self = this.set("hint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setRender(value: (/* element */ HTMLLIElement, /* data */ Hints, Hint) => Unit): Self = this.set("render", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setTo(value: Position): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

