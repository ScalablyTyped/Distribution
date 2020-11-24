package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerLatency extends js.Object {
  
  /**
    * Amount of time that represents the time lag experienced by the player when connected to the specified Region.
    */
  var LatencyInMilliseconds: js.UndefOr[Float] = js.native
  
  /**
    * A unique identifier for a player associated with the latency data.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Name of the Region that is associated with the latency value.
    */
  var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.native
}
object PlayerLatency {
  
  @scala.inline
  def apply(): PlayerLatency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLatency]
  }
  
  @scala.inline
  implicit class PlayerLatencyOps[Self <: PlayerLatency] (val x: Self) extends AnyVal {
    
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
    def setLatencyInMilliseconds(value: Float): Self = this.set("LatencyInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyInMilliseconds: Self = this.set("LatencyInMilliseconds", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = this.set("PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerId: Self = this.set("PlayerId", js.undefined)
    
    @scala.inline
    def setRegionIdentifier(value: NonZeroAndMaxString): Self = this.set("RegionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionIdentifier: Self = this.set("RegionIdentifier", js.undefined)
  }
}
