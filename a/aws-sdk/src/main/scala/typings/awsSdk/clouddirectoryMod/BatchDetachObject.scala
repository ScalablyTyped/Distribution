package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  /**
    * The name of the link.
    */
  var LinkName: typings.awsSdk.clouddirectoryMod.LinkName = js.native
  /**
    * Parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference = js.native
}

object BatchDetachObject {
  @scala.inline
  def apply(LinkName: LinkName, ParentReference: ObjectReference): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObject]
  }
  @scala.inline
  implicit class BatchDetachObjectOps[Self <: BatchDetachObject] (val x: Self) extends AnyVal {
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
    def setLinkName(value: LinkName): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentReference(value: ObjectReference): Self = this.set("ParentReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchReferenceName(value: BatchReferenceName): Self = this.set("BatchReferenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchReferenceName: Self = this.set("BatchReferenceName", js.undefined)
  }
  
}

