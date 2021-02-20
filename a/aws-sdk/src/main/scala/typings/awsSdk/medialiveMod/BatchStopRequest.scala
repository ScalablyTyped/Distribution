package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopRequest extends StObject {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.native
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.native
}
object BatchStopRequest {
  
  @scala.inline
  def apply(): BatchStopRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopRequest]
  }
  
  @scala.inline
  implicit class BatchStopRequestMutableBuilder[Self <: BatchStopRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelIds(value: listOfString): Self = StObject.set(x, "ChannelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdsUndefined: Self = StObject.set(x, "ChannelIds", js.undefined)
    
    @scala.inline
    def setChannelIdsVarargs(value: string*): Self = StObject.set(x, "ChannelIds", js.Array(value :_*))
    
    @scala.inline
    def setMultiplexIds(value: listOfString): Self = StObject.set(x, "MultiplexIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexIdsUndefined: Self = StObject.set(x, "MultiplexIds", js.undefined)
    
    @scala.inline
    def setMultiplexIdsVarargs(value: string*): Self = StObject.set(x, "MultiplexIds", js.Array(value :_*))
  }
}
