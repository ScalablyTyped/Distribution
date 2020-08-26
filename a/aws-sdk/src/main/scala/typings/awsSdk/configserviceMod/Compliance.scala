package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compliance extends js.Object {
  /**
    * The number of AWS resources or AWS Config rules that cause a result of NON_COMPLIANT, up to a maximum number.
    */
  var ComplianceContributorCount: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceContributorCount] = js.native
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant. A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules. A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any of these resources do not comply. AWS Config returns the INSUFFICIENT_DATA value when no evaluation results are available for the AWS resource or AWS Config rule. For the Compliance data type, AWS Config supports only COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA values. AWS Config does not support the NOT_APPLICABLE value for the Compliance data type.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.native
}

object Compliance {
  @scala.inline
  def apply(): Compliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compliance]
  }
  @scala.inline
  implicit class ComplianceOps[Self <: Compliance] (val x: Self) extends AnyVal {
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
    def setComplianceContributorCount(value: ComplianceContributorCount): Self = this.set("ComplianceContributorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceContributorCount: Self = this.set("ComplianceContributorCount", js.undefined)
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
  }
  
}

