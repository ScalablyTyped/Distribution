package typings.awsSdkClientS3Node.typesStatsEventMod

import typings.awsSdkClientS3Node.typesStatsMod.UnmarshalledStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledStatsEvent extends StatsEvent {
  
  /**
    * <p>The Stats event details.</p>
    */
  @JSName("Details")
  var Details_UnmarshalledStatsEvent: js.UndefOr[UnmarshalledStats] = js.native
}
object UnmarshalledStatsEvent {
  
  @scala.inline
  def apply(): UnmarshalledStatsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledStatsEvent]
  }
  
  @scala.inline
  implicit class UnmarshalledStatsEventOps[Self <: UnmarshalledStatsEvent] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: UnmarshalledStats): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
  }
}
