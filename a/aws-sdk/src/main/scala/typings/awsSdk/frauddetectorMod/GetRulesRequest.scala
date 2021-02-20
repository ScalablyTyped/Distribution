package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRulesRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  
  /**
    * The maximum number of rules to return for the request.
    */
  var maxResults: js.UndefOr[RulesMaxResults] = js.native
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.native
  
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.native
}
object GetRulesRequest {
  
  @scala.inline
  def apply(detectorId: identifier): GetRulesRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesRequest]
  }
  
  @scala.inline
  implicit class GetRulesRequestMutableBuilder[Self <: GetRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: RulesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersionUndefined: Self = StObject.set(x, "ruleVersion", js.undefined)
  }
}
