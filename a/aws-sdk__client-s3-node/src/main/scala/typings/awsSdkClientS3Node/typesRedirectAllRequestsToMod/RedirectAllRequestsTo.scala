package typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.http
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectAllRequestsTo extends js.Object {
  /**
    * <p>Name of the host where requests will be redirected.</p>
    */
  var HostName: String
  /**
    * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
    */
  var Protocol: js.UndefOr[http | https | String] = js.undefined
}

object RedirectAllRequestsTo {
  @scala.inline
  def apply(HostName: String, Protocol: http | https | String = null): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
}

