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
  def apply(): DescribeProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectsResponse]
  }
  @scala.inline
  implicit class DescribeProjectsResponseOps[Self <: DescribeProjectsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: ExtendedPaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProjectDescriptionsVarargs(value: ProjectDescription*): Self = this.set("ProjectDescriptions", js.Array(value :_*))
    @scala.inline
    def setProjectDescriptions(value: ProjectDescriptions): Self = this.set("ProjectDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDescriptions: Self = this.set("ProjectDescriptions", js.undefined)
  }
  
}

