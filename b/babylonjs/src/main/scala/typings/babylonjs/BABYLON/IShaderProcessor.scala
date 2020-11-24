package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShaderProcessor extends js.Object {
  
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
  implicit class IShaderProcessorOps[Self <: IShaderProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeProcessor(value: /* attribute */ String => String): Self = this.set("attributeProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttributeProcessor: Self = this.set("attributeProcessor", js.undefined)
    
    @scala.inline
    def setEndOfUniformBufferProcessor(value: (/* closingBracketLine */ String, /* isFragment */ Boolean) => String): Self = this.set("endOfUniformBufferProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEndOfUniformBufferProcessor: Self = this.set("endOfUniformBufferProcessor", js.undefined)
    
    @scala.inline
    def setLineProcessor(value: (/* line */ String, /* isFragment */ Boolean) => String): Self = this.set("lineProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLineProcessor: Self = this.set("lineProcessor", js.undefined)
    
    @scala.inline
    def setPostProcessor(
      value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean, /* engine */ ThinEngine) => String
    ): Self = this.set("postProcessor", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePostProcessor: Self = this.set("postProcessor", js.undefined)
    
    @scala.inline
    def setPreProcessor(value: (/* code */ String, /* defines */ js.Array[String], /* isFragment */ Boolean) => String): Self = this.set("preProcessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePreProcessor: Self = this.set("preProcessor", js.undefined)
    
    @scala.inline
    def setUniformBufferProcessor(value: (/* uniformBuffer */ String, /* isFragment */ Boolean) => String): Self = this.set("uniformBufferProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUniformBufferProcessor: Self = this.set("uniformBufferProcessor", js.undefined)
    
    @scala.inline
    def setUniformProcessor(value: (/* uniform */ String, /* isFragment */ Boolean) => String): Self = this.set("uniformProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUniformProcessor: Self = this.set("uniformProcessor", js.undefined)
    
    @scala.inline
    def setVaryingProcessor(value: (/* varying */ String, /* isFragment */ Boolean) => String): Self = this.set("varyingProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVaryingProcessor: Self = this.set("varyingProcessor", js.undefined)
  }
}
