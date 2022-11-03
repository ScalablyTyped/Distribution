package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FragmentCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShaderProcessor extends StObject {
  
  var attributeKeywordName: js.UndefOr[String] = js.undefined
  
  var attributeProcessor: js.UndefOr[
    js.Function3[
      /* attribute */ String, 
      /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var endOfUniformBufferProcessor: js.UndefOr[
    js.Function3[
      /* closingBracketLine */ String, 
      /* isFragment */ Boolean, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var finalizeShaders: js.UndefOr[
    js.Function3[
      /* vertexCode */ String, 
      /* fragmentCode */ String, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      FragmentCode
    ]
  ] = js.undefined
  
  var initializeShaders: js.UndefOr[js.Function1[/* processingContext */ Nullable[ShaderProcessingContext], Unit]] = js.undefined
  
  var lineProcessor: js.UndefOr[
    js.Function3[
      /* line */ String, 
      /* isFragment */ Boolean, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var noPrecision: js.UndefOr[Boolean] = js.undefined
  
  var parseGLES3: js.UndefOr[Boolean] = js.undefined
  
  var postProcessor: js.UndefOr[
    js.Function5[
      /* code */ String, 
      /* defines */ js.Array[String], 
      /* isFragment */ Boolean, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      /* engine */ ThinEngine, 
      String
    ]
  ] = js.undefined
  
  var preProcessShaderCode: js.UndefOr[js.Function2[/* code */ String, /* isFragment */ Boolean, String]] = js.undefined
  
  var preProcessor: js.UndefOr[
    js.Function4[
      /* code */ String, 
      /* defines */ js.Array[String], 
      /* isFragment */ Boolean, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var shaderLanguage: ShaderLanguage
  
  var textureProcessor: js.UndefOr[
    js.Function4[
      /* texture */ String, 
      /* isFragment */ Boolean, 
      /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var textureRegexp: js.UndefOr[js.RegExp] = js.undefined
  
  var uniformBufferProcessor: js.UndefOr[
    js.Function3[
      /* uniformBuffer */ String, 
      /* isFragment */ Boolean, 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var uniformBufferRegexp: js.UndefOr[js.RegExp] = js.undefined
  
  var uniformProcessor: js.UndefOr[
    js.Function4[
      /* uniform */ String, 
      /* isFragment */ Boolean, 
      /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var uniformRegexp: js.UndefOr[js.RegExp] = js.undefined
  
  var varyingFragmentKeywordName: js.UndefOr[String] = js.undefined
  
  var varyingProcessor: js.UndefOr[
    js.Function4[
      /* varying */ String, 
      /* isFragment */ Boolean, 
      /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], 
      /* processingContext */ Nullable[ShaderProcessingContext], 
      String
    ]
  ] = js.undefined
  
  var varyingVertexKeywordName: js.UndefOr[String] = js.undefined
}
object IShaderProcessor {
  
  inline def apply(shaderLanguage: ShaderLanguage): IShaderProcessor = {
    val __obj = js.Dynamic.literal(shaderLanguage = shaderLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShaderProcessor]
  }
  
  extension [Self <: IShaderProcessor](x: Self) {
    
    inline def setAttributeKeywordName(value: String): Self = StObject.set(x, "attributeKeywordName", value.asInstanceOf[js.Any])
    
    inline def setAttributeKeywordNameUndefined: Self = StObject.set(x, "attributeKeywordName", js.undefined)
    
    inline def setAttributeProcessor(
      value: (/* attribute */ String, /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "attributeProcessor", js.Any.fromFunction3(value))
    
    inline def setAttributeProcessorUndefined: Self = StObject.set(x, "attributeProcessor", js.undefined)
    
    inline def setEndOfUniformBufferProcessor(
      value: (/* closingBracketLine */ String, /* isFragment */ Boolean, /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "endOfUniformBufferProcessor", js.Any.fromFunction3(value))
    
    inline def setEndOfUniformBufferProcessorUndefined: Self = StObject.set(x, "endOfUniformBufferProcessor", js.undefined)
    
    inline def setFinalizeShaders(
      value: (/* vertexCode */ String, /* fragmentCode */ String, /* processingContext */ Nullable[ShaderProcessingContext]) => FragmentCode
    ): Self = StObject.set(x, "finalizeShaders", js.Any.fromFunction3(value))
    
    inline def setFinalizeShadersUndefined: Self = StObject.set(x, "finalizeShaders", js.undefined)
    
    inline def setInitializeShaders(value: /* processingContext */ Nullable[ShaderProcessingContext] => Unit): Self = StObject.set(x, "initializeShaders", js.Any.fromFunction1(value))
    
    inline def setInitializeShadersUndefined: Self = StObject.set(x, "initializeShaders", js.undefined)
    
    inline def setLineProcessor(
      value: (/* line */ String, /* isFragment */ Boolean, /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "lineProcessor", js.Any.fromFunction3(value))
    
    inline def setLineProcessorUndefined: Self = StObject.set(x, "lineProcessor", js.undefined)
    
    inline def setNoPrecision(value: Boolean): Self = StObject.set(x, "noPrecision", value.asInstanceOf[js.Any])
    
    inline def setNoPrecisionUndefined: Self = StObject.set(x, "noPrecision", js.undefined)
    
    inline def setParseGLES3(value: Boolean): Self = StObject.set(x, "parseGLES3", value.asInstanceOf[js.Any])
    
    inline def setParseGLES3Undefined: Self = StObject.set(x, "parseGLES3", js.undefined)
    
    inline def setPostProcessor(
      value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, /* processingContext */ Nullable[ShaderProcessingContext], /* engine */ ThinEngine) => String
    ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction5(value))
    
    inline def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
    
    inline def setPreProcessShaderCode(value: (/* code */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "preProcessShaderCode", js.Any.fromFunction2(value))
    
    inline def setPreProcessShaderCodeUndefined: Self = StObject.set(x, "preProcessShaderCode", js.undefined)
    
    inline def setPreProcessor(
      value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "preProcessor", js.Any.fromFunction4(value))
    
    inline def setPreProcessorUndefined: Self = StObject.set(x, "preProcessor", js.undefined)
    
    inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
    
    inline def setTextureProcessor(
      value: (/* texture */ String, /* isFragment */ Boolean, /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "textureProcessor", js.Any.fromFunction4(value))
    
    inline def setTextureProcessorUndefined: Self = StObject.set(x, "textureProcessor", js.undefined)
    
    inline def setTextureRegexp(value: js.RegExp): Self = StObject.set(x, "textureRegexp", value.asInstanceOf[js.Any])
    
    inline def setTextureRegexpUndefined: Self = StObject.set(x, "textureRegexp", js.undefined)
    
    inline def setUniformBufferProcessor(
      value: (/* uniformBuffer */ String, /* isFragment */ Boolean, /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "uniformBufferProcessor", js.Any.fromFunction3(value))
    
    inline def setUniformBufferProcessorUndefined: Self = StObject.set(x, "uniformBufferProcessor", js.undefined)
    
    inline def setUniformBufferRegexp(value: js.RegExp): Self = StObject.set(x, "uniformBufferRegexp", value.asInstanceOf[js.Any])
    
    inline def setUniformBufferRegexpUndefined: Self = StObject.set(x, "uniformBufferRegexp", js.undefined)
    
    inline def setUniformProcessor(
      value: (/* uniform */ String, /* isFragment */ Boolean, /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "uniformProcessor", js.Any.fromFunction4(value))
    
    inline def setUniformProcessorUndefined: Self = StObject.set(x, "uniformProcessor", js.undefined)
    
    inline def setUniformRegexp(value: js.RegExp): Self = StObject.set(x, "uniformRegexp", value.asInstanceOf[js.Any])
    
    inline def setUniformRegexpUndefined: Self = StObject.set(x, "uniformRegexp", js.undefined)
    
    inline def setVaryingFragmentKeywordName(value: String): Self = StObject.set(x, "varyingFragmentKeywordName", value.asInstanceOf[js.Any])
    
    inline def setVaryingFragmentKeywordNameUndefined: Self = StObject.set(x, "varyingFragmentKeywordName", js.undefined)
    
    inline def setVaryingProcessor(
      value: (/* varying */ String, /* isFragment */ Boolean, /* preProcessors */ org.scalablytyped.runtime.StringDictionary[String], /* processingContext */ Nullable[ShaderProcessingContext]) => String
    ): Self = StObject.set(x, "varyingProcessor", js.Any.fromFunction4(value))
    
    inline def setVaryingProcessorUndefined: Self = StObject.set(x, "varyingProcessor", js.undefined)
    
    inline def setVaryingVertexKeywordName(value: String): Self = StObject.set(x, "varyingVertexKeywordName", value.asInstanceOf[js.Any])
    
    inline def setVaryingVertexKeywordNameUndefined: Self = StObject.set(x, "varyingVertexKeywordName", js.undefined)
  }
}
