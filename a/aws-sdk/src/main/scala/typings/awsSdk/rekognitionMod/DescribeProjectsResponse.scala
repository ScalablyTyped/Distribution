package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectsResponse extends js.Object {
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * A list of project descriptions. The list is sorted by the date and time the projects are created.
    */
  var ProjectDescriptions: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectDescriptions] = js.native
}

object DescribeProjectsResponse {
  @scala.inline
  def apply(NextToken: ExtendedPaginationToken = null, ProjectDescriptions: ProjectDescriptions = null): DescribeProjectsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProjectDescriptions != null) __obj.updateDynamic("ProjectDescriptions")(ProjectDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectsResponse]
  }
}

