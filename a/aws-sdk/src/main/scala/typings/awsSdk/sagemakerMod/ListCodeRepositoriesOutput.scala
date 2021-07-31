package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeRepositoriesOutput extends StObject {
  
  /**
    * Gets a list of summaries of the Git repositories. Each summary specifies the following values for the repository:    Name   Amazon Resource Name (ARN)   Creation time   Last modified time   Configuration information, including the URL location of the repository and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.  
    */
  var CodeRepositorySummaryList: typings.awsSdk.sagemakerMod.CodeRepositorySummaryList
  
  /**
    * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of Git repositories, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListCodeRepositoriesOutput {
  
  @scala.inline
  def apply(CodeRepositorySummaryList: CodeRepositorySummaryList): ListCodeRepositoriesOutput = {
    val __obj = js.Dynamic.literal(CodeRepositorySummaryList = CodeRepositorySummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeRepositoriesOutput]
  }
  
  @scala.inline
  implicit class ListCodeRepositoriesOutputMutableBuilder[Self <: ListCodeRepositoriesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeRepositorySummaryList(value: CodeRepositorySummaryList): Self = StObject.set(x, "CodeRepositorySummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeRepositorySummaryListVarargs(value: CodeRepositorySummary*): Self = StObject.set(x, "CodeRepositorySummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
