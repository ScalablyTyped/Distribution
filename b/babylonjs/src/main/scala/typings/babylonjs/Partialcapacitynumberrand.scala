package typings.babylonjs

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
  def apply(capacity: Int | Double = null, randomTextureSize: Int | Double = null): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (randomTextureSize != null) __obj.updateDynamic("randomTextureSize")(randomTextureSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
}

