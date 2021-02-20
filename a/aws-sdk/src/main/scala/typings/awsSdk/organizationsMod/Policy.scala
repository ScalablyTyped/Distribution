package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends StObject {
  
  /**
    * The text content of the policy.
    */
  var Content: js.UndefOr[PolicyContent] = js.native
  
  /**
    * A structure that contains additional details about the policy.
    */
  var PolicySummary: js.UndefOr[typings.awsSdk.organizationsMod.PolicySummary] = js.native
}
object Policy {
  
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: PolicyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setPolicySummary(value: PolicySummary): Self = StObject.set(x, "PolicySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicySummaryUndefined: Self = StObject.set(x, "PolicySummary", js.undefined)
  }
}
