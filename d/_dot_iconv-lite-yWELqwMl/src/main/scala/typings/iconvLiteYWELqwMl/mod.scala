package typings.iconvLiteYWELqwMl

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object iconvLiteAugmentingMod {
    
    @JSImport("iconv-lite", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(buffer: Buffer, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decode(buffer: Buffer, encoding: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def decodeStream(encoding: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(encoding.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def decodeStream(encoding: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def encode(content: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def encode(content: String, encoding: String, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def encodeStream(encoding: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(encoding.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def encodeStream(encoding: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def encodingExists(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingExists")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait Options extends StObject {
    
    var addBOM: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[String] = js.undefined
    
    var stripBOM: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddBOM(value: Boolean): Self = StObject.set(x, "addBOM", value.asInstanceOf[js.Any])
      
      inline def setAddBOMUndefined: Self = StObject.set(x, "addBOM", js.undefined)
      
      inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setStripBOM(value: Boolean): Self = StObject.set(x, "stripBOM", value.asInstanceOf[js.Any])
      
      inline def setStripBOMUndefined: Self = StObject.set(x, "stripBOM", js.undefined)
    }
  }
}
