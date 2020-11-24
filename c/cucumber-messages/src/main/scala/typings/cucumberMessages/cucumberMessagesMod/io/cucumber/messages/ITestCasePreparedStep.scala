package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCasePreparedStep. */
@js.native
trait ITestCasePreparedStep extends js.Object {
  
  /** TestCasePreparedStep actionLocation */
  var actionLocation: js.UndefOr[ISourceReference | Null] = js.native
  
  /** TestCasePreparedStep sourceLocation */
  var sourceLocation: js.UndefOr[ISourceReference | Null] = js.native
}
object ITestCasePreparedStep {
  
  @scala.inline
  def apply(): ITestCasePreparedStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCasePreparedStep]
  }
  
  @scala.inline
  implicit class ITestCasePreparedStepOps[Self <: ITestCasePreparedStep] (val x: Self) extends AnyVal {
    
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
    def setActionLocation(value: ISourceReference): Self = this.set("actionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionLocation: Self = this.set("actionLocation", js.undefined)
    
    @scala.inline
    def setActionLocationNull: Self = this.set("actionLocation", null)
    
    @scala.inline
    def setSourceLocation(value: ISourceReference): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    
    @scala.inline
    def setSourceLocationNull: Self = this.set("sourceLocation", null)
  }
}
