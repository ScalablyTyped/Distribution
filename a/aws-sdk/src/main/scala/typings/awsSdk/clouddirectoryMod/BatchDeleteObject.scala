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
}

