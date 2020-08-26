package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSpecContent extends js.Object {
  /**
    *  The YAML-formatted or JSON-formatted revision string.   For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version, and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda function to the replacement version.   For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves traffic to the container, and more.   For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as BeforeInstall, during a deployment. 
    */
  var content: js.UndefOr[RawStringContent] = js.native
  /**
    *  The SHA256 hash value of the revision content. 
    */
  var sha256: js.UndefOr[RawStringSha256] = js.native
}

object AppSpecContent {
  @scala.inline
  def apply(): AppSpecContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSpecContent]
  }
  @scala.inline
  implicit class AppSpecContentOps[Self <: AppSpecContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: RawStringContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setSha256(value: RawStringSha256): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
  
}

