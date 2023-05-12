package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.Hi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleVarintMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/varint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def int64FromString(dec: String): Hi = ^.asInstanceOf[js.Dynamic].applyDynamic("int64FromString")(dec.asInstanceOf[js.Any]).asInstanceOf[Hi]
  
  inline def int64ToString(lo: Double, hi: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("int64ToString")(lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def uInt64ToString(lo: Double, hi: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uInt64ToString")(lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def varint32read(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("varint32read")().asInstanceOf[Double]
  
  inline def varint32write(value: Double, bytes: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("varint32write")(value.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def varint64read(): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("varint64read")().asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def varint64write(lo: Double, hi: Double, bytes: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("varint64write")(lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ReaderLike extends StObject {
    
    def assertBounds(): Unit
    
    var buf: js.typedarray.Uint8Array
    
    var len: Double
    
    var pos: Double
  }
  object ReaderLike {
    
    inline def apply(assertBounds: () => Unit, buf: js.typedarray.Uint8Array, len: Double, pos: Double): ReaderLike = {
      val __obj = js.Dynamic.literal(assertBounds = js.Any.fromFunction0(assertBounds), buf = buf.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReaderLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReaderLike] (val x: Self) extends AnyVal {
      
      inline def setAssertBounds(value: () => Unit): Self = StObject.set(x, "assertBounds", js.Any.fromFunction0(value))
      
      inline def setBuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
