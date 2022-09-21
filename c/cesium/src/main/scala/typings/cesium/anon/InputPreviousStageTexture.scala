package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPreviousStageTexture extends StObject {
  
  var inputPreviousStageTexture: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stages: js.Array[Any]
  
  var uniforms: js.UndefOr[Any] = js.undefined
}
object InputPreviousStageTexture {
  
  inline def apply(stages: js.Array[Any]): InputPreviousStageTexture = {
    val __obj = js.Dynamic.literal(stages = stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPreviousStageTexture]
  }
  
  extension [Self <: InputPreviousStageTexture](x: Self) {
    
    inline def setInputPreviousStageTexture(value: Boolean): Self = StObject.set(x, "inputPreviousStageTexture", value.asInstanceOf[js.Any])
    
    inline def setInputPreviousStageTextureUndefined: Self = StObject.set(x, "inputPreviousStageTexture", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStages(value: js.Array[Any]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesVarargs(value: Any*): Self = StObject.set(x, "stages", js.Array(value*))
    
    inline def setUniforms(value: Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
  }
}
