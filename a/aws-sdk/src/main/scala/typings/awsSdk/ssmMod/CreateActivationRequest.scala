package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActivationRequest extends StObject {
  
  /**
    * The name of the registered, managed instance as it will appear in the Systems Manager console or when you use the AWS command line tools to list Systems Manager resources.  Do not enter personally identifiable information in this field. 
    */
  var DefaultInstanceName: js.UndefOr[typings.awsSdk.ssmMod.DefaultInstanceName] = js.undefined
  
  /**
    * A user-defined description of the resource that you want to register with Systems Manager.   Do not enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ActivationDescription] = js.undefined
  
  /**
    * The date by which this activation request should expire. The default value is 24 hours.
    */
  var ExpirationDate: js.UndefOr[typings.awsSdk.ssmMod.ExpirationDate] = js.undefined
  
  /**
    * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance. This IAM role must provide AssumeRole permissions for the Systems Manager service principal ssm.amazonaws.com. For more information, see Create an IAM service role for a hybrid environment in the AWS Systems Manager User Guide.
    */
  var IamRole: typings.awsSdk.ssmMod.IamRole
  
  /**
    * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
    */
  var RegistrationLimit: js.UndefOr[typings.awsSdk.ssmMod.RegistrationLimit] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises servers or VMs.  You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how to add tags to your managed instances, see AddTagsToResource. For information about how to remove tags from your managed instances, see RemoveTagsFromResource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateActivationRequest {
  
  inline def apply(IamRole: IamRole): CreateActivationRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivationRequest]
  }
  
  extension [Self <: CreateActivationRequest](x: Self) {
    
    inline def setDefaultInstanceName(value: DefaultInstanceName): Self = StObject.set(x, "DefaultInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceNameUndefined: Self = StObject.set(x, "DefaultInstanceName", js.undefined)
    
    inline def setDescription(value: ActivationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationDate(value: ExpirationDate): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setRegistrationLimit(value: RegistrationLimit): Self = StObject.set(x, "RegistrationLimit", value.asInstanceOf[js.Any])
    
    inline def setRegistrationLimitUndefined: Self = StObject.set(x, "RegistrationLimit", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
