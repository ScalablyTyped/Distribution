package typings.babylonjs

import typings.babylonjs.thinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iShaderProcessorMod {
  
  trait IShaderProcessor extends StObject {
    
    var attributeProcessor: js.UndefOr[js.Function1[/* attribute */ String, String]] = js.undefined
    
    var endOfUniformBufferProcessor: js.UndefOr[js.Function2[/* closingBracketLine */ String, /* isFragment */ Boolean, String]] = js.undefined
    
    var lineProcessor: js.UndefOr[js.Function2[/* line */ String, /* isFragment */ Boolean, String]] = js.undefined
    
    var postProcessor: js.UndefOr[
        js.Function4[
          /* code */ String, 
          /* defines */ js.Array[String], 
          /* isFragment */ Boolean, 
          /* engine */ ThinEngine, 
          String
        ]
      ] = js.undefined
    
    var preProcessor: js.UndefOr[
        js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
      ] = js.undefined
    
    var uniformBufferProcessor: js.UndefOr[js.Function2[/* uniformBuffer */ String, /* isFragment */ Boolean, String]] = js.undefined
    
    var uniformProcessor: js.UndefOr[js.Function2[/* uniform */ String, /* isFragment */ Boolean, String]] = js.undefined
    
    var varyingProcessor: js.UndefOr[js.Function2[/* varying */ String, /* isFragment */ Boolean, String]] = js.undefined
  }
  object IShaderProcessor {
    
    inline def apply(): IShaderProcessor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShaderProcessor]
    }
    
    extension [Self <: IShaderProcessor](x: Self) {
      
      inline def setAttributeProcessor(value: /* attribute */ String => String): Self = StObject.set(x, "attributeProcessor", js.Any.fromFunction1(value))
      
      inline def setAttributeProcessorUndefined: Self = StObject.set(x, "attributeProcessor", js.undefined)
      
      inline def setEndOfUniformBufferProcessor(value: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "endOfUniformBufferProcessor", js.Any.fromFunction2(value))
      
      inline def setEndOfUniformBufferProcessorUndefined: Self = StObject.set(x, "endOfUniformBufferProcessor", js.undefined)
      
      inline def setLineProcessor(value: (/* line */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "lineProcessor", js.Any.fromFunction2(value))
      
      inline def setLineProcessorUndefined: Self = StObject.set(x, "lineProcessor", js.undefined)
      
      inline def setPostProcessor(
        value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, /* engine */ ThinEngine) => String
      ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction4(value))
      
      inline def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
      
      inline def setPreProcessor(value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String): Self = StObject.set(x, "preProcessor", js.Any.fromFunction3(value))
      
      inline def setPreProcessorUndefined: Self = StObject.set(x, "preProcessor", js.undefined)
      
      inline def setUniformBufferProcessor(value: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "uniformBufferProcessor", js.Any.fromFunction2(value))
      
      inline def setUniformBufferProcessorUndefined: Self = StObject.set(x, "uniformBufferProcessor", js.undefined)
      
      inline def setUniformProcessor(value: (/* uniform */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "uniformProcessor", js.Any.fromFunction2(value))
      
      inline def setUniformProcessorUndefined: Self = StObject.set(x, "uniformProcessor", js.undefined)
      
      inline def setVaryingProcessor(value: (/* varying */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "varyingProcessor", js.Any.fromFunction2(value))
      
      inline def setVaryingProcessorUndefined: Self = StObject.set(x, "varyingProcessor", js.undefined)
    }
  }
}
