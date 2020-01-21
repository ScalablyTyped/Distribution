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
}

