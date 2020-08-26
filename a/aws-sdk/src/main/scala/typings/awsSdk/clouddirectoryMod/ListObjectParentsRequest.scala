package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectParentsRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * When set to True, returns all ListObjectParentsResponse$ParentLinks. There could be multiple links between a parent-child pair.
    */
  var IncludeAllLinksToEachParent: js.UndefOr[Bool] = js.native
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The reference that identifies the object for which parent objects are being listed.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object ListObjectParentsRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListObjectParentsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectParentsRequest]
  }
  @scala.inline
  implicit class ListObjectParentsRequestOps[Self <: ListObjectParentsRequest] (val x: Self) extends AnyVal {
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
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = this.set("ConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("ConsistencyLevel", js.undefined)
    @scala.inline
    def setIncludeAllLinksToEachParent(value: Bool): Self = this.set("IncludeAllLinksToEachParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAllLinksToEachParent: Self = this.set("IncludeAllLinksToEachParent", js.undefined)
    @scala.inline
    def setMaxResults(value: NumberResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

