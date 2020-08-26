package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexRequest extends js.Object {
  /**
    * The ARN of the directory where the index should be created.
    */
  var DirectoryArn: Arn = js.native
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

object CreateIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IsUnique: Bool, OrderedIndexedAttributeList: AttributeKeyList): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  @scala.inline
  implicit class CreateIndexRequestOps[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUnique(value: Bool): Self = this.set("IsUnique", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderedIndexedAttributeListVarargs(value: AttributeKey*): Self = this.set("OrderedIndexedAttributeList", js.Array(value :_*))
    @scala.inline
    def setOrderedIndexedAttributeList(value: AttributeKeyList): Self = this.set("OrderedIndexedAttributeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkName(value: LinkName): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkName: Self = this.set("LinkName", js.undefined)
    @scala.inline
    def setParentReference(value: ObjectReference): Self = this.set("ParentReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentReference: Self = this.set("ParentReference", js.undefined)
  }
  
}

