package typings.blakejs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blakejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blake2b(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: String, key: js.typedarray.Uint8Array, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: String, key: Unit, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2b(input: js.typedarray.Uint8Array, key: Unit, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def blake2bFinal(ctx: Blake2bCTX): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2bFinal")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def blake2bHex(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def blake2bHex(input: String, key: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2bHex(input: String, key: js.typedarray.Uint8Array, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2bHex(input: String, key: Unit, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2bHex(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def blake2bHex(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2bHex(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2bHex(input: js.typedarray.Uint8Array, key: Unit, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def blake2bInit(): Blake2bCTX = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2bInit")().asInstanceOf[Blake2bCTX]
  inline def blake2bInit(outlen: Double): Blake2bCTX = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2bInit")(outlen.asInstanceOf[js.Any]).asInstanceOf[Blake2bCTX]
  inline def blake2bInit(outlen: Double, key: js.typedarray.Uint8Array): Blake2bCTX = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bInit")(outlen.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Blake2bCTX]
  inline def blake2bInit(outlen: Unit, key: js.typedarray.Uint8Array): Blake2bCTX = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bInit")(outlen.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Blake2bCTX]
  
  inline def blake2bUpdate(ctx: Blake2bCTX, input: ArrayLike[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2bUpdate")(ctx.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def blake2s(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: String, key: js.typedarray.Uint8Array, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: String, key: Unit, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def blake2s(input: js.typedarray.Uint8Array, key: Unit, outlen: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def blake2sFinal(ctx: Blake2sCTX): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2sFinal")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def blake2sHex(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def blake2sHex(input: String, key: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2sHex(input: String, key: js.typedarray.Uint8Array, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2sHex(input: String, key: Unit, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2sHex(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def blake2sHex(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2sHex(input: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blake2sHex(input: js.typedarray.Uint8Array, key: Unit, outlen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sHex")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outlen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def blake2sInit(outlen: Double): Blake2sCTX = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2sInit")(outlen.asInstanceOf[js.Any]).asInstanceOf[Blake2sCTX]
  inline def blake2sInit(outlen: Double, key: js.typedarray.Uint8Array): Blake2sCTX = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sInit")(outlen.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Blake2sCTX]
  
  inline def blake2sUpdate(ctx: Blake2sCTX, input: ArrayLike[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2sUpdate")(ctx.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Blake2bCTX extends StObject {
    
    var b: js.typedarray.Uint8Array
    
    var c: Double
    
    var h: js.typedarray.Uint32Array
    
    var outlen: Double
    
    var t: Double
  }
  object Blake2bCTX {
    
    inline def apply(b: js.typedarray.Uint8Array, c: Double, h: js.typedarray.Uint32Array, outlen: Double, t: Double): Blake2bCTX = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], outlen = outlen.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blake2bCTX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blake2bCTX] (val x: Self) extends AnyVal {
      
      inline def setB(value: js.typedarray.Uint8Array): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setH(value: js.typedarray.Uint32Array): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setOutlen(value: Double): Self = StObject.set(x, "outlen", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait Blake2sCTX extends StObject {
    
    var b: js.typedarray.Uint8Array
    
    var c: Double
    
    var h: js.typedarray.Uint32Array
    
    var outlen: Double
    
    var t: Double
  }
  object Blake2sCTX {
    
    inline def apply(b: js.typedarray.Uint8Array, c: Double, h: js.typedarray.Uint32Array, outlen: Double, t: Double): Blake2sCTX = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], outlen = outlen.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blake2sCTX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blake2sCTX] (val x: Self) extends AnyVal {
      
      inline def setB(value: js.typedarray.Uint8Array): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setH(value: js.typedarray.Uint32Array): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setOutlen(value: Double): Self = StObject.set(x, "outlen", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
