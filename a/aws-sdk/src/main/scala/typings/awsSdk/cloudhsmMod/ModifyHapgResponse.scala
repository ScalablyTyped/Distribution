package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HapgArn] = js.native
}

object ModifyHapgResponse {
  @scala.inline
  def apply(HapgArn: HapgArn = null): ModifyHapgResponse = {
    val __obj = js.Dynamic.literal()
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHapgResponse]
  }
}

