package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PivotTools")
@js.native
class PivotTools ()
  extends typings.babylonjs.legacyMod.PivotTools

/* static members */
@JSImport("babylonjs", "PivotTools")
@js.native
object PivotTools extends js.Object {
  var _OldPivotPoint: js.Any = js.native
  var _PivotCached: js.Any = js.native
  var _PivotTmpVector: js.Any = js.native
  var _PivotTranslation: js.Any = js.native
  /** @hidden */
  def _RemoveAndStorePivotPoint(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh): Unit = js.native
  /** @hidden */
  def _RestorePivotPoint(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh): Unit = js.native
}

