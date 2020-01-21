package typings.cosmiconfig.readFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var throwNotFound: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(throwNotFound: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(throwNotFound)) __obj.updateDynamic("throwNotFound")(throwNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

