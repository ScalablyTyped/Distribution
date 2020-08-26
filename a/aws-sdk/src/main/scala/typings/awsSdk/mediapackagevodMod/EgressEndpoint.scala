package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressEndpoint extends js.Object {
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[string] = js.native
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[string] = js.native
}

object EgressEndpoint {
  @scala.inline
  def apply(): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressEndpoint]
  }
  @scala.inline
  implicit class EgressEndpointOps[Self <: EgressEndpoint] (val x: Self) extends AnyVal {
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
    def setPackagingConfigurationId(value: string): Self = this.set("PackagingConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagingConfigurationId: Self = this.set("PackagingConfigurationId", js.undefined)
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

