package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilStatic extends StObject {
  
  def decode(value: String): String
  
  def encode(value: String): String
  
  def getKeys(value: js.Object): js.Array[Any]
  
  def isArray(value: Any): Boolean
  
  def isObject(value: Any): Boolean
  
  def retrieve(x: String, y: String): String
  
  def toArray(args: Any*): js.Array[Any]
}
object UtilStatic {
  
  inline def apply(
    decode: String => String,
    encode: String => String,
    getKeys: js.Object => js.Array[Any],
    isArray: Any => Boolean,
    isObject: Any => Boolean,
    retrieve: (String, String) => String,
    toArray: /* repeated */ Any => js.Array[Any]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), getKeys = js.Any.fromFunction1(getKeys), isArray = js.Any.fromFunction1(isArray), isObject = js.Any.fromFunction1(isObject), retrieve = js.Any.fromFunction2(retrieve), toArray = js.Any.fromFunction1(toArray))
    __obj.asInstanceOf[UtilStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilStatic] (val x: Self) extends AnyVal {
    
    inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setGetKeys(value: js.Object => js.Array[Any]): Self = StObject.set(x, "getKeys", js.Any.fromFunction1(value))
    
    inline def setIsArray(value: Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    inline def setIsObject(value: Any => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    inline def setRetrieve(value: (String, String) => String): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    inline def setToArray(value: /* repeated */ Any => js.Array[Any]): Self = StObject.set(x, "toArray", js.Any.fromFunction1(value))
  }
}
