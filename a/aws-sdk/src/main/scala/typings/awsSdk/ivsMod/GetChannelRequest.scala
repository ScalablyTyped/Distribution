package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelRequest extends StObject {
  
  /**
    * ARN of the channel for which the configuration is to be retrieved.
    */
  var arn: ChannelArn = js.native
}
object GetChannelRequest {
  
  @scala.inline
  def apply(arn: ChannelArn): GetChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelRequest]
  }
  
  @scala.inline
  implicit class GetChannelRequestMutableBuilder[Self <: GetChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
