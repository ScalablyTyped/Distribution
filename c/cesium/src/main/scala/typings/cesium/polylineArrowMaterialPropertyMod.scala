package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.PolylineArrowMaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineArrowMaterialPropertyMod {
  
  @JSImport("cesium/Source/DataSources/PolylineArrowMaterialProperty", JSImport.Default)
  @js.native
  open class default () extends PolylineArrowMaterialProperty {
    def this(color: Color) = this()
    def this(color: Property) = this()
  }
}
