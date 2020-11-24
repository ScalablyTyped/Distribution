package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNodeDetails extends js.Object {
  
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.native
}
object TriggerNodeDetails {
  
  @scala.inline
  def apply(): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerNodeDetails]
  }
  
  @scala.inline
  implicit class TriggerNodeDetailsOps[Self <: TriggerNodeDetails] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: Trigger): Self = this.set("Trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("Trigger", js.undefined)
  }
}
