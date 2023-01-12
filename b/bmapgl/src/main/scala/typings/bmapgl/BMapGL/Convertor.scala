package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Convertor extends StObject {
  
  def translate(
    points: js.Array[Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit
}
object Convertor {
  
  inline def apply(translate: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => Unit): Convertor = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction4(translate))
    __obj.asInstanceOf[Convertor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Convertor] (val x: Self) extends AnyVal {
    
    inline def setTranslate(value: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction4(value))
  }
}
