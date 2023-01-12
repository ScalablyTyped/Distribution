package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalCity extends StObject {
  
  def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit
}
object LocalCity {
  
  inline def apply(get: js.Function1[/* result */ LocalCityResult, Unit] => Unit): LocalCity = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LocalCity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalCity] (val x: Self) extends AnyVal {
    
    inline def setGet(value: js.Function1[/* result */ LocalCityResult, Unit] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
