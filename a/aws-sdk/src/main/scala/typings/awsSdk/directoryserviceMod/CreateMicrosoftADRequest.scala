package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMicrosoftADRequest extends js.Object {
  
  /**
    * A description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  
  /**
    * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  
  /**
    * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
    */
  var Name: DirectoryName = js.native
  
  /**
    * The password for the default administrative user named Admin. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typings.awsSdk.directoryserviceMod.Password = js.native
  
  /**
    * The NetBIOS name for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  
  /**
    * The tags to be assigned to the AWS Managed Microsoft AD directory.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.native
  
  /**
    * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
    */
  var VpcSettings: DirectoryVpcSettings = js.native
}
object CreateMicrosoftADRequest {
  
  @scala.inline
  def apply(Name: DirectoryName, Password: Password, VpcSettings: DirectoryVpcSettings): CreateMicrosoftADRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], VpcSettings = VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMicrosoftADRequest]
  }
  
  @scala.inline
  implicit class CreateMicrosoftADRequestOps[Self <: CreateMicrosoftADRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettings): Self = this.set("VpcSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEdition(value: DirectoryEdition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setShortName(value: DirectoryShortName): Self = this.set("ShortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("ShortName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
