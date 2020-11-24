package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetAddress] = js.native
  
  /**
    * The status of the target.
    */
  var TargetStatus: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetStatus] = js.native
  
  /**
    * The type of the target (for example, SNS).
    */
  var TargetType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetType] = js.native
}
object TargetSummary {
  
  @scala.inline
  def apply(): TargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSummary]
  }
  
  @scala.inline
  implicit class TargetSummaryOps[Self <: TargetSummary] (val x: Self) extends AnyVal {
    
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
    def setTargetAddress(value: TargetAddress): Self = this.set("TargetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAddress: Self = this.set("TargetAddress", js.undefined)
    
    @scala.inline
    def setTargetStatus(value: TargetStatus): Self = this.set("TargetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetStatus: Self = this.set("TargetStatus", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetType): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("TargetType", js.undefined)
  }
}
