package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelGatewayAppSettings extends StObject {
  
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
  implicit class KernelGatewayAppSettingsMutableBuilder[Self <: KernelGatewayAppSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomImages(value: CustomImages): Self = StObject.set(x, "CustomImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomImagesUndefined: Self = StObject.set(x, "CustomImages", js.undefined)
    
    @scala.inline
    def setCustomImagesVarargs(value: CustomImage*): Self = StObject.set(x, "CustomImages", js.Array(value :_*))
    
    @scala.inline
    def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
  }
}
