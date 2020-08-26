package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteObject extends js.Object {
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object BatchDeleteObject {
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchDeleteObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteObject]
  }
  @scala.inline
  implicit class BatchDeleteObjectOps[Self <: BatchDeleteObject] (val x: Self) extends AnyVal {
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
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
  }
  
}

