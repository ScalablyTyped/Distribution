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
  def apply(
    DirectoryArn: Arn,
    IndexReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    RangesOnIndexedValues: ObjectAttributeRangeList = null
  ): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any])
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RangesOnIndexedValues != null) __obj.updateDynamic("RangesOnIndexedValues")(RangesOnIndexedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexRequest]
  }
}

