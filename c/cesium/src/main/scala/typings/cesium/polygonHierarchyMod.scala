package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.PolygonHierarchy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonHierarchyMod {
  
  @JSImport("cesium/Source/Core/PolygonHierarchy", JSImport.Default)
  @js.native
  open class default () extends PolygonHierarchy {
    def this(positions: js.Array[Cartesian3]) = this()
    def this(positions: js.Array[Cartesian3], holes: js.Array[PolygonHierarchy]) = this()
    def this(positions: Unit, holes: js.Array[PolygonHierarchy]) = this()
  }
}
