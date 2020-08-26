package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOutpostInput extends js.Object {
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId = js.native
}

object DeleteOutpostInput {
  @scala.inline
  def apply(OutpostId: OutpostId): DeleteOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutpostInput]
  }
  @scala.inline
  implicit class DeleteOutpostInputOps[Self <: DeleteOutpostInput] (val x: Self) extends AnyVal {
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
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
  }
  
}

