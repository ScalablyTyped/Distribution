package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCommandInvocationsResult extends js.Object {
  
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.native
  
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListCommandInvocationsResult {
  
  @scala.inline
  def apply(): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
  
  @scala.inline
  implicit class ListCommandInvocationsResultOps[Self <: ListCommandInvocationsResult] (val x: Self) extends AnyVal {
    
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
    def setCommandInvocationsVarargs(value: CommandInvocation*): Self = this.set("CommandInvocations", js.Array(value :_*))
    
    @scala.inline
    def setCommandInvocations(value: CommandInvocationList): Self = this.set("CommandInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandInvocations: Self = this.set("CommandInvocations", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
