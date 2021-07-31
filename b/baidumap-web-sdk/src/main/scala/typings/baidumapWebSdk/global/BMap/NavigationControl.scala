package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.ControlAnchor
import typings.baidumapWebSdk.BMap.NavigationControlOptions
import typings.baidumapWebSdk.BMap.NavigationControlType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.NavigationControl")
@js.native
class NavigationControl ()
  extends StObject
     with typings.baidumapWebSdk.BMap.NavigationControl {
  def this(opts: NavigationControlOptions) = this()
  
  /* CompleteClass */
  var defaultAnchor: ControlAnchor = js.native
  
  /* CompleteClass */
  var defaultOffset: typings.baidumapWebSdk.BMap.Size = js.native
  
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  /* CompleteClass */
  override def getOffset(): typings.baidumapWebSdk.BMap.Size = js.native
  
  /* CompleteClass */
  override def getType(): NavigationControlOptions = js.native
  
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /* CompleteClass */
  override def initialize(map: typings.baidumapWebSdk.BMap.Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  /* CompleteClass */
  override def setOffset(offset: typings.baidumapWebSdk.BMap.Size): Unit = js.native
  
  /* CompleteClass */
  override def setType(`type`: NavigationControlType): Unit = js.native
  
  /* CompleteClass */
  override def show(): Unit = js.native
}
