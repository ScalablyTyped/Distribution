package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandInitializeTestCase. */
@js.native
trait ICommandInitializeTestCase extends js.Object {
  
  /** CommandInitializeTestCase actionId */
  var actionId: js.UndefOr[String | Null] = js.native
  
  /** CommandInitializeTestCase pickle */
  var pickle: js.UndefOr[IPickle | Null] = js.native
}
object ICommandInitializeTestCase {
  
  @scala.inline
  def apply(): ICommandInitializeTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandInitializeTestCase]
  }
  
  @scala.inline
  implicit class ICommandInitializeTestCaseOps[Self <: ICommandInitializeTestCase] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setActionIdNull: Self = this.set("actionId", null)
    
    @scala.inline
    def setPickle(value: IPickle): Self = this.set("pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickle: Self = this.set("pickle", js.undefined)
    
    @scala.inline
    def setPickleNull: Self = this.set("pickle", null)
  }
}
