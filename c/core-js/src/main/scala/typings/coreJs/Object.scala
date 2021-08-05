package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap
}
object Object {
  
  inline def apply(getOwnPropertyDescriptors: js.Any => PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
    __obj.asInstanceOf[Object]
  }
  
  extension [Self <: Object](x: Self) {
    
    inline def setGetOwnPropertyDescriptors(value: js.Any => PropertyDescriptorMap): Self = StObject.set(x, "getOwnPropertyDescriptors", js.Any.fromFunction1(value))
  }
}
