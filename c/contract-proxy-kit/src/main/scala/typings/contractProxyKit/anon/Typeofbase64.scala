package typings.contractProxyKit.anon

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbase64 extends StObject {
  
  def decode(textData: String): js.typedarray.Uint8Array
  
  def encode(data: BytesLike): String
}
object Typeofbase64 {
  
  inline def apply(decode: String => js.typedarray.Uint8Array, encode: BytesLike => String): Typeofbase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Typeofbase64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofbase64] (val x: Self) extends AnyVal {
    
    inline def setDecode(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: BytesLike => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
