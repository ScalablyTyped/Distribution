package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCollection
  extends StObject
     with Overlay {
  
  def clear(): Unit
  
  def onclick(event: typings.baidumapWebSdk.anon.Point): Unit
  
  def onmouseout(event: typings.baidumapWebSdk.anon.Point): Unit
  
  def onmouseover(event: typings.baidumapWebSdk.anon.Point): Unit
  
  def setPoints(points: js.Array[Point]): Unit
  
  def setStyles(styles: PointCollectionOption): Unit
}
object PointCollection {
  
  inline def apply(
    clear: () => Unit,
    onclick: typings.baidumapWebSdk.anon.Point => Unit,
    onmouseout: typings.baidumapWebSdk.anon.Point => Unit,
    onmouseover: typings.baidumapWebSdk.anon.Point => Unit,
    setPoints: js.Array[Point] => Unit,
    setStyles: PointCollectionOption => Unit
  ): PointCollection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), setPoints = js.Any.fromFunction1(setPoints), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[PointCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCollection] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setOnclick(value: typings.baidumapWebSdk.anon.Point => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnmouseout(value: typings.baidumapWebSdk.anon.Point => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseover(value: typings.baidumapWebSdk.anon.Point => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: js.Array[Point] => Unit): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetStyles(value: PointCollectionOption => Unit): Self = StObject.set(x, "setStyles", js.Any.fromFunction1(value))
  }
}
