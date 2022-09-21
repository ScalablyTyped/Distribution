package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorResourcesSummary extends StObject {
  
  /**
    * The number of Amazon Web Services resources that were flagged (listed) by the Trusted Advisor check.
    */
  var resourcesFlagged: Long
  
  /**
    * The number of Amazon Web Services resources ignored by Trusted Advisor because information was unavailable.
    */
  var resourcesIgnored: Long
  
  /**
    * The number of Amazon Web Services resources that were analyzed by the Trusted Advisor check.
    */
  var resourcesProcessed: Long
  
  /**
    * The number of Amazon Web Services resources ignored by Trusted Advisor because they were marked as suppressed by the user.
    */
  var resourcesSuppressed: Long
}
object TrustedAdvisorResourcesSummary {
  
  inline def apply(
    resourcesFlagged: Long,
    resourcesIgnored: Long,
    resourcesProcessed: Long,
    resourcesSuppressed: Long
  ): TrustedAdvisorResourcesSummary = {
    val __obj = js.Dynamic.literal(resourcesFlagged = resourcesFlagged.asInstanceOf[js.Any], resourcesIgnored = resourcesIgnored.asInstanceOf[js.Any], resourcesProcessed = resourcesProcessed.asInstanceOf[js.Any], resourcesSuppressed = resourcesSuppressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourcesSummary]
  }
  
  extension [Self <: TrustedAdvisorResourcesSummary](x: Self) {
    
    inline def setResourcesFlagged(value: Long): Self = StObject.set(x, "resourcesFlagged", value.asInstanceOf[js.Any])
    
    inline def setResourcesIgnored(value: Long): Self = StObject.set(x, "resourcesIgnored", value.asInstanceOf[js.Any])
    
    inline def setResourcesProcessed(value: Long): Self = StObject.set(x, "resourcesProcessed", value.asInstanceOf[js.Any])
    
    inline def setResourcesSuppressed(value: Long): Self = StObject.set(x, "resourcesSuppressed", value.asInstanceOf[js.Any])
  }
}
