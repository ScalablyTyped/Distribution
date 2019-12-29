package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkPathEffect extends SkObject[SkPathEffect]

object SkPathEffect {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkPathEffect = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
  
    __obj.asInstanceOf[SkPathEffect]
  }
}

