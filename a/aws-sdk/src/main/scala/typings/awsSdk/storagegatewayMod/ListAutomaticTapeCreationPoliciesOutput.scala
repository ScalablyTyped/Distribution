package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAutomaticTapeCreationPoliciesOutput extends StObject {
  
  /**
    * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape creation rules and the gateway that is using the policies.
    */
  var AutomaticTapeCreationPolicyInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationPolicyInfos] = js.native
}
object ListAutomaticTapeCreationPoliciesOutput {
  
  @scala.inline
  def apply(): ListAutomaticTapeCreationPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutomaticTapeCreationPoliciesOutput]
  }
  
  @scala.inline
  implicit class ListAutomaticTapeCreationPoliciesOutputMutableBuilder[Self <: ListAutomaticTapeCreationPoliciesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticTapeCreationPolicyInfos(value: AutomaticTapeCreationPolicyInfos): Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticTapeCreationPolicyInfosUndefined: Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", js.undefined)
    
    @scala.inline
    def setAutomaticTapeCreationPolicyInfosVarargs(value: AutomaticTapeCreationPolicyInfo*): Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", js.Array(value :_*))
  }
}
