package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformsResponse extends js.Object {
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of machine learning transforms.
    */
  var Transforms: TransformList = js.native
}

object GetMLTransformsResponse {
  @scala.inline
  def apply(Transforms: TransformList, NextToken: PaginationToken = null): GetMLTransformsResponse = {
    val __obj = js.Dynamic.literal(Transforms = Transforms.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformsResponse]
  }
}

