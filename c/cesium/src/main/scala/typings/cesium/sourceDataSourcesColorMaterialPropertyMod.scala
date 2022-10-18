package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.ColorMaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesColorMaterialPropertyMod {
  
  @JSImport("cesium/Source/DataSources/ColorMaterialProperty", JSImport.Default)
  @js.native
  open class default () extends ColorMaterialProperty {
    def this(color: Color) = this()
    def this(color: Property) = this()
  }
}
