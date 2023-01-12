package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait IWebGPUMaterialContextSamplerCache extends StObject {
  
  @JSName("hashCode")
  var hashCode_FIWebGPUMaterialContextSamplerCache: Double
  
  var sampler: Nullable[TextureSampler]
}
object IWebGPUMaterialContextSamplerCache {
  
  inline def apply(hashCode_ : Double): IWebGPUMaterialContextSamplerCache = {
    val __obj = js.Dynamic.literal(sampler = null)
    __obj.updateDynamic("hashCode")(hashCode_.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebGPUMaterialContextSamplerCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebGPUMaterialContextSamplerCache] (val x: Self) extends AnyVal {
    
    inline def setHashCode_(value: Double): Self = StObject.set(x, "hashCode", value.asInstanceOf[js.Any])
    
    inline def setSampler(value: Nullable[TextureSampler]): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    inline def setSamplerNull: Self = StObject.set(x, "sampler", null)
  }
}
