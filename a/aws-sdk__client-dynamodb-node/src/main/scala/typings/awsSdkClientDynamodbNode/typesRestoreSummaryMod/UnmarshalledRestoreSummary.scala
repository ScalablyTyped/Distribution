package typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRestoreSummary extends RestoreSummary {
  
  /**
    * <p>Point in time or source backup time.</p>
    */
  @JSName("RestoreDateTime")
  var RestoreDateTime_UnmarshalledRestoreSummary: Date = js.native
}
object UnmarshalledRestoreSummary {
  
  @scala.inline
  def apply(RestoreDateTime: Date, RestoreInProgress: Boolean): UnmarshalledRestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRestoreSummary]
  }
  
  @scala.inline
  implicit class UnmarshalledRestoreSummaryOps[Self <: UnmarshalledRestoreSummary] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: Date): Self = this.set("RestoreDateTime", value.asInstanceOf[js.Any])
  }
}
