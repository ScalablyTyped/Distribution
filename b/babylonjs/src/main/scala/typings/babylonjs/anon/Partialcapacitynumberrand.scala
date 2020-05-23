package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  capacity  :number,   randomTextureSize  :number}> */
trait Partialcapacitynumberrand extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
  var randomTextureSize: js.UndefOr[Double] = js.undefined
}

object Partialcapacitynumberrand {
  @scala.inline
  def apply(capacity: js.UndefOr[Double] = js.undefined, randomTextureSize: js.UndefOr[Double] = js.undefined): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capacity)) __obj.updateDynamic("capacity")(capacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomTextureSize)) __obj.updateDynamic("randomTextureSize")(randomTextureSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
}

