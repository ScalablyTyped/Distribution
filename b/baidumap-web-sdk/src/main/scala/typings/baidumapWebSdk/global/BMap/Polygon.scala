package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Callback
import typings.baidumapWebSdk.BMap.PolygonOptions
import typings.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Polygon")
@js.native
class Polygon protected ()
  extends StObject
     with typings.baidumapWebSdk.BMap.Polygon {
  def this(points: js.Array[typings.baidumapWebSdk.BMap.Point]) = this()
  def this(points: js.Array[typings.baidumapWebSdk.BMap.Point], opts: PolygonOptions) = this()
  
  /* CompleteClass */
  override def addEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def disableEditing(): Unit = js.native
  
  /* CompleteClass */
  override def disableMassClear(): Unit = js.native
  
  /* CompleteClass */
  override def enableEditing(): Unit = js.native
  
  /* CompleteClass */
  override def enableMassClear(): Unit = js.native
  
  /* CompleteClass */
  override def getBounds(): typings.baidumapWebSdk.BMap.Bounds = js.native
  
  /* CompleteClass */
  override def getFillColor(): String = js.native
  
  /* CompleteClass */
  override def getFillOpacity(): Double = js.native
  
  /* CompleteClass */
  override def getMap(): typings.baidumapWebSdk.BMap.Map = js.native
  
  /* CompleteClass */
  override def getPath(): js.Array[typings.baidumapWebSdk.BMap.Point] = js.native
  
  /* CompleteClass */
  override def getStrokeColor(): String = js.native
  
  /* CompleteClass */
  override def getStrokeOpacity(): Double = js.native
  
  /* CompleteClass */
  override def getStrokeStyle(): String = js.native
  
  /* CompleteClass */
  override def getStrokeWeight(): Double = js.native
  
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def ondblclick(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onlineupdate(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def onmousedown(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseout(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseover(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onmouseup(event: typings.baidumapWebSdk.anon.Pixel): Unit = js.native
  
  /* CompleteClass */
  override def onremove(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def setFillColor(color: String): Unit = js.native
  
  /* CompleteClass */
  override def setFillOpacity(opacity: Double): Unit = js.native
  
  /* CompleteClass */
  override def setPath(path: js.Array[typings.baidumapWebSdk.BMap.Point]): Unit = js.native
  
  /* CompleteClass */
  override def setPointAt(index: Double, point: typings.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def setPositionAt(index: Double, point: typings.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeColor(color: String): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeOpacity(opacity: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeStyle(style: String): Unit = js.native
  
  /* CompleteClass */
  override def setStrokeWeight(weight: Double): Unit = js.native
}
