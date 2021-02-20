package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PerformanceConfigurator")
@js.native
class PerformanceConfigurator ()
  extends typings.babylonjs.legacyMod.PerformanceConfigurator
/* static members */
object PerformanceConfigurator {
  
  @JSImport("babylonjs", "PerformanceConfigurator")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs", "PerformanceConfigurator.MatrixCurrentType")
  @js.native
  def MatrixCurrentType: js.Any = js.native
  @scala.inline
  def MatrixCurrentType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixCurrentType")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs", "PerformanceConfigurator.MatrixTrackPrecisionChange")
  @js.native
  def MatrixTrackPrecisionChange: Boolean = js.native
  @scala.inline
  def MatrixTrackPrecisionChange_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackPrecisionChange")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs", "PerformanceConfigurator.MatrixTrackedMatrices")
  @js.native
  def MatrixTrackedMatrices: js.Array[js.Any] | Null = js.native
  @scala.inline
  def MatrixTrackedMatrices_=(x: js.Array[js.Any] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackedMatrices")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs", "PerformanceConfigurator.MatrixUse64Bits")
  @js.native
  def MatrixUse64Bits: Boolean = js.native
  @scala.inline
  def MatrixUse64Bits_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixUse64Bits")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs", "PerformanceConfigurator.SetMatrixPrecision")
  @js.native
  def SetMatrixPrecision(use64bits: Boolean): Unit = js.native
}
