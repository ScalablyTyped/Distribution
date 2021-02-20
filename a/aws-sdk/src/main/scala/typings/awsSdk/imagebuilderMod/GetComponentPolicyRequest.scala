package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
}
object GetComponentPolicyRequest {
  
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn): GetComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentPolicyRequest]
  }
  
  @scala.inline
  implicit class GetComponentPolicyRequestMutableBuilder[Self <: GetComponentPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
  }
}
