package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersioningConfiguration extends js.Object {
  /**
    * How many versions of data set contents will be kept. The "unlimited" parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.native
  /**
    * If true, unlimited versions of data set contents will be kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.native
}

object VersioningConfiguration {
  @scala.inline
  def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  @scala.inline
  implicit class VersioningConfigurationOps[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
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
    def setMaxVersions(value: MaxVersions): Self = this.set("maxVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVersions: Self = this.set("maxVersions", js.undefined)
    @scala.inline
    def setUnlimited(value: UnlimitedVersioning): Self = this.set("unlimited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlimited: Self = this.set("unlimited", js.undefined)
  }
  
}

