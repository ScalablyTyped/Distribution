package typings.decomment.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Takes either a single or an array of regular expressions to match against.
    * All matching blocks are then skipped, as well as any comment-like content inside them
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  /**
    * keep special multi-line comments that begin with:
    * - <!--[if - for conditional comments in HTML
    * - / *! - for everything else (other than HTML)
    * @default false - remove all multi-line comments
    */
  var safe: js.UndefOr[Boolean] = js.undefined
  /**
    * replace comment blocks with white spaces where needed,
    * in order to preserve the original line + column position of every code element.
    * @default false - remove comment blocks entirely
    */
  var space: js.UndefOr[Boolean] = js.undefined
  /**
    * remove empty lines that follow removed full-line comments
    * @defualt false - do not trim comments
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ignore: RegExp | js.Array[RegExp] = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    space: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

