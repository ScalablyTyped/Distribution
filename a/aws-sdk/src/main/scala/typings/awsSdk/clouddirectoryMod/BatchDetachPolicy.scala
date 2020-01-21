package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachPolicy extends js.Object {
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}

object BatchDetachPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchDetachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDetachPolicy]
  }
}

