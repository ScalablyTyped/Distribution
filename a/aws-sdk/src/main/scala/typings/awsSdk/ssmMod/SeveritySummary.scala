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
    CriticalCount: Int | Double = null,
    HighCount: Int | Double = null,
    InformationalCount: Int | Double = null,
    LowCount: Int | Double = null,
    MediumCount: Int | Double = null,
    UnspecifiedCount: Int | Double = null
  ): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    if (CriticalCount != null) __obj.updateDynamic("CriticalCount")(CriticalCount.asInstanceOf[js.Any])
    if (HighCount != null) __obj.updateDynamic("HighCount")(HighCount.asInstanceOf[js.Any])
    if (InformationalCount != null) __obj.updateDynamic("InformationalCount")(InformationalCount.asInstanceOf[js.Any])
    if (LowCount != null) __obj.updateDynamic("LowCount")(LowCount.asInstanceOf[js.Any])
    if (MediumCount != null) __obj.updateDynamic("MediumCount")(MediumCount.asInstanceOf[js.Any])
    if (UnspecifiedCount != null) __obj.updateDynamic("UnspecifiedCount")(UnspecifiedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeveritySummary]
  }
}

