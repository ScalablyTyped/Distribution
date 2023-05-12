package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cesiumEngine.mod.CustomShaderMode
import typings.cesiumEngine.mod.CustomShaderTranslucencyMode
import typings.cesiumEngine.mod.LightingModel
import typings.cesiumEngine.mod.UniformSpecifier
import typings.cesiumEngine.mod.VaryingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentShaderText extends StObject {
  
  var fragmentShaderText: js.UndefOr[String] = js.undefined
  
  var lightingModel: js.UndefOr[LightingModel] = js.undefined
  
  var mode: js.UndefOr[CustomShaderMode] = js.undefined
  
  var translucencyMode: js.UndefOr[CustomShaderTranslucencyMode] = js.undefined
  
  var uniforms: js.UndefOr[StringDictionary[UniformSpecifier]] = js.undefined
  
  var varyings: js.UndefOr[StringDictionary[VaryingType]] = js.undefined
  
  var vertexShaderText: js.UndefOr[String] = js.undefined
}
object FragmentShaderText {
  
  inline def apply(): FragmentShaderText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentShaderText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentShaderText] (val x: Self) extends AnyVal {
    
    inline def setFragmentShaderText(value: String): Self = StObject.set(x, "fragmentShaderText", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderTextUndefined: Self = StObject.set(x, "fragmentShaderText", js.undefined)
    
    inline def setLightingModel(value: LightingModel): Self = StObject.set(x, "lightingModel", value.asInstanceOf[js.Any])
    
    inline def setLightingModelUndefined: Self = StObject.set(x, "lightingModel", js.undefined)
    
    inline def setMode(value: CustomShaderMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTranslucencyMode(value: CustomShaderTranslucencyMode): Self = StObject.set(x, "translucencyMode", value.asInstanceOf[js.Any])
    
    inline def setTranslucencyModeUndefined: Self = StObject.set(x, "translucencyMode", js.undefined)
    
    inline def setUniforms(value: StringDictionary[UniformSpecifier]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setVaryings(value: StringDictionary[VaryingType]): Self = StObject.set(x, "varyings", value.asInstanceOf[js.Any])
    
    inline def setVaryingsUndefined: Self = StObject.set(x, "varyings", js.undefined)
    
    inline def setVertexShaderText(value: String): Self = StObject.set(x, "vertexShaderText", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderTextUndefined: Self = StObject.set(x, "vertexShaderText", js.undefined)
  }
}
