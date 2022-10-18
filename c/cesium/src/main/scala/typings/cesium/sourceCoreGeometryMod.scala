package typings.cesium

import typings.cesium.anon.Attributes
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreGeometryMod {
  
  @JSImport("cesium/Source/Core/Geometry", JSImport.Default)
  @js.native
  open class default protected () extends Geometry {
    def this(options: Attributes) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Geometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the number of vertices in a geometry.  The runtime is linear with
      * respect to the number of attributes in a vertex, not the number of vertices.
      * @example
      * const numVertices = Cesium.Geometry.computeNumberOfVertices(geometry);
      * @param geometry - The geometry.
      * @returns The number of vertices in the geometry.
      */
    inline def computeNumberOfVertices(geometry: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNumberOfVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
