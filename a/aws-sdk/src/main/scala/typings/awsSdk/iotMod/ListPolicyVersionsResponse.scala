package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPolicyVersionsResponse extends StObject {
  
  /**
    * The policy versions.
    */
  var policyVersions: js.UndefOr[PolicyVersions] = js.native
}
object ListPolicyVersionsResponse {
  
  @scala.inline
  def apply(): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
  
  @scala.inline
  implicit class ListPolicyVersionsResponseMutableBuilder[Self <: ListPolicyVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyVersions(value: PolicyVersions): Self = StObject.set(x, "policyVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionsUndefined: Self = StObject.set(x, "policyVersions", js.undefined)
    
    @scala.inline
    def setPolicyVersionsVarargs(value: PolicyVersion*): Self = StObject.set(x, "policyVersions", js.Array(value :_*))
  }
}
