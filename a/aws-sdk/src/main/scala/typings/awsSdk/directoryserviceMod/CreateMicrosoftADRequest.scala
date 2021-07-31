package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMicrosoftADRequest extends StObject {
  
  /**
    * A description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.undefined
  
  /**
    * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.undefined
  
  /**
    * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
    */
  var Name: DirectoryName
  
  /**
    * The password for the default administrative user named Admin. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typings.awsSdk.directoryserviceMod.Password
  
  /**
    * The NetBIOS name for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  
  /**
    * The tags to be assigned to the AWS Managed Microsoft AD directory.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.undefined
  
  /**
    * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
    */
  var VpcSettings: DirectoryVpcSettings
}
object CreateMicrosoftADRequest {
  
  @scala.inline
  def apply(Name: DirectoryName, Password: Password, VpcSettings: DirectoryVpcSettings): CreateMicrosoftADRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], VpcSettings = VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMicrosoftADRequest]
  }
  
  @scala.inline
  implicit class CreateMicrosoftADRequestMutableBuilder[Self <: CreateMicrosoftADRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEdition(value: DirectoryEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: DirectoryShortName): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettings): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
  }
}
