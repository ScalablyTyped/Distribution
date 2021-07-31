package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.ControlAnchor
import typings.bmapgl.BMapGL.OverviewMapControlOptions
import typings.bmapgl.anon.IsOpen
import typings.bmapgl.anon.Target
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.OverviewMapControl")
@js.native
class OverviewMapControl protected ()
  extends StObject
     with typings.bmapgl.BMapGL.OverviewMapControl {
  def this(opts: OverviewMapControlOptions) = this()
  
  /* CompleteClass */
  override def changeView(): Unit = js.native
  
  /* CompleteClass */
  var defaultAnchor: ControlAnchor = js.native
  
  /* CompleteClass */
  var defaultOffset: typings.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  /* CompleteClass */
  override def getOffset(): typings.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def getSize(): typings.bmapgl.BMapGL.Size = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typings.bmapgl.BMapGL.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def onviewchanged(event: IsOpen): Unit = js.native
  
  /* CompleteClass */
  override def onviewchanging(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typings.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def setSize(size: typings.bmapgl.BMapGL.Size): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
