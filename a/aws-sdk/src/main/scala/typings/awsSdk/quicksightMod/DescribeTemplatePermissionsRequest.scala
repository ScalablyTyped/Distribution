package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplatePermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the template that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId
}
object DescribeTemplatePermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DescribeTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplatePermissionsRequest]
  }
  
  extension [Self <: DescribeTemplatePermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
