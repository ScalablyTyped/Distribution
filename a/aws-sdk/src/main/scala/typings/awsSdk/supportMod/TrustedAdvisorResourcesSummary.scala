package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorResourcesSummary extends js.Object {
  /**
    * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
    */
  var resourcesFlagged: Long = js.native
  /**
    * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
    */
  var resourcesIgnored: Long = js.native
  /**
    * The number of AWS resources that were analyzed by the Trusted Advisor check.
    */
  var resourcesProcessed: Long = js.native
  /**
    * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
    */
  var resourcesSuppressed: Long = js.native
}

object TrustedAdvisorResourcesSummary {
  @scala.inline
  def apply(
    resourcesFlagged: Long,
    resourcesIgnored: Long,
    resourcesProcessed: Long,
    resourcesSuppressed: Long
  ): TrustedAdvisorResourcesSummary = {
    val __obj = js.Dynamic.literal(resourcesFlagged = resourcesFlagged.asInstanceOf[js.Any], resourcesIgnored = resourcesIgnored.asInstanceOf[js.Any], resourcesProcessed = resourcesProcessed.asInstanceOf[js.Any], resourcesSuppressed = resourcesSuppressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourcesSummary]
  }
  @scala.inline
  implicit class TrustedAdvisorResourcesSummaryOps[Self <: TrustedAdvisorResourcesSummary] (val x: Self) extends AnyVal {
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
    def setResourcesFlagged(value: Long): Self = this.set("resourcesFlagged", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesIgnored(value: Long): Self = this.set("resourcesIgnored", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesProcessed(value: Long): Self = this.set("resourcesProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesSuppressed(value: Long): Self = this.set("resourcesSuppressed", value.asInstanceOf[js.Any])
  }
  
}

