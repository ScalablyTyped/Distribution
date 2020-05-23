package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceId extends js.Object {
  var faceId: Double
  var idx: Double
}

object FaceId {
  @scala.inline
  def apply(faceId: Double, idx: Double): FaceId = {
    val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceId]
  }
}

