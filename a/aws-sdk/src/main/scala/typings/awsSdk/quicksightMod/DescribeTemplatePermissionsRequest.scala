package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplatePermissionsRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the template that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId
}
object DescribeTemplatePermissionsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DescribeTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplatePermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeTemplatePermissionsRequestMutableBuilder[Self <: DescribeTemplatePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
