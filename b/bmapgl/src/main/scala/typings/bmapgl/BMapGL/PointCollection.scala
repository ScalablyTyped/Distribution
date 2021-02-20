package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Type
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
