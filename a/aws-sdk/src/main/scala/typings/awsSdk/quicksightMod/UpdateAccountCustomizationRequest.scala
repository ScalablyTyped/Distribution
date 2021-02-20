package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountCustomizationRequest extends StObject {
  
  /**
    * The QuickSight customizations you're updating in the current AWS Region. 
    */
  var AccountCustomization: typings.awsSdk.quicksightMod.AccountCustomization = js.native
  
  /**
    * The ID for the AWS account that you want to update QuickSight customizations for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The namespace that you want to update QuickSight customizations for.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
}
object UpdateAccountCustomizationRequest {
  
  @scala.inline
  def apply(AccountCustomization: AccountCustomization, AwsAccountId: AwsAccountId): UpdateAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AccountCustomization = AccountCustomization.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountCustomizationRequestMutableBuilder[Self <: UpdateAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
