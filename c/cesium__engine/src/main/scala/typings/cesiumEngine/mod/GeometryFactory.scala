package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeometryFactory")
@js.native
open class GeometryFactory () extends StObject
/* static members */
object GeometryFactory {
  
  @JSImport("@cesium/engine", "GeometryFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a geometry.
    * @param geometryFactory - A description of the circle.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(geometryFactory: GeometryFactory): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(geometryFactory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
}
