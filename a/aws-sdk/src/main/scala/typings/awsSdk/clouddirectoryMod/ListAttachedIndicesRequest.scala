package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedIndicesRequest extends js.Object {
  /**
    * The consistency level to use for this operation.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference = js.native
}

object ListAttachedIndicesRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    TargetReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListAttachedIndicesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedIndicesRequest]
  }
}

