package typings.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedException
  extends ServiceException[PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException = js.native
}

object PolicyEnforcedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PolicyEnforcedExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
  ): PolicyEnforcedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEnforcedException]
  }
  @scala.inline
  implicit class PolicyEnforcedExceptionOps[Self <: PolicyEnforcedException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

