package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanTaskUiSummary extends js.Object {
  
  /**
    * A timestamp when SageMaker created the human task user interface.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  
  /**
    * The name of the human task user interface.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName = js.native
}
object HumanTaskUiSummary {
  
  @scala.inline
  def apply(CreationTime: Timestamp, HumanTaskUiArn: HumanTaskUiArn, HumanTaskUiName: HumanTaskUiName): HumanTaskUiSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanTaskUiSummary]
  }
  
  @scala.inline
  implicit class HumanTaskUiSummaryOps[Self <: HumanTaskUiSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = this.set("HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiName(value: HumanTaskUiName): Self = this.set("HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
