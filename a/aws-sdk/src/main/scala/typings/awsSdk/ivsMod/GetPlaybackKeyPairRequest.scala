package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlaybackKeyPairRequest extends StObject {
  
  /**
    * ARN of the key pair to be returned.
    */
  var arn: PlaybackKeyPairArn = js.native
}
object GetPlaybackKeyPairRequest {
  
  @scala.inline
  def apply(arn: PlaybackKeyPairArn): GetPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackKeyPairRequest]
  }
  
  @scala.inline
  implicit class GetPlaybackKeyPairRequestMutableBuilder[Self <: GetPlaybackKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
