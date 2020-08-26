package typings.decomment.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Takes either a single or an array of regular expressions to match against.
    * All matching blocks are then skipped, as well as any comment-like content inside them
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  /**
    * keep special multi-line comments that begin with:
    * - <!--[if - for conditional comments in HTML
    * - / *! - for everything else (other than HTML)
    * @default false - remove all multi-line comments
    */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * replace comment blocks with white spaces where needed,
    * in order to preserve the original line + column position of every code element.
    * @default false - remove comment blocks entirely
    */
  var space: js.UndefOr[Boolean] = js.native
  /**
    * remove empty lines that follow removed full-line comments
    * @defualt false - do not trim comments
    */
  var trim: js.UndefOr[Boolean] = js.native
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
    def setIgnoreVarargs(value: RegExp*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: RegExp | js.Array[RegExp]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setSpace(value: Boolean): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

