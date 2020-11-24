package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelGatewayAppSettings extends js.Object {
  
  /**
    * A list of custom SageMaker images that are configured to run as a KernelGateway app.
    */
  var CustomImages: js.UndefOr[typings.awsSdk.sagemakerMod.CustomImages] = js.native
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
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
    def setCustomImagesVarargs(value: CustomImage*): Self = this.set("CustomImages", js.Array(value :_*))
    
    @scala.inline
    def setCustomImages(value: CustomImages): Self = this.set("CustomImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomImages: Self = this.set("CustomImages", js.undefined)
    
    @scala.inline
    def setDefaultResourceSpec(value: ResourceSpec): Self = this.set("DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResourceSpec: Self = this.set("DefaultResourceSpec", js.undefined)
  }
}
