package typings.cesium

import typings.cesium.mod.PositionProperty
import typings.cesium.mod.VelocityVectorProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesVelocityVectorPropertyMod {
  
  @JSImport("cesium/Source/DataSources/VelocityVectorProperty", JSImport.Default)
  @js.native
  open class default () extends VelocityVectorProperty {
    def this(position: PositionProperty) = this()
    def this(position: Unit, normalize: Boolean) = this()
    def this(position: PositionProperty, normalize: Boolean) = this()
  }
}
