package typings.clipboard.mod

import typings.clipboard.clipboardStrings.copy
import typings.clipboard.clipboardStrings.cut
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Overwrites default command ('cut' or 'copy').
    * @param elem Current element
    */
  var action: js.UndefOr[js.Function1[/* elem */ Element, cut | copy]] = js.native
  /**
    * For use in Bootstrap Modals or with any
    * other library that changes the focus
    * you'll want to set the focused element
    * as the container value.
    */
  var container: js.UndefOr[Element] = js.native
  /**
    * Overwrites default target input element.
    * @param elem Current element
    * @returns <input> element to use.
    */
  var target: js.UndefOr[js.Function1[/* elem */ Element, Element]] = js.native
  /**
    * Returns the explicit text to copy.
    * @param elem Current element
    * @returns Text to be copied.
    */
  var text: js.UndefOr[js.Function1[/* elem */ Element, String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAction(value: /* elem */ Element => cut | copy): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setTarget(value: /* elem */ Element => Element): Self = this.set("target", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setText(value: /* elem */ Element => String): Self = this.set("text", js.Any.fromFunction1(value))
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

