package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSync extends js.Object {
  /**
    * List of SNS platform application ARNs that could be used by clients.
    */
  var ApplicationArns: js.UndefOr[ApplicationArnList] = js.native
  /**
    * A role configured to allow Cognito to call SNS on behalf of the developer.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.native
}

object PushSync {
  @scala.inline
  def apply(ApplicationArns: ApplicationArnList = null, RoleArn: AssumeRoleArn = null): PushSync = {
    val __obj = js.Dynamic.literal()
    if (ApplicationArns != null) __obj.updateDynamic("ApplicationArns")(ApplicationArns.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSync]
  }
}

