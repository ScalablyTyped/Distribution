package typings.cesium

import typings.cesium.mod.ReferenceFrame
import typings.cesium.mod.SampledPositionProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampledPositionPropertyMod {
  
  @JSImport("cesium/Source/DataSources/SampledPositionProperty", JSImport.Default)
  @js.native
  open class default () extends SampledPositionProperty {
    def this(referenceFrame: ReferenceFrame) = this()
    def this(referenceFrame: Unit, numberOfDerivatives: Double) = this()
    def this(referenceFrame: ReferenceFrame, numberOfDerivatives: Double) = this()
  }
}
