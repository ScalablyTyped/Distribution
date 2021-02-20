package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelClassRequest extends StObject {
  
  /**
    * The channel class that you wish to update this channel to use.
    */
  var ChannelClass: typings.awsSdk.medialiveMod.ChannelClass = js.native
  
  /**
    * Channel Id of the channel whose class should be updated.
    */
  var ChannelId: string = js.native
  
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
}
object UpdateChannelClassRequest {
  
  @scala.inline
  def apply(ChannelClass: ChannelClass, ChannelId: string): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelClassRequestMutableBuilder[Self <: UpdateChannelClassRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinations(value: listOfOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: OutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
  }
}
