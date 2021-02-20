package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountCustomizationRequest extends StObject {
  
  /**
    * The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account and a QuickSight namespace.  For example, you can add a default theme by setting AccountCustomization to the midnight theme: "AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }. Or, you can add a custom theme by specifying "AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }. 
    */
  var AccountCustomization: typings.awsSdk.quicksightMod.AccountCustomization = js.native
  
  /**
    * The ID for the AWS account that you want to customize QuickSight for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The QuickSight namespace that you want to add customizations to.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
  
  /**
    * A list of the tags that you want to attach to this resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateAccountCustomizationRequest {
  
  @scala.inline
  def apply(AccountCustomization: AccountCustomization, AwsAccountId: AwsAccountId): CreateAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AccountCustomization = AccountCustomization.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit class CreateAccountCustomizationRequestMutableBuilder[Self <: CreateAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
