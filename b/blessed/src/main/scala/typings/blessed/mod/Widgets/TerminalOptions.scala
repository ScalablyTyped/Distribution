package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.block
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.underline
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalOptions extends BoxOptions {
  /**
    * args for shell.
    */
  var args: js.UndefOr[js.Any] = js.native
  /**
    * can be line, underline, and block.
    */
  var cursor: js.UndefOr[line | underline | block] = js.native
  /**
    * Object for process env.
    */
  var env: js.UndefOr[js.Any] = js.native
  /**
    * handler for input data.
    */
  var handler: js.UndefOr[js.Function1[/* userInput */ Buffer, Unit]] = js.native
  /**
    * name of shell. $SHELL by default.
    */
  var shell: js.UndefOr[String] = js.native
  var terminal: js.UndefOr[String] = js.native
}

object TerminalOptions {
  @scala.inline
  def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  @scala.inline
  implicit class TerminalOptionsOps[Self <: TerminalOptions] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setCursor(value: line | underline | block): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setHandler(value: /* userInput */ Buffer => Unit): Self = this.set("handler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setTerminal(value: String): Self = this.set("terminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
  }
  
}

