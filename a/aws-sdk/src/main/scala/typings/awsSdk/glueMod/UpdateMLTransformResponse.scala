package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLTransformResponse extends js.Object {
  /**
    * The unique identifier for the transform that was updated.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object UpdateMLTransformResponse {
  @scala.inline
  def apply(TransformId: HashString = null): UpdateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLTransformResponse]
  }
}

