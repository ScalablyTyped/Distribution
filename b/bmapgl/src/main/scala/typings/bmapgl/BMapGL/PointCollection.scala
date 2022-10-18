package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCollection
  extends StObject
     with Overlay {
  
  def clear(): Unit = js.native
  
  def onclick(event: typings.bmapgl.anon.Point): Unit = js.native
  
  def onmouseout(event: typings.bmapgl.anon.Point): Unit = js.native
  
  def onmouseover(event: typings.bmapgl.anon.Point): Unit = js.native
  
  def setPoints(points: js.Array[Point]): Unit = js.native
  
  def setStyles(styles: PointCollectionOption): Unit = js.native
}
