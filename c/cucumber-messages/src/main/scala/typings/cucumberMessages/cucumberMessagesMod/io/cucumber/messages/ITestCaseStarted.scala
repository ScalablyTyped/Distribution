package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.IPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCaseStarted. */
@js.native
trait ITestCaseStarted extends js.Object {
  
  /**
    * The first attempt should have value 0, and for each retry the value
    * should increase by 1.
    */
  var attempt: js.UndefOr[Double | Null] = js.native
  
  /**
    * Because a `TestCase` can be run multiple times (in case of a retry),
    * we use this field to group messages relating to the same attempt.
    */
  var id: js.UndefOr[String | Null] = js.native
  
  /** TestCaseStarted platform */
  var platform: js.UndefOr[IPlatform | Null] = js.native
  
  /** TestCaseStarted testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.native
  
  /** TestCaseStarted timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestCaseStarted {
  
  @scala.inline
  def apply(): ITestCaseStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCaseStarted]
  }
  
  @scala.inline
  implicit class ITestCaseStartedOps[Self <: ITestCaseStarted] (val x: Self) extends AnyVal {
    
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
    def setAttempt(value: Double): Self = this.set("attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempt: Self = this.set("attempt", js.undefined)
    
    @scala.inline
    def setAttemptNull: Self = this.set("attempt", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setPlatform(value: IPlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPlatformNull: Self = this.set("platform", null)
    
    @scala.inline
    def setTestCaseId(value: String): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseId: Self = this.set("testCaseId", js.undefined)
    
    @scala.inline
    def setTestCaseIdNull: Self = this.set("testCaseId", null)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTimestampNull: Self = this.set("timestamp", null)
  }
}
