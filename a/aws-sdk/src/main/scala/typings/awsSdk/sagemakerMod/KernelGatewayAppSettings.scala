package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelGatewayAppSettings extends js.Object {
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}

object KernelGatewayAppSettings {
  @scala.inline
  def apply(): KernelGatewayAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelGatewayAppSettings]
  }
  @scala.inline
  implicit class KernelGatewayAppSettingsOps[Self <: KernelGatewayAppSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultResourceSpec(value: ResourceSpec): Self = this.set("DefaultResourceSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultResourceSpec: Self = this.set("DefaultResourceSpec", js.undefined)
  }
  
}

