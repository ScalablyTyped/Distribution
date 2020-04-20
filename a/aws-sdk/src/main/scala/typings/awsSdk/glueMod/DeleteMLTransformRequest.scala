package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMLTransformRequest extends js.Object {
  /**
    * The unique identifier of the transform to delete.
    */
  var TransformId: HashString = js.native
}

object DeleteMLTransformRequest {
  @scala.inline
  def apply(TransformId: HashString): DeleteMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMLTransformRequest]
  }
}

