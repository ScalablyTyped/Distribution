package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.PositionProperty
import typings.cesium.mod.VelocityOrientationProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesVelocityOrientationPropertyMod {
  
  @JSImport("cesium/Source/DataSources/VelocityOrientationProperty", JSImport.Default)
  @js.native
  open class default () extends VelocityOrientationProperty {
    def this(position: PositionProperty) = this()
    def this(position: Unit, ellipsoid: Ellipsoid) = this()
    def this(position: PositionProperty, ellipsoid: Ellipsoid) = this()
  }
}
