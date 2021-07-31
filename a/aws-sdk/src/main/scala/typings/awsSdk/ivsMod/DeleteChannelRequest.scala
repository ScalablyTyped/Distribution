package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * ARN of the channel to be deleted.
    */
  var arn: ChannelArn
}
object DeleteChannelRequest {
  
  @scala.inline
  def apply(arn: ChannelArn): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelRequestMutableBuilder[Self <: DeleteChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
