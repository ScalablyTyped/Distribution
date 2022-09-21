package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.DragAndZoomToolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.DragAndZoomTool")
@js.native
open class DragAndZoomTool protected ()
  extends StObject
     with typings.baidumapWebSdk.BMap.DragAndZoomTool {
  def this(map: typings.baidumapWebSdk.BMap.Map) = this()
  def this(map: typings.baidumapWebSdk.BMap.Map, opts: DragAndZoomToolOptions) = this()
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def ondrawend(event: typings.baidumapWebSdk.anon.Bounds): Unit = js.native
  
  /* CompleteClass */
  override def open(): Boolean = js.native
}
