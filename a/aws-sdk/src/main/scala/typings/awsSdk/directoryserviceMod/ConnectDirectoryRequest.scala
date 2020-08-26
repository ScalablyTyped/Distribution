package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectDirectoryRequest extends js.Object {
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings = js.native
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The fully qualified name of the on-premises directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the on-premises user account.
    */
  var Password: ConnectPassword = js.native
  /**
    * The NetBIOS name of the on-premises directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.native
}

object ConnectDirectoryRequest {
  @scala.inline
  def apply(
    ConnectSettings: DirectoryConnectSettings,
    Name: DirectoryName,
    Password: ConnectPassword,
    Size: DirectorySize
  ): ConnectDirectoryRequest = {
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
  @scala.inline
  implicit class ConnectDirectoryRequestOps[Self <: ConnectDirectoryRequest] (val x: Self) extends AnyVal {
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
    def setConnectSettings(value: DirectoryConnectSettings): Self = this.set("ConnectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: ConnectPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
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
  }
  
}

