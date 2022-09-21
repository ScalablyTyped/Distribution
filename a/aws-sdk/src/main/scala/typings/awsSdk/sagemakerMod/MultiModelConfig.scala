package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiModelConfig extends StObject {
  
  /**
    * Whether to cache models for a multi-model endpoint. By default, multi-model endpoints cache models so that a model does not have to be loaded into memory each time it is invoked. Some use cases do not benefit from model caching. For example, if an endpoint hosts a large number of models that are each invoked infrequently, the endpoint might perform better if you disable model caching. To disable model caching, set the value of this parameter to Disabled.
    */
  var ModelCacheSetting: js.UndefOr[typings.awsSdk.sagemakerMod.ModelCacheSetting] = js.undefined
}
object MultiModelConfig {
  
  inline def apply(): MultiModelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiModelConfig]
  }
  
  extension [Self <: MultiModelConfig](x: Self) {
    
    inline def setModelCacheSetting(value: ModelCacheSetting): Self = StObject.set(x, "ModelCacheSetting", value.asInstanceOf[js.Any])
    
    inline def setModelCacheSettingUndefined: Self = StObject.set(x, "ModelCacheSetting", js.undefined)
  }
}
