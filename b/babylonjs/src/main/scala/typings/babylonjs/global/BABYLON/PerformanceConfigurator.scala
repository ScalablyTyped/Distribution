package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PerformanceConfigurator")
@js.native
class PerformanceConfigurator ()
  extends typings.babylonjs.BABYLON.PerformanceConfigurator
/* static members */
object PerformanceConfigurator {
  
  @JSGlobal("BABYLON.PerformanceConfigurator")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixCurrentType")
  @js.native
  def MatrixCurrentType: js.Any = js.native
  @scala.inline
  def MatrixCurrentType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixCurrentType")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixTrackPrecisionChange")
  @js.native
  def MatrixTrackPrecisionChange: Boolean = js.native
  @scala.inline
  def MatrixTrackPrecisionChange_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackPrecisionChange")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixTrackedMatrices")
  @js.native
  def MatrixTrackedMatrices: js.Array[js.Any] | Null = js.native
  @scala.inline
  def MatrixTrackedMatrices_=(x: js.Array[js.Any] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackedMatrices")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixUse64Bits")
  @js.native
  def MatrixUse64Bits: Boolean = js.native
  @scala.inline
  def MatrixUse64Bits_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixUse64Bits")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.SetMatrixPrecision")
  @js.native
  def SetMatrixPrecision(use64bits: Boolean): Unit = js.native
}
