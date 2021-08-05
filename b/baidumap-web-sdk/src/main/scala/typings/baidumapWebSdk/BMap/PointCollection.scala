package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCollection
  extends StObject
     with Overlay {
  
  def clear(): Unit
  
  def onclick(event: Type): Unit
  
  def onmouseout(event: Type): Unit
  
  def onmouseover(event: Type): Unit
  
  def setPoints(points: js.Array[Point]): Unit
  
  def setStyles(styles: PointCollectionOption): Unit
}
object PointCollection {
  
  inline def apply(
    clear: () => Unit,
    onclick: Type => Unit,
    onmouseout: Type => Unit,
    onmouseover: Type => Unit,
    setPoints: js.Array[Point] => Unit,
    setStyles: PointCollectionOption => Unit
  ): PointCollection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), setPoints = js.Any.fromFunction1(setPoints), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[PointCollection]
  }
  
  extension [Self <: PointCollection](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setOnclick(value: Type => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnmouseout(value: Type => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseover(value: Type => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: js.Array[Point] => Unit): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetStyles(value: PointCollectionOption => Unit): Self = StObject.set(x, "setStyles", js.Any.fromFunction1(value))
  }
}
