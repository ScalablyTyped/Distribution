package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.GeographicProjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreGeographicProjectionMod {
  
  @JSImport("cesium/Source/Core/GeographicProjection", JSImport.Default)
  @js.native
  open class default () extends GeographicProjection {
    def this(ellipsoid: Ellipsoid) = this()
  }
}
