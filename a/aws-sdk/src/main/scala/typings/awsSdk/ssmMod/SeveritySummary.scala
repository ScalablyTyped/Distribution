package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeveritySummary extends js.Object {
  /**
    * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.native
}

object SeveritySummary {
  @scala.inline
  def apply(
    CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  ): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CriticalCount)) __obj.updateDynamic("CriticalCount")(CriticalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HighCount)) __obj.updateDynamic("HighCount")(HighCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InformationalCount)) __obj.updateDynamic("InformationalCount")(InformationalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LowCount)) __obj.updateDynamic("LowCount")(LowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MediumCount)) __obj.updateDynamic("MediumCount")(MediumCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UnspecifiedCount)) __obj.updateDynamic("UnspecifiedCount")(UnspecifiedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeveritySummary]
  }
}

