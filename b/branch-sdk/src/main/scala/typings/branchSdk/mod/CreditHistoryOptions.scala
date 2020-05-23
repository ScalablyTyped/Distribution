package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditHistoryOptions extends js.Object {
  var begin_after_id: js.UndefOr[String] = js.undefined
  var bucket: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object CreditHistoryOptions {
  @scala.inline
  def apply(begin_after_id: String = null, bucket: String = null, length: js.UndefOr[Double] = js.undefined): CreditHistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (begin_after_id != null) __obj.updateDynamic("begin_after_id")(begin_after_id.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditHistoryOptions]
  }
}

