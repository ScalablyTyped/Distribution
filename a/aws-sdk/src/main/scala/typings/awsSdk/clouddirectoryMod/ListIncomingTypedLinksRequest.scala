package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIncomingTypedLinksRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
    */
  var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.native
  /**
    * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
    */
  var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object ListIncomingTypedLinksRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListIncomingTypedLinksRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIncomingTypedLinksRequest]
  }
  @scala.inline
  implicit class ListIncomingTypedLinksRequestOps[Self <: ListIncomingTypedLinksRequest] (val x: Self) extends AnyVal {
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
    def setFilterAttributeRangesVarargs(value: TypedLinkAttributeRange*): Self = this.set("FilterAttributeRanges", js.Array(value :_*))
    @scala.inline
    def setFilterAttributeRanges(value: TypedLinkAttributeRangeList): Self = this.set("FilterAttributeRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterAttributeRanges: Self = this.set("FilterAttributeRanges", js.undefined)
    @scala.inline
    def setFilterTypedLink(value: TypedLinkSchemaAndFacetName): Self = this.set("FilterTypedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTypedLink: Self = this.set("FilterTypedLink", js.undefined)
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

