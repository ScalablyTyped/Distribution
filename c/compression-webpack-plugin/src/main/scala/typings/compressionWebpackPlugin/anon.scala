package typings.compressionWebpackPlugin

import typings.compressionWebpackPlugin.compressionWebpackPluginStrings.string
import typings.compressionWebpackPlugin.mod.AlgorithmFunction
import typings.compressionWebpackPlugin.mod.DefinedDefaultAlgorithmAndOptions
import typings.node.bufferMod.global.Buffer
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject
  
  trait `1` extends StObject
  
  trait `2` extends StObject
  
  trait Algorithm[T]
    extends StObject
       with DefinedDefaultAlgorithmAndOptions[T] {
    
    var algorithm: js.UndefOr[String | AlgorithmFunction[T]] = js.undefined
    
    var compressionOptions: js.UndefOr[typings.compressionWebpackPlugin.mod.CompressionOptions[T]] = js.undefined
  }
  object Algorithm {
    
    inline def apply[T](): Algorithm[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithm[T]]
    }
    
    extension [Self <: Algorithm[?], T](x: Self & Algorithm[T]) {
      
      inline def setAlgorithm(value: String | AlgorithmFunction[T]): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmFunction3(
        value: (/* input */ Buffer, /* options */ typings.compressionWebpackPlugin.mod.CompressionOptions[T], /* callback */ js.Function2[
              /* error */ js.UndefOr[js.Error | Null], 
              /* result */ String | js.typedarray.ArrayBuffer | SharedArrayBuffer | js.typedarray.Uint8Array | js.Array[Double] | `0` | `1` | `2` | ToPrimitive, 
              Unit
            ]) => Any
      ): Self = StObject.set(x, "algorithm", js.Any.fromFunction3(value))
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCompressionOptions(value: typings.compressionWebpackPlugin.mod.CompressionOptions[T]): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    }
  }
  
  trait CompressionOptions[T]
    extends StObject
       with DefinedDefaultAlgorithmAndOptions[T] {
    
    var algorithm: String | AlgorithmFunction[T]
    
    var compressionOptions: js.UndefOr[typings.compressionWebpackPlugin.mod.CompressionOptions[T]] = js.undefined
  }
  object CompressionOptions {
    
    inline def apply[T](algorithm: String | AlgorithmFunction[T]): CompressionOptions[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressionOptions[T]]
    }
    
    extension [Self <: CompressionOptions[?], T](x: Self & CompressionOptions[T]) {
      
      inline def setAlgorithm(value: String | AlgorithmFunction[T]): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmFunction3(
        value: (/* input */ Buffer, /* options */ typings.compressionWebpackPlugin.mod.CompressionOptions[T], /* callback */ js.Function2[
              /* error */ js.UndefOr[js.Error | Null], 
              /* result */ String | js.typedarray.ArrayBuffer | SharedArrayBuffer | js.typedarray.Uint8Array | js.Array[Double] | `0` | `1` | `2` | ToPrimitive, 
              Unit
            ]) => Any
      ): Self = StObject.set(x, "algorithm", js.Any.fromFunction3(value))
      
      inline def setCompressionOptions(value: typings.compressionWebpackPlugin.mod.CompressionOptions[T]): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    }
  }
  
  @js.native
  trait ToPrimitive extends StObject {
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function1[string, String] = js.native
  }
  
  trait ValueOf[T] extends StObject
}
