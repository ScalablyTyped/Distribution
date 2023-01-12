package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundary extends StObject {
  
  def get(name: String, callback: js.Function1[/* result */ js.Array[String], Unit]): Unit
}
object Boundary {
  
  inline def apply(get: (String, js.Function1[/* result */ js.Array[String], Unit]) => Unit): Boundary = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Boundary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boundary] (val x: Self) extends AnyVal {
    
    inline def setGet(value: (String, js.Function1[/* result */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
  }
}
