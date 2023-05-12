package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostProcessCustomShaderCodeProcessing extends StObject {
  
  /**
    * If provided, will be called when binding inputs to the shader code to allow the user to add custom bindings
    */
  var bindCustomBindings: js.UndefOr[js.Function2[/* postProcessName */ String, /* effect */ Effect, Unit]] = js.undefined
  
  /**
    * If provided, will be called before creating the effect to collect additional custom bindings (defines, uniforms, samplers)
    */
  var defineCustomBindings: js.UndefOr[
    js.Function4[
      /* postProcessName */ String, 
      /* defines */ Nullable[String], 
      /* uniforms */ js.Array[String], 
      /* samplers */ js.Array[String], 
      Nullable[String]
    ]
  ] = js.undefined
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated after the #include have been processed
    */
  var processCodeAfterIncludes: js.UndefOr[
    js.Function3[/* postProcessName */ String, /* shaderType */ String, /* code */ String, String]
  ] = js.undefined
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[
    js.Function3[/* postProcessName */ String, /* shaderType */ String, /* code */ String, String]
  ] = js.undefined
}
object PostProcessCustomShaderCodeProcessing {
  
  inline def apply(): PostProcessCustomShaderCodeProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostProcessCustomShaderCodeProcessing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostProcessCustomShaderCodeProcessing] (val x: Self) extends AnyVal {
    
    inline def setBindCustomBindings(value: (/* postProcessName */ String, /* effect */ Effect) => Unit): Self = StObject.set(x, "bindCustomBindings", js.Any.fromFunction2(value))
    
    inline def setBindCustomBindingsUndefined: Self = StObject.set(x, "bindCustomBindings", js.undefined)
    
    inline def setDefineCustomBindings(
      value: (/* postProcessName */ String, /* defines */ Nullable[String], /* uniforms */ js.Array[String], /* samplers */ js.Array[String]) => Nullable[String]
    ): Self = StObject.set(x, "defineCustomBindings", js.Any.fromFunction4(value))
    
    inline def setDefineCustomBindingsUndefined: Self = StObject.set(x, "defineCustomBindings", js.undefined)
    
    inline def setProcessCodeAfterIncludes(value: (/* postProcessName */ String, /* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processCodeAfterIncludes", js.Any.fromFunction3(value))
    
    inline def setProcessCodeAfterIncludesUndefined: Self = StObject.set(x, "processCodeAfterIncludes", js.undefined)
    
    inline def setProcessFinalCode(value: (/* postProcessName */ String, /* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction3(value))
    
    inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
  }
}
