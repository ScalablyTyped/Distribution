package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageVersion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image semantic version.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date at which this image semantic version was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The name of the image semantic version.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    *  The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019. 
    */
  var osVersion: js.UndefOr[OsVersion] = js.native
  /**
    * The owner of the image semantic version.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the image semantic version.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The semantic version of the image semantic version.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object ImageVersion {
  @scala.inline
  def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  @scala.inline
  implicit class ImageVersionOps[Self <: ImageVersion] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOsVersion(value: OsVersion): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    @scala.inline
    def setOwner(value: NonEmptyString): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setVersion(value: VersionNumber): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

