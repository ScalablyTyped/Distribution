package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ConstantSpline
import typings.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreConstantSplineMod {
  
  @JSImport("cesium/Source/Core/ConstantSpline", JSImport.Default)
  @js.native
  open class default protected () extends ConstantSpline {
    def this(value: Double) = this()
    def this(value: Cartesian3) = this()
    def this(value: Quaternion) = this()
  }
}
