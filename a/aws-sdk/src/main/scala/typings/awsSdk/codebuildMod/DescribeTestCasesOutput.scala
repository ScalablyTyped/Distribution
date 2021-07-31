package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTestCasesOutput extends StObject {
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The returned list of test cases. 
    */
  var testCases: js.UndefOr[TestCases] = js.undefined
}
object DescribeTestCasesOutput {
  
  @scala.inline
  def apply(): DescribeTestCasesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTestCasesOutput]
  }
  
  @scala.inline
  implicit class DescribeTestCasesOutputMutableBuilder[Self <: DescribeTestCasesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTestCases(value: TestCases): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value :_*))
  }
}
