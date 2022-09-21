package typings.cesium

import typings.cesium.anon.DistanceDisplayCondition
import typings.cesium.mod.Polyline
import typings.cesium.mod.PolylineCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("cesium/Source/Scene/Polyline", JSImport.Default)
  @js.native
  open class default protected () extends Polyline {
    def this(options: DistanceDisplayCondition, polylineCollection: PolylineCollection) = this()
  }
}
