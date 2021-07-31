package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorCheckResult extends StObject {
  
  /**
    * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
    */
  var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
  
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String
  
  /**
    * The details about each resource listed in the check result.
    */
  var flaggedResources: TrustedAdvisorResourceDetailList
  
  var resourcesSummary: TrustedAdvisorResourcesSummary
  
  /**
    * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
    */
  var status: String
  
  /**
    * The time of the last refresh of the check.
    */
  var timestamp: String
}
object TrustedAdvisorCheckResult {
  
  @scala.inline
  def apply(
    categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
    checkId: String,
    flaggedResources: TrustedAdvisorResourceDetailList,
    resourcesSummary: TrustedAdvisorResourcesSummary,
    status: String,
    timestamp: String
  ): TrustedAdvisorCheckResult = {
    val __obj = js.Dynamic.literal(categorySpecificSummary = categorySpecificSummary.asInstanceOf[js.Any], checkId = checkId.asInstanceOf[js.Any], flaggedResources = flaggedResources.asInstanceOf[js.Any], resourcesSummary = resourcesSummary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckResult]
  }
  
  @scala.inline
  implicit class TrustedAdvisorCheckResultMutableBuilder[Self <: TrustedAdvisorCheckResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategorySpecificSummary(value: TrustedAdvisorCategorySpecificSummary): Self = StObject.set(x, "categorySpecificSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckId(value: String): Self = StObject.set(x, "checkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlaggedResources(value: TrustedAdvisorResourceDetailList): Self = StObject.set(x, "flaggedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlaggedResourcesVarargs(value: TrustedAdvisorResourceDetail*): Self = StObject.set(x, "flaggedResources", js.Array(value :_*))
    
    @scala.inline
    def setResourcesSummary(value: TrustedAdvisorResourcesSummary): Self = StObject.set(x, "resourcesSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
