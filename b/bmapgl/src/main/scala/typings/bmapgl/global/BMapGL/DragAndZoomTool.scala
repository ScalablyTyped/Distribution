package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.DragAndZoomToolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.DragAndZoomTool")
@js.native
open class DragAndZoomTool protected ()
  extends StObject
     with typings.bmapgl.BMapGL.DragAndZoomTool {
  def this(map: typings.bmapgl.BMapGL.Map) = this()
  def this(map: typings.bmapgl.BMapGL.Map, opts: DragAndZoomToolOptions) = this()
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def ondrawend(event: typings.bmapgl.anon.Bounds): Unit = js.native
  
  /* CompleteClass */
  override def open(): Boolean = js.native
}
