package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyOutput extends StObject {
  
  /**
    *  The resource policy for the resource identified by the input ARN parameter. 
    */
  var policy: js.UndefOr[NonEmptyString] = js.native
}
object GetResourcePolicyOutput {
  
  @scala.inline
  def apply(): GetResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyOutput]
  }
  
  @scala.inline
  implicit class GetResourcePolicyOutputMutableBuilder[Self <: GetResourcePolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: NonEmptyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
