package typings.cesium

import typings.cesium.mod.Geometry
import typings.cesium.mod.GeometryFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryFactoryMod {
  
  @JSImport("cesium/Source/Core/GeometryFactory", JSImport.Default)
  @js.native
  open class default () extends GeometryFactory
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/GeometryFactory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a geometry.
      * @param geometryFactory - A description of the circle.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(geometryFactory: GeometryFactory): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(geometryFactory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  }
}
