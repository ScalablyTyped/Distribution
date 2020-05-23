package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionRunAsConfig extends js.Object {
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[integer] = js.native
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[integer] = js.native
}

object FunctionRunAsConfig {
  @scala.inline
  def apply(Gid: js.UndefOr[integer] = js.undefined, Uid: js.UndefOr[integer] = js.undefined): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Gid)) __obj.updateDynamic("Gid")(Gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Uid)) __obj.updateDynamic("Uid")(Uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
}

