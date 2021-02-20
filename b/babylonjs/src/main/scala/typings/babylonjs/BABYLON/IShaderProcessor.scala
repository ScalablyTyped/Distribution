package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShaderProcessor extends StObject {
  
  var attributeProcessor: js.UndefOr[js.Function1[/* attribute */ String, String]] = js.native
  
  var endOfUniformBufferProcessor: js.UndefOr[js.Function2[/* closingBracketLine */ String, /* isFragment */ Boolean, String]] = js.native
  
  var lineProcessor: js.UndefOr[js.Function2[/* line */ String, /* isFragment */ Boolean, String]] = js.native
  
  var postProcessor: js.UndefOr[
    js.Function4[
      /* code */ String, 
      /* defines */ js.Array[String], 
      /* isFragment */ Boolean, 
      /* engine */ ThinEngine, 
      String
    ]
  ] = js.native
  
  var preProcessor: js.UndefOr[
    js.Function3[/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, String]
  ] = js.native
  
  var uniformBufferProcessor: js.UndefOr[js.Function2[/* uniformBuffer */ String, /* isFragment */ Boolean, String]] = js.native
  
  var uniformProcessor: js.UndefOr[js.Function2[/* uniform */ String, /* isFragment */ Boolean, String]] = js.native
  
  var varyingProcessor: js.UndefOr[js.Function2[/* varying */ String, /* isFragment */ Boolean, String]] = js.native
}
object IShaderProcessor {
  
  @scala.inline
  def apply(): IShaderProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShaderProcessor]
  }
  
  @scala.inline
  implicit class IShaderProcessorMutableBuilder[Self <: IShaderProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeProcessor(value: /* attribute */ String => String): Self = StObject.set(x, "attributeProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributeProcessorUndefined: Self = StObject.set(x, "attributeProcessor", js.undefined)
    
    @scala.inline
    def setEndOfUniformBufferProcessor(value: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "endOfUniformBufferProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndOfUniformBufferProcessorUndefined: Self = StObject.set(x, "endOfUniformBufferProcessor", js.undefined)
    
    @scala.inline
    def setLineProcessor(value: (/* line */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "lineProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLineProcessorUndefined: Self = StObject.set(x, "lineProcessor", js.undefined)
    
    @scala.inline
    def setPostProcessor(
      value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, /* engine */ ThinEngine) => String
    ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
    
    @scala.inline
    def setPreProcessor(value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String): Self = StObject.set(x, "preProcessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreProcessorUndefined: Self = StObject.set(x, "preProcessor", js.undefined)
    
    @scala.inline
    def setUniformBufferProcessor(value: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "uniformBufferProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUniformBufferProcessorUndefined: Self = StObject.set(x, "uniformBufferProcessor", js.undefined)
    
    @scala.inline
    def setUniformProcessor(value: (/* uniform */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "uniformProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUniformProcessorUndefined: Self = StObject.set(x, "uniformProcessor", js.undefined)
    
    @scala.inline
    def setVaryingProcessor(value: (/* varying */ String, /* isFragment */ Boolean) => String): Self = StObject.set(x, "varyingProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVaryingProcessorUndefined: Self = StObject.set(x, "varyingProcessor", js.undefined)
  }
}
