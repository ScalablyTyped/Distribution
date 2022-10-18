package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.SkyAtmosphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneSkyAtmosphereMod {
  
  @JSImport("cesium/Source/Scene/SkyAtmosphere", JSImport.Default)
  @js.native
  open class default () extends SkyAtmosphere {
    def this(ellipsoid: Ellipsoid) = this()
  }
}
