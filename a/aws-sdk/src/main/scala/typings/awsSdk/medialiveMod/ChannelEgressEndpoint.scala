package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEgressEndpoint extends StObject {
  
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[string] = js.undefined
}
object ChannelEgressEndpoint {
  
  inline def apply(): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
  
  extension [Self <: ChannelEgressEndpoint](x: Self) {
    
    inline def setSourceIp(value: string): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
  }
}
