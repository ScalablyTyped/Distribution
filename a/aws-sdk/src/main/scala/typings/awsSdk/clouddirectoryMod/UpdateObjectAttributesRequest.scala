package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateObjectAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object UpdateObjectAttributesRequest {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, DirectoryArn: Arn, ObjectReference: ObjectReference): UpdateObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObjectAttributesRequest]
  }
  @scala.inline
  implicit class UpdateObjectAttributesRequestOps[Self <: UpdateObjectAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAttributeUpdatesVarargs(value: ObjectAttributeUpdate*): Self = this.set("AttributeUpdates", js.Array(value :_*))
    @scala.inline
    def setAttributeUpdates(value: ObjectAttributeUpdateList): Self = this.set("AttributeUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
  }
  
}

