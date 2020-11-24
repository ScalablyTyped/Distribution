package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlarmHistoryOutput extends js.Object {
  
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
  implicit class DescribeAlarmHistoryOutputOps[Self <: DescribeAlarmHistoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmHistoryItemsVarargs(value: AlarmHistoryItem*): Self = this.set("AlarmHistoryItems", js.Array(value :_*))
    
    @scala.inline
    def setAlarmHistoryItems(value: AlarmHistoryItems): Self = this.set("AlarmHistoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmHistoryItems: Self = this.set("AlarmHistoryItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
