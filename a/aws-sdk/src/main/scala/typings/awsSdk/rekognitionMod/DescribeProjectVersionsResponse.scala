package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectVersionsResponse extends js.Object {
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to earliest.
    */
  var ProjectVersionDescriptions: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectVersionDescriptions] = js.native
}

object DescribeProjectVersionsResponse {
  @scala.inline
  def apply(
    NextToken: ExtendedPaginationToken = null,
    ProjectVersionDescriptions: ProjectVersionDescriptions = null
  ): DescribeProjectVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProjectVersionDescriptions != null) __obj.updateDynamic("ProjectVersionDescriptions")(ProjectVersionDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectVersionsResponse]
  }
}

