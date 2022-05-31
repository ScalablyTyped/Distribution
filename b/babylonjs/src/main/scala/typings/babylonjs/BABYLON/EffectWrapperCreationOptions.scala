package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to create an EffectWrapper
  */
trait EffectWrapperCreationOptions extends StObject {
  
  /**
    * Attributes to use in the shader
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Defines to use in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Engine to use to create the effect
    */
  var engine: ThinEngine
  
  /**
    * Fragment shader for the effect
    */
  var fragmentShader: String
  
  /**
    * The friendly name of the effect displayed in Spector.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Callback when effect is compiled
    */
  var onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]] = js.undefined
  
  /**
    * Texture sampler names to use in the shader
    */
  var samplerNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Uniforms to use in the shader
    */
  var uniformNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Use the shader store instead of direct source code
    */
  var useShaderStore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertex shader for the effect
    */
  var vertexShader: js.UndefOr[String] = js.undefined
}
object EffectWrapperCreationOptions {
  
  inline def apply(engine: ThinEngine, fragmentShader: String): EffectWrapperCreationOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapperCreationOptions]
  }
  
  extension [Self <: EffectWrapperCreationOptions](x: Self) {
    
    inline def setAttributeNames(value: js.Array[String]): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "attributeNames", js.Array(value :_*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    inline def setEngine(value: ThinEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
    
    inline def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
    
    inline def setOnCompiledUndefined: Self = StObject.set(x, "onCompiled", js.undefined)
    
    inline def setSamplerNames(value: js.Array[String]): Self = StObject.set(x, "samplerNames", value.asInstanceOf[js.Any])
    
    inline def setSamplerNamesUndefined: Self = StObject.set(x, "samplerNames", js.undefined)
    
    inline def setSamplerNamesVarargs(value: String*): Self = StObject.set(x, "samplerNames", js.Array(value :_*))
    
    inline def setUniformNames(value: js.Array[String]): Self = StObject.set(x, "uniformNames", value.asInstanceOf[js.Any])
    
    inline def setUniformNamesUndefined: Self = StObject.set(x, "uniformNames", js.undefined)
    
    inline def setUniformNamesVarargs(value: String*): Self = StObject.set(x, "uniformNames", js.Array(value :_*))
    
    inline def setUseShaderStore(value: Boolean): Self = StObject.set(x, "useShaderStore", value.asInstanceOf[js.Any])
    
    inline def setUseShaderStoreUndefined: Self = StObject.set(x, "useShaderStore", js.undefined)
    
    inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
  }
}
