package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PivotTools")
@js.native
class PivotTools () extends js.Object

/* static members */
@JSGlobal("BABYLON.PivotTools")
@js.native
object PivotTools extends js.Object {
  var _OldPivotPoint: js.Any = js.native
  var _PivotCached: js.Any = js.native
  var _PivotTmpVector: js.Any = js.native
  var _PivotTranslation: js.Any = js.native
  /** @hidden */
  def _RemoveAndStorePivotPoint(mesh: AbstractMesh): Unit = js.native
  /** @hidden */
  def _RestorePivotPoint(mesh: AbstractMesh): Unit = js.native
}

