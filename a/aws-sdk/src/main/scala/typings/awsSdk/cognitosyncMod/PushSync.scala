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
  def apply(): PushSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSync]
  }
  @scala.inline
  implicit class PushSyncOps[Self <: PushSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationArnsVarargs(value: ApplicationArn*): Self = this.set("ApplicationArns", js.Array(value :_*))
    @scala.inline
    def setApplicationArns(value: ApplicationArnList): Self = this.set("ApplicationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationArns: Self = this.set("ApplicationArns", js.undefined)
    @scala.inline
    def setRoleArn(value: AssumeRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

