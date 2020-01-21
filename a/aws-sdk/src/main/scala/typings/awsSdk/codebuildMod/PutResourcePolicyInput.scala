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
}

