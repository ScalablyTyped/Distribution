package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleDetails extends js.Object {
  var availablePlatforms: js.UndefOr[Platforms] = js.native
  var bundleId: js.UndefOr[BundleId] = js.native
  var description: js.UndefOr[BundleDescription] = js.native
  var iconUrl: js.UndefOr[IconUrl] = js.native
  var title: js.UndefOr[BundleTitle] = js.native
  var version: js.UndefOr[BundleVersion] = js.native
}

object BundleDetails {
  @scala.inline
  def apply(): BundleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleDetails]
  }
  @scala.inline
  implicit class BundleDetailsOps[Self <: BundleDetails] (val x: Self) extends AnyVal {
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
    def setAvailablePlatformsVarargs(value: Platform*): Self = this.set("availablePlatforms", js.Array(value :_*))
    @scala.inline
    def setAvailablePlatforms(value: Platforms): Self = this.set("availablePlatforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailablePlatforms: Self = this.set("availablePlatforms", js.undefined)
    @scala.inline
    def setBundleId(value: BundleId): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setDescription(value: BundleDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIconUrl(value: IconUrl): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setTitle(value: BundleTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: BundleVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

