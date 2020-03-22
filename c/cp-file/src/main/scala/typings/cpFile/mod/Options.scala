package typings.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Overwrite existing destination file.
  		@default true
  		*/
  val overwrite: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

