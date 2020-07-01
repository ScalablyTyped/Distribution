package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateServiceLastAccessedDetailsRequest extends js.Object {
  /**
    * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the resource was last used in an attempt to access an AWS service.
    */
  var Arn: arnType = js.native
  /**
    * The level of detail that you want to generate. You can specify whether you want to generate information about the last attempt to access services or actions. If you specify service-level granularity, this operation generates only service data. If you specify action-level granularity, it generates service and action data. If you don't include this optional parameter, the operation generates service data.
    */
  var Granularity: js.UndefOr[AccessAdvisorUsageGranularityType] = js.native
}

object GenerateServiceLastAccessedDetailsRequest {
  @scala.inline
  def apply(Arn: arnType, Granularity: AccessAdvisorUsageGranularityType = null): GenerateServiceLastAccessedDetailsRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsRequest]
  }
}

