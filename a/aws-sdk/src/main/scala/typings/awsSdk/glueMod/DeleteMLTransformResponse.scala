package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMLTransformResponse extends js.Object {
  /**
    * The unique identifier of the transform that was deleted.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object DeleteMLTransformResponse {
  @scala.inline
  def apply(TransformId: HashString = null): DeleteMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMLTransformResponse]
  }
}

