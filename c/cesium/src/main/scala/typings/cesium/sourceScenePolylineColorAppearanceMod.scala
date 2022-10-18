package typings.cesium

import typings.cesium.anon.FragmentShaderSource
import typings.cesium.mod.PolylineColorAppearance
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceScenePolylineColorAppearanceMod {
  
  @JSImport("cesium/Source/Scene/PolylineColorAppearance", JSImport.Default)
  @js.native
  open class default () extends PolylineColorAppearance {
    def this(options: FragmentShaderSource) = this()
  }
  /* static members */
  object default {
    
    /**
      * The {@link VertexFormat} that all {@link PolylineColorAppearance} instances
      * are compatible with. This requires only a <code>position</code> attribute.
      */
    @JSImport("cesium/Source/Scene/PolylineColorAppearance", "default.VERTEX_FORMAT")
    @js.native
    val VERTEX_FORMAT: VertexFormat = js.native
  }
}
