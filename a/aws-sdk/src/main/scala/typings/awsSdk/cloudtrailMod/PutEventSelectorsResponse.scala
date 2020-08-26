package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventSelectorsResponse extends js.Object {
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object PutEventSelectorsResponse {
  @scala.inline
  def apply(): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
  @scala.inline
  implicit class PutEventSelectorsResponseOps[Self <: PutEventSelectorsResponse] (val x: Self) extends AnyVal {
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

