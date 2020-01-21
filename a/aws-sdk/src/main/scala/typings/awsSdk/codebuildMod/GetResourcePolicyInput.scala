package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyInput extends js.Object {
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString = js.native
}

object GetResourcePolicyInput {
  @scala.inline
  def apply(resourceArn: NonEmptyString): GetResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResourcePolicyInput]
  }
}

