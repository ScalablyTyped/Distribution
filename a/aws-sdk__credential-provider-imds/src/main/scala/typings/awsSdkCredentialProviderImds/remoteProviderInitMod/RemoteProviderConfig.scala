package typings.awsSdkCredentialProviderImds.remoteProviderInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteProviderConfig extends js.Object {
  /**
    * The maximum number of times the HTTP connection should be retried
    */
  var maxRetries: Double
  /**
    * The connection timeout (in milliseconds)
    */
  var timeout: Double
}

object RemoteProviderConfig {
  @scala.inline
  def apply(maxRetries: Double, timeout: Double): RemoteProviderConfig = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoteProviderConfig]
  }
}

