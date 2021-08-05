package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig. Must be unique to your account.
    */
  var AppImageConfigName: typings.awsSdk.sagemakerMod.AppImageConfigName
  
  /**
    * The KernelGatewayImageConfig.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayImageConfig] = js.undefined
  
  /**
    * A list of tags to apply to the AppImageConfig.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAppImageConfigRequest {
  
  inline def apply(AppImageConfigName: AppImageConfigName): CreateAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppImageConfigRequest]
  }
  
  extension [Self <: CreateAppImageConfigRequest](x: Self) {
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
