package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSequenceOptions extends js.Object {
  var temp: js.UndefOr[Boolean] = js.undefined
}

object CreateSequenceOptions {
  @scala.inline
  def apply(temp: js.UndefOr[Boolean] = js.undefined): CreateSequenceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(temp)) __obj.updateDynamic("temp")(temp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSequenceOptions]
  }
}

