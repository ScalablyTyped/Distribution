package typings.bmapgl.global

import typings.bmapgl.BMapGL.DistanceToolOptions
import typings.bmapgl.BMapGL.DrawingManagerOptions
import typings.bmapgl.BMapGL.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BMapGLLib {
  
  @JSGlobal("BMapGLLib.DistanceTool")
  @js.native
  class DistanceTool protected ()
    extends typings.bmapgl.BMapGLLib.DistanceTool {
    def this(map: Map) = this()
    def this(map: Map, opts: DistanceToolOptions) = this()
  }
  
  @JSGlobal("BMapGLLib.DrawingManager")
  @js.native
  class DrawingManager protected ()
    extends typings.bmapgl.BMapGLLib.DrawingManager {
    def this(map: Map) = this()
    def this(map: Map, opts: DrawingManagerOptions) = this()
  }
}
