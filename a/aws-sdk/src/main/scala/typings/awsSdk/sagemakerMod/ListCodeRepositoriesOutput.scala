package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCodeRepositoriesOutput extends js.Object {
  /**
    * Gets a list of summaries of the Git repositories. Each summary specifies the following values for the repository:    Name   Amazon Resource Name (ARN)   Creation time   Last modified time   Configuration information, including the URL location of the repository and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.  
    */
  var CodeRepositorySummaryList: typings.awsSdk.sagemakerMod.CodeRepositorySummaryList = js.native
  /**
    * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of Git repositories, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListCodeRepositoriesOutput {
  @scala.inline
  def apply(CodeRepositorySummaryList: CodeRepositorySummaryList): ListCodeRepositoriesOutput = {
    val __obj = js.Dynamic.literal(CodeRepositorySummaryList = CodeRepositorySummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeRepositoriesOutput]
  }
  @scala.inline
  implicit class ListCodeRepositoriesOutputOps[Self <: ListCodeRepositoriesOutput] (val x: Self) extends AnyVal {
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
    def setCodeRepositorySummaryListVarargs(value: CodeRepositorySummary*): Self = this.set("CodeRepositorySummaryList", js.Array(value :_*))
    @scala.inline
    def setCodeRepositorySummaryList(value: CodeRepositorySummaryList): Self = this.set("CodeRepositorySummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

