package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImageBuildVersionsRequest extends js.Object {
  /**
    *  
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image whose build versions you wish to retrieve. 
    */
  var imageVersionArn: ImageVersionArn = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListImageBuildVersionsRequest {
  @scala.inline
  def apply(
    imageVersionArn: ImageVersionArn,
    filters: FilterList = null,
    maxResults: Int | Double = null,
    nextToken: NonEmptyString = null
  ): ListImageBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(imageVersionArn = imageVersionArn.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageBuildVersionsRequest]
  }
}

