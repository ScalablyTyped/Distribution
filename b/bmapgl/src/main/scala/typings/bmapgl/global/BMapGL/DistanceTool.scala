package typings.bmapgl.global.BMapGL

import typings.bmapgl.anon.Distance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.DistanceTool")
@js.native
open class DistanceTool protected ()
  extends StObject
     with typings.bmapgl.BMapGL.DistanceTool {
  def this(map: typings.bmapgl.BMapGL.Map) = this()
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def ondrawend(event: Distance): Unit = js.native
  
  /* CompleteClass */
  override def open(): Boolean = js.native
}
