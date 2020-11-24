package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppImageConfigRequest extends js.Object {
  
  /**
    * The name of the AppImageConfig to update.
    */
  var AppImageConfigName: typings.awsSdk.sagemakerMod.AppImageConfigName = js.native
  
  /**
    * The new KernelGateway app to run on the image.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayImageConfig] = js.native
}
object UpdateAppImageConfigRequest {
  
  @scala.inline
  def apply(AppImageConfigName: AppImageConfigName): UpdateAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppImageConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateAppImageConfigRequestOps[Self <: UpdateAppImageConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigName(value: AppImageConfigName): Self = this.set("AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = this.set("KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelGatewayImageConfig: Self = this.set("KernelGatewayImageConfig", js.undefined)
  }
}
