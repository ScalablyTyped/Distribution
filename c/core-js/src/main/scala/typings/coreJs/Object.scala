package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends StObject {
  
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
}
object Object {
  
  @scala.inline
  def apply(getOwnPropertyDescriptors: js.Any => PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetOwnPropertyDescriptors(value: js.Any => PropertyDescriptorMap): Self = StObject.set(x, "getOwnPropertyDescriptors", js.Any.fromFunction1(value))
  }
}
