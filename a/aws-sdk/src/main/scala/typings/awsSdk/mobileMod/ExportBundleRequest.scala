package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBundleRequest extends js.Object {
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId = js.native
  /**
    *  Developer desktop or target application platform. 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.native
}

object ExportBundleRequest {
  @scala.inline
  def apply(bundleId: BundleId): ExportBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBundleRequest]
  }
  @scala.inline
  implicit class ExportBundleRequestOps[Self <: ExportBundleRequest] (val x: Self) extends AnyVal {
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
    def setBundleId(value: BundleId): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

