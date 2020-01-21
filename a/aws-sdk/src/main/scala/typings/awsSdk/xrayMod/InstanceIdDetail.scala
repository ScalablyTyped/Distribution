package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIdDetail extends js.Object {
  /**
    * The ID of a corresponding EC2 instance.
    */
  var Id: js.UndefOr[String] = js.native
}

object InstanceIdDetail {
  @scala.inline
  def apply(Id: String = null): InstanceIdDetail = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceIdDetail]
  }
}

