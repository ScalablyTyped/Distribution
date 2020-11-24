package typings.bmapgl.global

import typings.bmapgl.BMapGL.DistanceToolOptions
import typings.bmapgl.BMapGL.DrawingManagerOptions
import typings.bmapgl.BMapGL.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGLLib")
@js.native
object BMapGLLib extends js.Object {
  
  @js.native
  class DistanceTool protected ()
    extends typings.bmapgl.BMapGLLib.DistanceTool {
    def this(map: Map) = this()
    def this(map: Map, opts: DistanceToolOptions) = this()
  }
  
  @js.native
  class DrawingManager protected ()
    extends typings.bmapgl.BMapGLLib.DrawingManager {
    def this(map: Map) = this()
    def this(map: Map, opts: DrawingManagerOptions) = this()
  }
}
