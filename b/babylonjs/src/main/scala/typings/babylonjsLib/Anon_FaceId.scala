package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FaceId extends js.Object {
  var faceId: scala.Double
  var idx: scala.Double
}

object Anon_FaceId {
  @scala.inline
  def apply(faceId: scala.Double, idx: scala.Double): Anon_FaceId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("faceId")(faceId)
    __obj.updateDynamic("idx")(idx)
    __obj.asInstanceOf[Anon_FaceId]
  }
}

