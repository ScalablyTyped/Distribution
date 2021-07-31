package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorResourcesSummary extends StObject {
  
  /**
    * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
    */
  var resourcesFlagged: Long
  
  /**
    * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
    */
  var resourcesIgnored: Long
  
  /**
    * The number of AWS resources that were analyzed by the Trusted Advisor check.
    */
  var resourcesProcessed: Long
  
  /**
    * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
    */
  var resourcesSuppressed: Long
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
  implicit class TrustedAdvisorResourcesSummaryMutableBuilder[Self <: TrustedAdvisorResourcesSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcesFlagged(value: Long): Self = StObject.set(x, "resourcesFlagged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesIgnored(value: Long): Self = StObject.set(x, "resourcesIgnored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesProcessed(value: Long): Self = StObject.set(x, "resourcesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesSuppressed(value: Long): Self = StObject.set(x, "resourcesSuppressed", value.asInstanceOf[js.Any])
  }
}
