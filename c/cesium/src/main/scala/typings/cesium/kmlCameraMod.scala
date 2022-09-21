package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.HeadingPitchRoll
import typings.cesium.mod.KmlCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmlCameraMod {
  
  @JSImport("cesium/Source/DataSources/KmlCamera", JSImport.Default)
  @js.native
  open class default protected () extends KmlCamera {
    def this(position: Cartesian3, headingPitchRoll: HeadingPitchRoll) = this()
  }
}
