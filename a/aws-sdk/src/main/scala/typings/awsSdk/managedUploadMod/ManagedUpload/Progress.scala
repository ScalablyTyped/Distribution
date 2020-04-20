package typings.awsSdk.managedUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  var loaded: Double = js.native
  var total: Double = js.native
}

object Progress {
  @scala.inline
  def apply(loaded: Double, total: Double): Progress = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

