package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Callback
import typings.baidumapWebSdk.BMap.PanoramaLabelOptions
import typings.baidumapWebSdk.BMap.PanoramaPov
import typings.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaLabel")
@js.native
class PanoramaLabel protected ()
  extends typings.baidumapWebSdk.BMap.PanoramaLabel {
  def this(content: String) = this()
  def this(content: String, opts: PanoramaLabelOptions) = this()
  /* CompleteClass */
  override def addEventListener(event: String, handler: Callback): Unit = js.native
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  /* CompleteClass */
  override def getContent(): String = js.native
  /* CompleteClass */
  override def getPosition(): typings.baidumapWebSdk.BMap.Point = js.native
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
  override def setPosition(position: typings.baidumapWebSdk.BMap.Point): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

