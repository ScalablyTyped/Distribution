package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.int
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixLike extends js.Object {
  var updateFlag: int
  def toArray(): DeepImmutable[Float32Array]
}

object IMatrixLike {
  @scala.inline
  def apply(toArray: () => DeepImmutable[Float32Array], updateFlag: int): IMatrixLike = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixLike]
  }
}

