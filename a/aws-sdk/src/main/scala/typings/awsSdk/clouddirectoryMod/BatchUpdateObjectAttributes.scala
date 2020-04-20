package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateObjectAttributes extends js.Object {
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  /**
    * Reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object BatchUpdateObjectAttributes {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, ObjectReference: ObjectReference): BatchUpdateObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateObjectAttributes]
  }
}

