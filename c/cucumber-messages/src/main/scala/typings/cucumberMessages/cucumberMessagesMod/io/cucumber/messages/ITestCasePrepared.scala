package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCasePrepared. */
@js.native
trait ITestCasePrepared extends js.Object {
  
  /** TestCasePrepared pickleId */
  var pickleId: js.UndefOr[String | Null] = js.native
  
  /** TestCasePrepared steps */
  var steps: js.UndefOr[js.Array[ITestCasePreparedStep] | Null] = js.native
}
object ITestCasePrepared {
  
  @scala.inline
  def apply(): ITestCasePrepared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePrepared]
  }
  
  @scala.inline
  implicit class ITestCasePreparedOps[Self <: ITestCasePrepared] (val x: Self) extends AnyVal {
    
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
    def setPickleId(value: String): Self = this.set("pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleId: Self = this.set("pickleId", js.undefined)
    
    @scala.inline
    def setPickleIdNull: Self = this.set("pickleId", null)
    
    @scala.inline
    def setStepsVarargs(value: ITestCasePreparedStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[ITestCasePreparedStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setStepsNull: Self = this.set("steps", null)
  }
}
