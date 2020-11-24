package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestRunFinished. */
@js.native
trait ITestRunFinished extends js.Object {
  
  /** TestRunFinished success */
  var success: js.UndefOr[Boolean | Null] = js.native
  
  /** TestRunFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestRunFinished {
  
  @scala.inline
  def apply(): ITestRunFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestRunFinished]
  }
  
  @scala.inline
  implicit class ITestRunFinishedOps[Self <: ITestRunFinished] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setSuccessNull: Self = this.set("success", null)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTimestampNull: Self = this.set("timestamp", null)
  }
}
