package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutomationStepExecutionsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * A list of details about the current state of all steps that make up an execution.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.native
}
object DescribeAutomationStepExecutionsResult {
  
  @scala.inline
  def apply(): DescribeAutomationStepExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationStepExecutionsResult]
  }
  
  @scala.inline
  implicit class DescribeAutomationStepExecutionsResultMutableBuilder[Self <: DescribeAutomationStepExecutionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStepExecutions(value: StepExecutionList): Self = StObject.set(x, "StepExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepExecutionsUndefined: Self = StObject.set(x, "StepExecutions", js.undefined)
    
    @scala.inline
    def setStepExecutionsVarargs(value: StepExecution*): Self = StObject.set(x, "StepExecutions", js.Array(value :_*))
  }
}
