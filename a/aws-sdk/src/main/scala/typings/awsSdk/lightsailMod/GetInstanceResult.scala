package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the specified instance.
    */
  var instance: js.UndefOr[Instance] = js.native
}

object GetInstanceResult {
  @scala.inline
  def apply(instance: Instance = null): GetInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResult]
  }
}

