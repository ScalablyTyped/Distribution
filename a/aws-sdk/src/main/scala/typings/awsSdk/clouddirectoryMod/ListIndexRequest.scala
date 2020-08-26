package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndexRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory that the index exists in.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Specifies the ranges of indexed values that you want to query.
    */
  var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.native
}

object ListIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexRequest]
  }
  @scala.inline
  implicit class ListIndexRequestOps[Self <: ListIndexRequest] (val x: Self) extends AnyVal {
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
    def setIndexReference(value: ObjectReference): Self = this.set("IndexReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = this.set("ConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("ConsistencyLevel", js.undefined)
    @scala.inline
    def setMaxResults(value: NumberResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRangesOnIndexedValuesVarargs(value: ObjectAttributeRange*): Self = this.set("RangesOnIndexedValues", js.Array(value :_*))
    @scala.inline
    def setRangesOnIndexedValues(value: ObjectAttributeRangeList): Self = this.set("RangesOnIndexedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangesOnIndexedValues: Self = this.set("RangesOnIndexedValues", js.undefined)
  }
  
}

