package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PerformanceConfigurator")
@js.native
class PerformanceConfigurator ()
  extends typings.babylonjs.enginesIndexMod.PerformanceConfigurator
/* static members */
@JSImport("babylonjs/index", "PerformanceConfigurator")
@js.native
object PerformanceConfigurator extends js.Object {
  
  /** @hidden */
  var MatrixCurrentType: js.Any = js.native
  
  /** @hidden */
  var MatrixTrackPrecisionChange: Boolean = js.native
  
  /** @hidden */
  var MatrixTrackedMatrices: js.Array[_] | Null = js.native
  
  /** @hidden */
  var MatrixUse64Bits: Boolean = js.native
  
  /** @hidden */
  def SetMatrixPrecision(use64bits: Boolean): Unit = js.native
}
