package typings.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyEnforcedException
  extends ServiceException[PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
}

object PolicyEnforcedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PolicyEnforcedExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException,
    stack: String = null
  ): PolicyEnforcedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEnforcedException]
  }
}

