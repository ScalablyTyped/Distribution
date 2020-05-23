package typings.cliProgress.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var eta: Double
  var maxWidth: Double
  var progress: Double
  var startTime: Date
  var total: Double
  var value: Double
}

object Params {
  @scala.inline
  def apply(eta: Double, maxWidth: Double, progress: Double, startTime: Date, total: Double, value: Double): Params = {
    val __obj = js.Dynamic.literal(eta = eta.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

