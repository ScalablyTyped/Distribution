package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountCustomizationResponse extends StObject {
  
  /**
    * The QuickSight customizations that exist in the current AWS Region. 
    */
  var AccountCustomization: js.UndefOr[typings.awsSdk.quicksightMod.AccountCustomization] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the customization that's associated with this AWS account.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The ID for the AWS account that you're describing.
    */
  var AwsAccountId: js.UndefOr[typings.awsSdk.quicksightMod.AwsAccountId] = js.undefined
  
  /**
    * The QuickSight namespace that you're describing. 
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeAccountCustomizationResponse {
  
  inline def apply(): DescribeAccountCustomizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountCustomizationResponse]
  }
  
  extension [Self <: DescribeAccountCustomizationResponse](x: Self) {
    
    inline def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    inline def setAccountCustomizationUndefined: Self = StObject.set(x, "AccountCustomization", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
