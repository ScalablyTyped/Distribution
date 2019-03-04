package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: java.lang.String
  @JSName("success")
  def success_MGetShareInfoOptions(res: baiduDashAppLib.Anon_EncryptedData): scala.Unit
}

object GetShareInfoOptions {
  @scala.inline
  def apply(
    shareTicket: java.lang.String,
    success: js.Function1[baiduDashAppLib.Anon_EncryptedData, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetShareInfoOptions]
  }
}

