package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventSelectorsResponse extends js.Object {
  
  /**
    * The event selectors that are configured for the trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  
  /**
    * The specified trail ARN that has the event selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object GetEventSelectorsResponse {
  
  @scala.inline
  def apply(): GetEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventSelectorsResponse]
  }
  
  @scala.inline
  implicit class GetEventSelectorsResponseOps[Self <: GetEventSelectorsResponse] (val x: Self) extends AnyVal {
    
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
    def setEventSelectorsVarargs(value: EventSelector*): Self = this.set("EventSelectors", js.Array(value :_*))
    
    @scala.inline
    def setEventSelectors(value: EventSelectors): Self = this.set("EventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSelectors: Self = this.set("EventSelectors", js.undefined)
    
    @scala.inline
    def setTrailARN(value: String): Self = this.set("TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailARN: Self = this.set("TrailARN", js.undefined)
  }
}
