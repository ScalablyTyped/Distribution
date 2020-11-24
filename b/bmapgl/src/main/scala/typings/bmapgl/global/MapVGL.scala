package typings.bmapgl.global

import typings.bmapgl.BMapGL.Map
import typings.bmapgl.MapVGL.LayerOptions
import typings.bmapgl.MapVGL.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MapVGL")
@js.native
object MapVGL extends js.Object {
  
  @js.native
  class Effects ()
    extends typings.bmapgl.MapVGL.Effects {
    def this(opts: js.Object) = this()
  }
  
  @js.native
  class Layer protected ()
    extends typings.bmapgl.MapVGL.Layer {
    def this(map: Map) = this()
    def this(map: Map, opts: LayerOptions) = this()
  }
  
  @js.native
  class View protected ()
    extends typings.bmapgl.MapVGL.View {
    def this(opts: ViewOptions) = this()
  }
}
