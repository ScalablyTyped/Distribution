package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateIndex extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool = js.native
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList = js.native
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
}

object BatchCreateIndex {
  @scala.inline
  def apply(
    IsUnique: Bool,
    OrderedIndexedAttributeList: AttributeKeyList,
    BatchReferenceName: BatchReferenceName = null,
    LinkName: LinkName = null,
    ParentReference: ObjectReference = null
  ): BatchCreateIndex = {
    val __obj = js.Dynamic.literal(IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    if (BatchReferenceName != null) __obj.updateDynamic("BatchReferenceName")(BatchReferenceName.asInstanceOf[js.Any])
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    if (ParentReference != null) __obj.updateDynamic("ParentReference")(ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateIndex]
  }
}

