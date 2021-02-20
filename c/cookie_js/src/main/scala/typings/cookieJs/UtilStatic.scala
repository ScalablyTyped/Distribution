package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilStatic extends StObject {
  
  def decode(value: String): String = js.native
  
  def encode(value: String): String = js.native
  
  def getKeys(value: js.Object): js.Array[_] = js.native
  
  def isArray(value: js.Any): Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def retrieve(x: String, y: String): String = js.native
  
  def toArray(args: js.Any*): js.Array[_] = js.native
}
object UtilStatic {
  
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    getKeys: js.Object => js.Array[_],
    isArray: js.Any => Boolean,
    isObject: js.Any => Boolean,
    retrieve: (String, String) => String,
    toArray: /* repeated */ js.Any => js.Array[_]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), getKeys = js.Any.fromFunction1(getKeys), isArray = js.Any.fromFunction1(isArray), isObject = js.Any.fromFunction1(isObject), retrieve = js.Any.fromFunction2(retrieve), toArray = js.Any.fromFunction1(toArray))
    __obj.asInstanceOf[UtilStatic]
  }
  
  @scala.inline
  implicit class UtilStaticMutableBuilder[Self <: UtilStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeys(value: js.Object => js.Array[_]): Self = StObject.set(x, "getKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsArray(value: js.Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsObject(value: js.Any => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRetrieve(value: (String, String) => String): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToArray(value: /* repeated */ js.Any => js.Array[_]): Self = StObject.set(x, "toArray", js.Any.fromFunction1(value))
  }
}
