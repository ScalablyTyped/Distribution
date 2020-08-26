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
  def apply(Arn: arnType): GenerateServiceLastAccessedDetailsRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsRequest]
  }
  @scala.inline
  implicit class GenerateServiceLastAccessedDetailsRequestOps[Self <: GenerateServiceLastAccessedDetailsRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGranularity(value: AccessAdvisorUsageGranularityType): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("Granularity", js.undefined)
  }
  
}

