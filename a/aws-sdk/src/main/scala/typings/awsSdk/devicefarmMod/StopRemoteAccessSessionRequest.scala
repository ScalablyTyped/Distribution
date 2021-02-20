package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRemoteAccessSessionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the remote access session to stop.
    */
  var arn: AmazonResourceName = js.native
}
object StopRemoteAccessSessionRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): StopRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRemoteAccessSessionRequest]
  }
  
  @scala.inline
  implicit class StopRemoteAccessSessionRequestMutableBuilder[Self <: StopRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
