package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMLTransformsResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The identifiers of all the machine learning transforms in the account, or the machine learning transforms with the specified tags.
    */
  var TransformIds: TransformIdList = js.native
}

object ListMLTransformsResponse {
  @scala.inline
  def apply(TransformIds: TransformIdList, NextToken: PaginationToken = null): ListMLTransformsResponse = {
    val __obj = js.Dynamic.literal(TransformIds = TransformIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMLTransformsResponse]
  }
}

