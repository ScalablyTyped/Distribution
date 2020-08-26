package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyInput extends js.Object {
  /**
    *  A JSON-formatted resource policy. For more information, see Sharing a Project and Sharing a Report Group in the AWS CodeBuild User Guide. 
    */
  var policy: NonEmptyString = js.native
  /**
    *  The ARN of the Project or ReportGroup resource you want to associate with a resource policy. 
    */
  var resourceArn: NonEmptyString = js.native
}

object PutResourcePolicyInput {
  @scala.inline
  def apply(policy: NonEmptyString, resourceArn: NonEmptyString): PutResourcePolicyInput = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyInput]
  }
  @scala.inline
  implicit class PutResourcePolicyInputOps[Self <: PutResourcePolicyInput] (val x: Self) extends AnyVal {
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
    def setPolicy(value: NonEmptyString): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: NonEmptyString): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
  }
  
}

