package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMLTransformsRequest extends js.Object {
  /**
    * A TransformFilterCriteria used to filter the machine learning transforms.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.native
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A TransformSortCriteria used to sort the machine learning transforms.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.native
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}

object ListMLTransformsRequest {
  @scala.inline
  def apply(
    Filter: TransformFilterCriteria = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: PaginationToken = null,
    Sort: TransformSortCriteria = null,
    Tags: TagsMap = null
  ): ListMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMLTransformsRequest]
  }
}

