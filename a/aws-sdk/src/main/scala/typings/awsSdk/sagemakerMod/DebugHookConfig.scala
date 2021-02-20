package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugHookConfig extends StObject {
  
  /**
    * Configuration information for tensor collections.
    */
  var CollectionConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.CollectionConfigurations] = js.native
  
  /**
    * Configuration information for the debug hook parameters.
    */
  var HookParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HookParameters] = js.native
  
  /**
    * Path to local storage location for tensors. Defaults to /opt/ml/output/tensors/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  
  /**
    * Path to Amazon S3 storage location for tensors.
    */
  var S3OutputPath: S3Uri = js.native
}
object DebugHookConfig {
  
  @scala.inline
  def apply(S3OutputPath: S3Uri): DebugHookConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugHookConfig]
  }
  
  @scala.inline
  implicit class DebugHookConfigMutableBuilder[Self <: DebugHookConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionConfigurations(value: CollectionConfigurations): Self = StObject.set(x, "CollectionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionConfigurationsUndefined: Self = StObject.set(x, "CollectionConfigurations", js.undefined)
    
    @scala.inline
    def setCollectionConfigurationsVarargs(value: CollectionConfiguration*): Self = StObject.set(x, "CollectionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setHookParameters(value: HookParameters): Self = StObject.set(x, "HookParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookParametersUndefined: Self = StObject.set(x, "HookParameters", js.undefined)
    
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
