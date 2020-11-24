package typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSamplingStatisticSummary extends SamplingStatisticSummary {
  
  /**
    * <p>The start time of the reporting window.</p>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledSamplingStatisticSummary: js.UndefOr[Date] = js.native
}
object UnmarshalledSamplingStatisticSummary {
  
  @scala.inline
  def apply(): UnmarshalledSamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingStatisticSummary]
  }
  
  @scala.inline
  implicit class UnmarshalledSamplingStatisticSummaryOps[Self <: UnmarshalledSamplingStatisticSummary] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
