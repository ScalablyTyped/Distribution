package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The ARN of the AWS Glue resource for the resource policy to be retrieved. For more information about AWS Glue resource ARNs, see the AWS Glue ARN string pattern 
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.native
}
object GetResourcePolicyRequest {
  
  @scala.inline
  def apply(): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class GetResourcePolicyRequestMutableBuilder[Self <: GetResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
