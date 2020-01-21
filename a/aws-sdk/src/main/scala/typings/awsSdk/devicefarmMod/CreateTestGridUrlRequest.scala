package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridUrlRequest extends js.Object {
  /**
    * Lifetime, in seconds, of the URL.
    */
  var expiresInSeconds: TestGridUrlExpiresInSecondsInput = js.native
  /**
    * ARN (from CreateTestGridProject or ListTestGridProjects) to associate with the short-term URL. 
    */
  var projectArn: DeviceFarmArn = js.native
}

object CreateTestGridUrlRequest {
  @scala.inline
  def apply(expiresInSeconds: TestGridUrlExpiresInSecondsInput, projectArn: DeviceFarmArn): CreateTestGridUrlRequest = {
    val __obj = js.Dynamic.literal(expiresInSeconds = expiresInSeconds.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTestGridUrlRequest]
  }
}

