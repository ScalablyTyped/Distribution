package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplateAliasRequest extends StObject {
  
  /**
    * The name of the template alias that you want to describe. If you name a specific alias, you describe the version that the alias points to. You can specify the latest version of the template by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to templates.
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName
  
  /**
    * The ID of the AWS account that contains the template alias that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId
}
object DescribeTemplateAliasRequest {
  
  @scala.inline
  def apply(AliasName: AliasName, AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DescribeTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplateAliasRequest]
  }
  
  @scala.inline
  implicit class DescribeTemplateAliasRequestMutableBuilder[Self <: DescribeTemplateAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
