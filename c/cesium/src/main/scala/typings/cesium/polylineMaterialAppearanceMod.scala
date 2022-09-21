package typings.cesium

import typings.cesium.anon.Material
import typings.cesium.mod.PolylineMaterialAppearance
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMaterialAppearanceMod {
  
  @JSImport("cesium/Source/Scene/PolylineMaterialAppearance", JSImport.Default)
  @js.native
  open class default () extends PolylineMaterialAppearance {
    def this(options: Material) = this()
  }
  /* static members */
  object default {
    
    /**
      * The {@link VertexFormat} that all {@link PolylineMaterialAppearance} instances
      * are compatible with. This requires <code>position</code> and <code>st</code> attributes.
      */
    @JSImport("cesium/Source/Scene/PolylineMaterialAppearance", "default.VERTEX_FORMAT")
    @js.native
    val VERTEX_FORMAT: VertexFormat = js.native
  }
}
