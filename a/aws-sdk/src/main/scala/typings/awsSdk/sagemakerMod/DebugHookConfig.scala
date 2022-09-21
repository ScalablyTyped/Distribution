package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugHookConfig extends StObject {
  
  /**
    * Configuration information for Debugger tensor collections. To learn more about how to configure the CollectionConfiguration parameter, see Use the SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job. 
    */
  var CollectionConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.CollectionConfigurations] = js.undefined
  
  /**
    * Configuration information for the Debugger hook parameters.
    */
  var HookParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HookParameters] = js.undefined
  
  /**
    * Path to local storage location for metrics and tensors. Defaults to /opt/ml/output/tensors/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.undefined
  
  /**
    * Path to Amazon S3 storage location for metrics and tensors.
    */
  var S3OutputPath: S3Uri
}
object DebugHookConfig {
  
  inline def apply(S3OutputPath: S3Uri): DebugHookConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugHookConfig]
  }
  
  extension [Self <: DebugHookConfig](x: Self) {
    
    inline def setCollectionConfigurations(value: CollectionConfigurations): Self = StObject.set(x, "CollectionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setCollectionConfigurationsUndefined: Self = StObject.set(x, "CollectionConfigurations", js.undefined)
    
    inline def setCollectionConfigurationsVarargs(value: CollectionConfiguration*): Self = StObject.set(x, "CollectionConfigurations", js.Array(value*))
    
    inline def setHookParameters(value: HookParameters): Self = StObject.set(x, "HookParameters", value.asInstanceOf[js.Any])
    
    inline def setHookParametersUndefined: Self = StObject.set(x, "HookParameters", js.undefined)
    
    inline def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
