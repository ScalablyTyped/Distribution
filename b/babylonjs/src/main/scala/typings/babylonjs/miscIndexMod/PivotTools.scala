package typings.babylonjs.miscIndexMod

import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "PivotTools")
@js.native
open class PivotTools ()
  extends typings.babylonjs.pivotToolsMod.PivotTools
/* static members */
object PivotTools {
  
  @JSImport("babylonjs/Misc/index", "PivotTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/index", "PivotTools._OldPivotPoint")
  @js.native
  def _OldPivotPoint: Any = js.native
  inline def _OldPivotPoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OldPivotPoint")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "PivotTools._PivotCached")
  @js.native
  def _PivotCached: Any = js.native
  inline def _PivotCached_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotCached")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "PivotTools._PivotPostMultiplyPivotMatrix")
  @js.native
  def _PivotPostMultiplyPivotMatrix: Any = js.native
  inline def _PivotPostMultiplyPivotMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotPostMultiplyPivotMatrix")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "PivotTools._PivotTmpVector")
  @js.native
  def _PivotTmpVector: Any = js.native
  inline def _PivotTmpVector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTmpVector")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "PivotTools._PivotTranslation")
  @js.native
  def _PivotTranslation: Any = js.native
  inline def _PivotTranslation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTranslation")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _RemoveAndStorePivotPoint(mesh: TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RemoveAndStorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _RestorePivotPoint(mesh: TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RestorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
