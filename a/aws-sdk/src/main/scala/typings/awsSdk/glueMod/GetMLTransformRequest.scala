package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformRequest extends js.Object {
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: HashString = js.native
}

object GetMLTransformRequest {
  @scala.inline
  def apply(TransformId: HashString): GetMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformRequest]
  }
}

