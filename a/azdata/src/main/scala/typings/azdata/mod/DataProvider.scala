package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends js.Object {
  var handle: js.UndefOr[Double] = js.undefined
  val providerId: String
}

object DataProvider {
  @scala.inline
  def apply(providerId: String, handle: js.UndefOr[Double] = js.undefined): DataProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider]
  }
}

