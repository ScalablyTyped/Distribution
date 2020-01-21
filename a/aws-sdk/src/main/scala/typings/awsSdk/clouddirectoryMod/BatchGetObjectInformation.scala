package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectInformation extends js.Object {
  /**
    * A reference to the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object BatchGetObjectInformation {
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchGetObjectInformation = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetObjectInformation]
  }
}

