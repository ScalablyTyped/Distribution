package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageRecipePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that this policy should be applied to. 
    */
  var imageRecipeArn: ImageRecipeArn
  
  /**
    * The policy to apply. 
    */
  var policy: ResourcePolicyDocument
}
object PutImageRecipePolicyRequest {
  
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn, policy: ResourcePolicyDocument): PutImageRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRecipePolicyRequest]
  }
  
  @scala.inline
  implicit class PutImageRecipePolicyRequestMutableBuilder[Self <: PutImageRecipePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
