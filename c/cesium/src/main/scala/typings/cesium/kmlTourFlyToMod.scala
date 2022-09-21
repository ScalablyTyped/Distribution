package typings.cesium

import typings.cesium.mod.KmlCamera
import typings.cesium.mod.KmlLookAt
import typings.cesium.mod.KmlTourFlyTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmlTourFlyToMod {
  
  @JSImport("cesium/Source/DataSources/KmlTourFlyTo", JSImport.Default)
  @js.native
  open class default protected () extends KmlTourFlyTo {
    def this(duration: Double, flyToMode: String, view: KmlCamera) = this()
    def this(duration: Double, flyToMode: String, view: KmlLookAt) = this()
  }
}
