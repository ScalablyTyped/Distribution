package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwarePackage extends js.Object {
  /**
    * The architecture used for the software package.
    */
  var Architecture: js.UndefOr[NonEmptyString] = js.native
  /**
    * The epoch of the software package.
    */
  var Epoch: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the software package.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The release of the software package.
    */
  var Release: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of the software package.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}

object SoftwarePackage {
  @scala.inline
  def apply(): SoftwarePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwarePackage]
  }
  @scala.inline
  implicit class SoftwarePackageOps[Self <: SoftwarePackage] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: NonEmptyString): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    @scala.inline
    def setEpoch(value: NonEmptyString): Self = this.set("Epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("Epoch", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRelease(value: NonEmptyString): Self = this.set("Release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("Release", js.undefined)
    @scala.inline
    def setVersion(value: NonEmptyString): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

