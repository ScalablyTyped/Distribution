package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlarmHistoryOutput extends StObject {
  
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmHistoryItems] = js.native
  
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}
object DescribeAlarmHistoryOutput {
  
  @scala.inline
  def apply(): DescribeAlarmHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryOutput]
  }
  
  @scala.inline
  implicit class DescribeAlarmHistoryOutputMutableBuilder[Self <: DescribeAlarmHistoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmHistoryItems(value: AlarmHistoryItems): Self = StObject.set(x, "AlarmHistoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmHistoryItemsUndefined: Self = StObject.set(x, "AlarmHistoryItems", js.undefined)
    
    @scala.inline
    def setAlarmHistoryItemsVarargs(value: AlarmHistoryItem*): Self = StObject.set(x, "AlarmHistoryItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
