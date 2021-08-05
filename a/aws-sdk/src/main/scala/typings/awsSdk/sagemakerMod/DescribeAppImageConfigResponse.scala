package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigArn] = js.undefined
  
  /**
    * The name of the AppImageConfig.
    */
  var AppImageConfigName: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigName] = js.undefined
  
  /**
    * When the AppImageConfig was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The configuration of a KernelGateway app.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.sagemakerMod.KernelGatewayImageConfig] = js.undefined
  
  /**
    * When the AppImageConfig was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
}
object DescribeAppImageConfigResponse {
  
  inline def apply(): DescribeAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppImageConfigResponse]
  }
  
  extension [Self <: DescribeAppImageConfigResponse](x: Self) {
    
    inline def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigNameUndefined: Self = StObject.set(x, "AppImageConfigName", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
