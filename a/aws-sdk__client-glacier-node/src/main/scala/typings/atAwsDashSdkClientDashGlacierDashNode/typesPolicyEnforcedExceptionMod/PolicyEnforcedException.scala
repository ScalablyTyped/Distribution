package typings.atAwsDashSdkClientDashGlacierDashNode.typesPolicyEnforcedExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyEnforcedException
  extends ServiceException[_PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.PolicyEnforcedException
}

object PolicyEnforcedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PolicyEnforcedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.PolicyEnforcedException,
    stack: String = null
  ): PolicyEnforcedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEnforcedException]
  }
}

