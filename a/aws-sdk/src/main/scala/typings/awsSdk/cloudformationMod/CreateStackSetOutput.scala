package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStackSetOutput extends js.Object {
  
  /**
    * The ID of the stack set that you're creating.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
}
object CreateStackSetOutput {
  
  @scala.inline
  def apply(): CreateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackSetOutput]
  }
  
  @scala.inline
  implicit class CreateStackSetOutputOps[Self <: CreateStackSetOutput] (val x: Self) extends AnyVal {
    
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
    def setStackSetId(value: StackSetId): Self = this.set("StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("StackSetId", js.undefined)
  }
}
