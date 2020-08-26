package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequest extends js.Object {
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The fully qualified name for the directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typings.awsSdk.directoryserviceMod.Password = js.native
  /**
    * The NetBIOS name of the directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to the Simple AD directory.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.native
  /**
    * A DirectoryVpcSettings object that contains additional information for the operation.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.native
}

object CreateDirectoryRequest {
  @scala.inline
  def apply(Name: DirectoryName, Password: Password, Size: DirectorySize): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  @scala.inline
  implicit class CreateDirectoryRequestOps[Self <: CreateDirectoryRequest] (val x: Self) extends AnyVal {
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
    def setSize(value: DirectorySize): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettings): Self = this.set("VpcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSettings: Self = this.set("VpcSettings", js.undefined)
  }
  
}

