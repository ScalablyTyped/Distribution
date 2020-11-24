package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickFeedback extends js.Object {
  
  /**
    * The Unix timestamp of the date and time that the result was clicked.
    */
  var ClickTime: Timestamp = js.native
  
  /**
    * The unique identifier of the search result that was clicked.
    */
  var ResultId: typings.awsSdk.kendraMod.ResultId = js.native
}
object ClickFeedback {
  
  @scala.inline
  def apply(ClickTime: Timestamp, ResultId: ResultId): ClickFeedback = {
    val __obj = js.Dynamic.literal(ClickTime = ClickTime.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFeedback]
  }
  
  @scala.inline
  implicit class ClickFeedbackOps[Self <: ClickFeedback] (val x: Self) extends AnyVal {
    
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
    def setClickTime(value: Timestamp): Self = this.set("ClickTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultId(value: ResultId): Self = this.set("ResultId", value.asInstanceOf[js.Any])
  }
}
