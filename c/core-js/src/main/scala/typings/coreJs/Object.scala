package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  def getOwnPropertyDescriptors(`object`: Any): PropertyDescriptorMap
}
object Object {
  
  inline def apply(getOwnPropertyDescriptors: Any => PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    inline def setGetOwnPropertyDescriptors(value: Any => PropertyDescriptorMap): Self = StObject.set(x, "getOwnPropertyDescriptors", js.Any.fromFunction1(value))
  }
}
