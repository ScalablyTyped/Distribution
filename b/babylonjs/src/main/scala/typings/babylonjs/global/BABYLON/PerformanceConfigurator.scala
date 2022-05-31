package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PerformanceConfigurator")
@js.native
class PerformanceConfigurator ()
  extends StObject
     with typings.babylonjs.BABYLON.PerformanceConfigurator
/* static members */
object PerformanceConfigurator {
  
  @JSGlobal("BABYLON.PerformanceConfigurator")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixCurrentType")
  @js.native
  def MatrixCurrentType: js.Any = js.native
  inline def MatrixCurrentType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixCurrentType")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixTrackPrecisionChange")
  @js.native
  def MatrixTrackPrecisionChange: Boolean = js.native
  inline def MatrixTrackPrecisionChange_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackPrecisionChange")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixTrackedMatrices")
  @js.native
  def MatrixTrackedMatrices: js.Array[js.Any] | Null = js.native
  inline def MatrixTrackedMatrices_=(x: js.Array[js.Any] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackedMatrices")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PerformanceConfigurator.MatrixUse64Bits")
  @js.native
  def MatrixUse64Bits: Boolean = js.native
  inline def MatrixUse64Bits_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixUse64Bits")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  inline def SetMatrixPrecision(use64bits: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetMatrixPrecision")(use64bits.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
