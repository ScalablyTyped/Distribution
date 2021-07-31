package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The hash value returned when this policy was set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
  
  /**
    * The ARN of the AWS Glue resource for the resource policy to be deleted.
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
}
object DeleteResourcePolicyRequest {
  
  @scala.inline
  def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteResourcePolicyRequestMutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyHashCondition(value: HashString): Self = StObject.set(x, "PolicyHashCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyHashConditionUndefined: Self = StObject.set(x, "PolicyHashCondition", js.undefined)
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
