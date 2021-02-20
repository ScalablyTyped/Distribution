package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCollection extends Overlay {
  
  def clear(): Unit = js.native
  
  def onclick(event: Type): Unit = js.native
  
  def onmouseout(event: Type): Unit = js.native
  
  def onmouseover(event: Type): Unit = js.native
  
  def setPoints(points: js.Array[Point]): Unit = js.native
  
  def setStyles(styles: PointCollectionOption): Unit = js.native
}
object PointCollection {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PointCollectionMutableBuilder[Self <: PointCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclick(value: Type => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseout(value: Type => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseover(value: Type => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: js.Array[Point] => Unit): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyles(value: PointCollectionOption => Unit): Self = StObject.set(x, "setStyles", js.Any.fromFunction1(value))
  }
}
