package typings.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryServiceOptions extends js.Object {
  var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.undefined
  var uuid: String
}

object PrimaryServiceOptions {
  @scala.inline
  def apply(uuid: String, characteristics: js.UndefOr[Null | js.Array[Characteristic]] = js.undefined): PrimaryServiceOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(characteristics)) __obj.updateDynamic("characteristics")(characteristics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryServiceOptions]
  }
}

