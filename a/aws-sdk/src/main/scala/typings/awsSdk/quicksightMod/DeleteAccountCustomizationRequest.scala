package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountCustomizationRequest extends StObject {
  
  /**
    * The ID for the AWS account that you want to delete QuickSight customizations from in this AWS Region.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The QuickSight namespace that you're deleting the customizations from.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
}
object DeleteAccountCustomizationRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): DeleteAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit class DeleteAccountCustomizationRequestMutableBuilder[Self <: DeleteAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
