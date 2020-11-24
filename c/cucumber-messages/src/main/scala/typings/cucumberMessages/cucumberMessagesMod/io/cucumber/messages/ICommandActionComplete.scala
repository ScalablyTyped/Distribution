package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandActionComplete. */
@js.native
trait ICommandActionComplete extends js.Object {
  
  /** CommandActionComplete completedId */
  var completedId: js.UndefOr[String | Null] = js.native
  
  /** CommandActionComplete snippet */
  var snippet: js.UndefOr[String | Null] = js.native
  
  /** CommandActionComplete testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.native
}
object ICommandActionComplete {
  
  @scala.inline
  def apply(): ICommandActionComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandActionComplete]
  }
  
  @scala.inline
  implicit class ICommandActionCompleteOps[Self <: ICommandActionComplete] (val x: Self) extends AnyVal {
    
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
    def setCompletedId(value: String): Self = this.set("completedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedId: Self = this.set("completedId", js.undefined)
    
    @scala.inline
    def setCompletedIdNull: Self = this.set("completedId", null)
    
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setSnippetNull: Self = this.set("snippet", null)
    
    @scala.inline
    def setTestResult(value: ITestResult): Self = this.set("testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResult: Self = this.set("testResult", js.undefined)
    
    @scala.inline
    def setTestResultNull: Self = this.set("testResult", null)
  }
}
