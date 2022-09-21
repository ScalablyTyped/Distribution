package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.PushpinToolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.PushpinTool")
@js.native
open class PushpinTool protected ()
  extends StObject
     with typings.bmapgl.BMapGL.PushpinTool {
  def this(map: typings.bmapgl.BMapGL.Map) = this()
  def this(map: typings.bmapgl.BMapGL.Map, opts: PushpinToolOptions) = this()
  
  /* CompleteClass */
  override def close(): Boolean = js.native
  
  /* CompleteClass */
  override def getCursor(): String = js.native
  
  /* CompleteClass */
  override def getIcon(): typings.bmapgl.BMapGL.Icon = js.native
  
  /* CompleteClass */
  override def onmarkend(event: typings.bmapgl.anon.Marker): Unit = js.native
  
  /* CompleteClass */
  override def open(): Boolean = js.native
  
  /* CompleteClass */
  override def setCursor(cursor: String): String = js.native
  
  /* CompleteClass */
  override def setIcon(icon: typings.bmapgl.BMapGL.Icon): typings.bmapgl.BMapGL.Icon = js.native
}
