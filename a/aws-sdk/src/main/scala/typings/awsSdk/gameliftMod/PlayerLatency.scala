package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerLatency extends StObject {
  
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
  implicit class PlayerLatencyMutableBuilder[Self <: PlayerLatency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatencyInMilliseconds(value: Float): Self = StObject.set(x, "LatencyInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyInMillisecondsUndefined: Self = StObject.set(x, "LatencyInMilliseconds", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    @scala.inline
    def setRegionIdentifier(value: NonZeroAndMaxString): Self = StObject.set(x, "RegionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionIdentifierUndefined: Self = StObject.set(x, "RegionIdentifier", js.undefined)
  }
}
