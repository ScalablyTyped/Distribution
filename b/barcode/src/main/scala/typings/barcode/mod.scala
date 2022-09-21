package typings.barcode

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`type`: String, options: BarcodeOptions): BarcodeResult = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BarcodeResult]
  
  @JSImport("barcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BarcodeOptions extends StObject {
    
    var data: String | Double
    
    var height: Double
    
    var width: Double
  }
  object BarcodeOptions {
    
    inline def apply(data: String | Double, height: Double, width: Double): BarcodeOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeOptions]
    }
    
    extension [Self <: BarcodeOptions](x: Self) {
      
      inline def setData(value: String | Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarcodeResult extends StObject {
    
    def getBase64(
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          /* base64String */ String, 
          Unit
        ]
    ): Unit
    
    def getStream(
      callback: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          /* stream */ ReadableStream[Any], 
          Unit
        ]
    ): Unit
    
    def saveImage(
      outputfilePath: String,
      callback: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          Unit
        ]
    ): Unit
  }
  object BarcodeResult {
    
    inline def apply(
      getBase64: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          /* base64String */ String, 
          Unit
        ] => Unit,
      getStream: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          /* stream */ ReadableStream[Any], 
          Unit
        ] => Unit,
      saveImage: (String, js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
          Unit
        ]) => Unit
    ): BarcodeResult = {
      val __obj = js.Dynamic.literal(getBase64 = js.Any.fromFunction1(getBase64), getStream = js.Any.fromFunction1(getStream), saveImage = js.Any.fromFunction2(saveImage))
      __obj.asInstanceOf[BarcodeResult]
    }
    
    extension [Self <: BarcodeResult](x: Self) {
      
      inline def setGetBase64(
        value: js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
              /* base64String */ String, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "getBase64", js.Any.fromFunction1(value))
      
      inline def setGetStream(
        value: js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
              /* stream */ ReadableStream[Any], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "getStream", js.Any.fromFunction1(value))
      
      inline def setSaveImage(
        value: (String, js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "saveImage", js.Any.fromFunction2(value))
    }
  }
}
