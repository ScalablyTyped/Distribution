package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteRequest extends StObject {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.native
  
  /**
    * List of input IDs
    */
  var InputIds: js.UndefOr[listOfString] = js.native
  
  /**
    * List of input security group IDs
    */
  var InputSecurityGroupIds: js.UndefOr[listOfString] = js.native
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.native
}
object BatchDeleteRequest {
  
  @scala.inline
  def apply(): BatchDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteRequestMutableBuilder[Self <: BatchDeleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelIds(value: listOfString): Self = StObject.set(x, "ChannelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdsUndefined: Self = StObject.set(x, "ChannelIds", js.undefined)
    
    @scala.inline
    def setChannelIdsVarargs(value: string*): Self = StObject.set(x, "ChannelIds", js.Array(value :_*))
    
    @scala.inline
    def setInputIds(value: listOfString): Self = StObject.set(x, "InputIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdsUndefined: Self = StObject.set(x, "InputIds", js.undefined)
    
    @scala.inline
    def setInputIdsVarargs(value: string*): Self = StObject.set(x, "InputIds", js.Array(value :_*))
    
    @scala.inline
    def setInputSecurityGroupIds(value: listOfString): Self = StObject.set(x, "InputSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSecurityGroupIdsUndefined: Self = StObject.set(x, "InputSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setInputSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "InputSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setMultiplexIds(value: listOfString): Self = StObject.set(x, "MultiplexIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexIdsUndefined: Self = StObject.set(x, "MultiplexIds", js.undefined)
    
    @scala.inline
    def setMultiplexIdsVarargs(value: string*): Self = StObject.set(x, "MultiplexIds", js.Array(value :_*))
  }
}
