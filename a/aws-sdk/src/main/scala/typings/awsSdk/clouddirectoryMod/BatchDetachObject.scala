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
  def apply(
    LinkName: LinkName,
    ParentReference: ObjectReference,
    BatchReferenceName: BatchReferenceName = null
  ): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObject]
  }
}

