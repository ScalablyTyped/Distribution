package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCountersForWorkteam extends js.Object {
  
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.native
}
object LabelCountersForWorkteam {
  
  @scala.inline
  def apply(): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
  
  @scala.inline
  implicit class LabelCountersForWorkteamOps[Self <: LabelCountersForWorkteam] (val x: Self) extends AnyVal {
    
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
    def setHumanLabeled(value: LabelCounter): Self = this.set("HumanLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLabeled: Self = this.set("HumanLabeled", js.undefined)
    
    @scala.inline
    def setPendingHuman(value: LabelCounter): Self = this.set("PendingHuman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingHuman: Self = this.set("PendingHuman", js.undefined)
    
    @scala.inline
    def setTotal(value: LabelCounter): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
