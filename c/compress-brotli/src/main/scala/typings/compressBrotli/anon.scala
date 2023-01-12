package typings.compressBrotli

import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.InputType
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Compress[SerializeResult, DeserializeResult] extends StObject {
    
    def compress(data: InputType): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<node.zlib.CompressCallback>[1] */ js.Any
      ] = js.native
    def compress(data: InputType, optioins: BrotliOptions): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<node.zlib.CompressCallback>[1] */ js.Any
      ] = js.native
    
    def decompress(data: InputType): js.Promise[ReturnType[js.Function1[/* s */ String, Any]]] = js.native
    def decompress(data: InputType, optioins: BrotliOptions): js.Promise[ReturnType[js.Function1[/* s */ String, Any]]] = js.native
    
    def deserialize(
      source: js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<node.zlib.CompressCallback>[1] */ js.Any
        ]
    ): DeserializeResult = js.native
    @JSName("deserialize")
    var deserialize_Original: Deserialize[DeserializeResult] = js.native
    
    def serialize(source: InputType): SerializeResult = js.native
    @JSName("serialize")
    var serialize_Original: Serialize[SerializeResult] = js.native
  }
  
  trait CompressOptions[SerializeResult, DeserializeResult] extends StObject {
    
    var compressOptions: js.UndefOr[BrotliOptions] = js.undefined
    
    var decompressOptions: js.UndefOr[BrotliOptions] = js.undefined
    
    var deserialize: js.UndefOr[Deserialize[DeserializeResult]] = js.undefined
    
    var enable: js.UndefOr[Boolean] = js.undefined
    
    var iltorb: js.UndefOr[Any] = js.undefined
    
    var serialize: js.UndefOr[Serialize[SerializeResult]] = js.undefined
  }
  object CompressOptions {
    
    inline def apply[SerializeResult, DeserializeResult](): CompressOptions[SerializeResult, DeserializeResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions[SerializeResult, DeserializeResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressOptions[?, ?], SerializeResult, DeserializeResult] (val x: Self & (CompressOptions[SerializeResult, DeserializeResult])) extends AnyVal {
      
      inline def setCompressOptions(value: BrotliOptions): Self = StObject.set(x, "compressOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressOptionsUndefined: Self = StObject.set(x, "compressOptions", js.undefined)
      
      inline def setDecompressOptions(value: BrotliOptions): Self = StObject.set(x, "decompressOptions", value.asInstanceOf[js.Any])
      
      inline def setDecompressOptionsUndefined: Self = StObject.set(x, "decompressOptions", js.undefined)
      
      inline def setDeserialize(
        value: js.Promise[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<node.zlib.CompressCallback>[1] */ js.Any
            ] => DeserializeResult
      ): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setIltorb(value: Any): Self = StObject.set(x, "iltorb", value.asInstanceOf[js.Any])
      
      inline def setIltorbUndefined: Self = StObject.set(x, "iltorb", js.undefined)
      
      inline def setSerialize(value: /* source */ InputType => SerializeResult): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
}
