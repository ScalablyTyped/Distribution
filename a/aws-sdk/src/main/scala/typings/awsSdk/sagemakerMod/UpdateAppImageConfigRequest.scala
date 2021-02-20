package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppImageConfigRequest extends StObject {
  
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
  implicit class UpdateAppImageConfigRequestMutableBuilder[Self <: UpdateAppImageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
  }
}
