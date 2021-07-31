package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.Callback
import typings.bmapgl.BMapGL.PanoramaLabelOptions
import typings.bmapgl.BMapGL.PanoramaPov
import typings.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.PanoramaLabel")
@js.native
class PanoramaLabel protected ()
  extends StObject
     with typings.bmapgl.BMapGL.PanoramaLabel {
  def this(content: String) = this()
  def this(content: String, opts: PanoramaLabelOptions) = this()
  
  /* CompleteClass */
  override def addEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  
  /* CompleteClass */
  override def getContent(): String = js.native
  
  /* CompleteClass */
  override def getPosition(): typings.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def getPov(): PanoramaPov = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def onmouseout(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def onmouseover(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def onremove(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def removeEventListener(event: String, handler: Callback): Unit = js.native
  
  /* CompleteClass */
  override def setAltitude(altitude: Double): Unit = js.native
  
  /* CompleteClass */
  override def setContent(content: String): Unit = js.native
  
  /* CompleteClass */
  override def setPosition(position: typings.bmapgl.BMapGL.Point): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
