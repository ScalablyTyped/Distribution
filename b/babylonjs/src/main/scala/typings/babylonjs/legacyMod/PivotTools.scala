package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PivotTools")
@js.native
open class PivotTools ()
  extends typings.babylonjs.indexMod.PivotTools
/* static members */
object PivotTools {
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools._OldPivotPoint")
  @js.native
  def _OldPivotPoint: Any = js.native
  inline def _OldPivotPoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OldPivotPoint")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools._PivotCached")
  @js.native
  def _PivotCached: Any = js.native
  inline def _PivotCached_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotCached")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools._PivotPostMultiplyPivotMatrix")
  @js.native
  def _PivotPostMultiplyPivotMatrix: Any = js.native
  inline def _PivotPostMultiplyPivotMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotPostMultiplyPivotMatrix")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools._PivotTmpVector")
  @js.native
  def _PivotTmpVector: Any = js.native
  inline def _PivotTmpVector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTmpVector")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PivotTools._PivotTranslation")
  @js.native
  def _PivotTranslation: Any = js.native
  inline def _PivotTranslation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTranslation")(x.asInstanceOf[js.Any])
  
  /**
    * @param mesh
    * @hidden
    */
  inline def _RemoveAndStorePivotPoint(mesh: typings.babylonjs.transformNodeMod.TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RemoveAndStorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @param mesh
    * @hidden
    */
  inline def _RestorePivotPoint(mesh: typings.babylonjs.transformNodeMod.TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RestorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
