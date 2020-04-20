package typings.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpts extends js.Object {
  var opts: AnonRoot
}

object AnonOpts {
  @scala.inline
  def apply(opts: AnonRoot): AnonOpts = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpts]
  }
}

