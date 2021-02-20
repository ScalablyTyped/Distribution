package typings.bmapgl.global

import typings.bmapgl.BMapGL.Map
import typings.bmapgl.MapVGL.LayerOptions
import typings.bmapgl.MapVGL.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  @JSGlobal("MapVGL.Effects")
  @js.native
  class Effects ()
    extends typings.bmapgl.MapVGL.Effects {
    def this(opts: js.Object) = this()
  }
  
  @JSGlobal("MapVGL.Layer")
  @js.native
  class Layer protected ()
    extends typings.bmapgl.MapVGL.Layer {
    def this(map: Map) = this()
    def this(map: Map, opts: LayerOptions) = this()
  }
  
  @JSGlobal("MapVGL.View")
  @js.native
  class View protected ()
    extends typings.bmapgl.MapVGL.View {
    def this(opts: ViewOptions) = this()
  }
}
