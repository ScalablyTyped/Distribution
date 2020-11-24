package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutomationExecutionsResult extends js.Object {
  
  /**
    * The list of details about each automation execution which has occurred which matches the filter specification, if any.
    */
  var AutomationExecutionMetadataList: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionMetadataList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeAutomationExecutionsResult {
  
  @scala.inline
  def apply(): DescribeAutomationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationExecutionsResult]
  }
  
  @scala.inline
  implicit class DescribeAutomationExecutionsResultOps[Self <: DescribeAutomationExecutionsResult] (val x: Self) extends AnyVal {
    
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
    def setAutomationExecutionMetadataListVarargs(value: AutomationExecutionMetadata*): Self = this.set("AutomationExecutionMetadataList", js.Array(value :_*))
    
    @scala.inline
    def setAutomationExecutionMetadataList(value: AutomationExecutionMetadataList): Self = this.set("AutomationExecutionMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationExecutionMetadataList: Self = this.set("AutomationExecutionMetadataList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
