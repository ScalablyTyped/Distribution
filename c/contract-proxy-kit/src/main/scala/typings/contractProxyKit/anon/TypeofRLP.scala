package typings.contractProxyKit.anon

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRLP extends StObject {
  
  def decode(data: BytesLike): Any
  
  def encode(`object`: Any): String
}
object TypeofRLP {
  
  inline def apply(decode: BytesLike => Any, encode: Any => String): TypeofRLP = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[TypeofRLP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRLP] (val x: Self) extends AnyVal {
    
    inline def setDecode(value: BytesLike => Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: Any => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
