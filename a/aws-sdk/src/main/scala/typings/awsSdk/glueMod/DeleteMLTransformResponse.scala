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
  def apply(): DeleteMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMLTransformResponse]
  }
  @scala.inline
  implicit class DeleteMLTransformResponseOps[Self <: DeleteMLTransformResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformId: Self = this.set("TransformId", js.undefined)
  }
  
}

