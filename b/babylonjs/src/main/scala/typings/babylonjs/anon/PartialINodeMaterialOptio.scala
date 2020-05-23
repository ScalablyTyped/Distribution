package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.INodeMaterialOptions> */
trait PartialINodeMaterialOptio extends js.Object {
  var emitComments: js.UndefOr[Boolean] = js.undefined
}

object PartialINodeMaterialOptio {
  @scala.inline
  def apply(emitComments: js.UndefOr[Boolean] = js.undefined): PartialINodeMaterialOptio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitComments)) __obj.updateDynamic("emitComments")(emitComments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialINodeMaterialOptio]
  }
}

