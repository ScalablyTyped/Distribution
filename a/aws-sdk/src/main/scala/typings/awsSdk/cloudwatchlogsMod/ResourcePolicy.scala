package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicy extends StObject {
  
  /**
    * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastUpdatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The details of the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  
  /**
    * The name of the resource policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}
object ResourcePolicy {
  
  @scala.inline
  def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicyMutableBuilder[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
