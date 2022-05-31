package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PivotTools")
@js.native
class PivotTools ()
  extends StObject
     with typings.babylonjs.BABYLON.PivotTools
/* static members */
object PivotTools {
  
  @JSGlobal("BABYLON.PivotTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PivotTools._OldPivotPoint")
  @js.native
  def _OldPivotPoint: js.Any = js.native
  inline def _OldPivotPoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OldPivotPoint")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotCached")
  @js.native
  def _PivotCached: js.Any = js.native
  inline def _PivotCached_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotCached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotPostMultiplyPivotMatrix")
  @js.native
  def _PivotPostMultiplyPivotMatrix: js.Any = js.native
  inline def _PivotPostMultiplyPivotMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotPostMultiplyPivotMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotTmpVector")
  @js.native
  def _PivotTmpVector: js.Any = js.native
  inline def _PivotTmpVector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTmpVector")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotTranslation")
  @js.native
  def _PivotTranslation: js.Any = js.native
  inline def _PivotTranslation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTranslation")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  inline def _RemoveAndStorePivotPoint(mesh: typings.babylonjs.BABYLON.AbstractMesh): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RemoveAndStorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** @hidden */
  inline def _RestorePivotPoint(mesh: typings.babylonjs.BABYLON.AbstractMesh): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RestorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
