package typings.atAwsDashSdkClientDashGlacierDashNode.typesPolicyEnforcedExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedException
  extends ServiceException[_PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.PolicyEnforcedException = js.native
}

