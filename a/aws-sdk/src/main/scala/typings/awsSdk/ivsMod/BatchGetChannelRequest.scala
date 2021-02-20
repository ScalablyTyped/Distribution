package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetChannelRequest extends StObject {
  
  /**
    * Array of ARNs, one per channel.
    */
  var arns: ChannelArnList = js.native
}
object BatchGetChannelRequest {
  
  @scala.inline
  def apply(arns: ChannelArnList): BatchGetChannelRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetChannelRequest]
  }
  
  @scala.inline
  implicit class BatchGetChannelRequestMutableBuilder[Self <: BatchGetChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArns(value: ChannelArnList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnsVarargs(value: ChannelArn*): Self = StObject.set(x, "arns", js.Array(value :_*))
  }
}
