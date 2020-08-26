package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentVersion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date that the component was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the parent image OS version during image recipe creation. 
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.native
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.native
  /**
    * The semantic version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object ComponentVersion {
  @scala.inline
  def apply(): ComponentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentVersion]
  }
  @scala.inline
  implicit class ComponentVersionOps[Self <: ComponentVersion] (val x: Self) extends AnyVal {
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
    def setArn(value: ImageBuilderArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDateCreated(value: DateTime): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: NonEmptyString): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSupportedOsVersionsVarargs(value: OsVersion*): Self = this.set("supportedOsVersions", js.Array(value :_*))
    @scala.inline
    def setSupportedOsVersions(value: OsVersionList): Self = this.set("supportedOsVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOsVersions: Self = this.set("supportedOsVersions", js.undefined)
    @scala.inline
    def setType(value: ComponentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: VersionNumber): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

