package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEgressEndpoint extends StObject {
  
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[string] = js.native
}
object ChannelEgressEndpoint {
  
  @scala.inline
  def apply(): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
  
  @scala.inline
  implicit class ChannelEgressEndpointMutableBuilder[Self <: ChannelEgressEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceIp(value: string): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
  }
}
