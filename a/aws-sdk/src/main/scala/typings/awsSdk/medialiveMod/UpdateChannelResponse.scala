package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelResponse extends StObject {
  
  var Channel: js.UndefOr[typings.awsSdk.medialiveMod.Channel] = js.undefined
}
object UpdateChannelResponse {
  
  inline def apply(): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelResponse]
  }
  
  extension [Self <: UpdateChannelResponse](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
