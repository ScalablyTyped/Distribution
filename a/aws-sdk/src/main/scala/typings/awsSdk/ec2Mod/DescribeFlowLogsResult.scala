package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowLogsResult extends StObject {
  
  /**
    * Information about the flow logs.
    */
  var FlowLogs: js.UndefOr[FlowLogSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFlowLogsResult {
  
  @scala.inline
  def apply(): DescribeFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowLogsResult]
  }
  
  @scala.inline
  implicit class DescribeFlowLogsResultMutableBuilder[Self <: DescribeFlowLogsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowLogs(value: FlowLogSet): Self = StObject.set(x, "FlowLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsUndefined: Self = StObject.set(x, "FlowLogs", js.undefined)
    
    @scala.inline
    def setFlowLogsVarargs(value: FlowLog*): Self = StObject.set(x, "FlowLogs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
