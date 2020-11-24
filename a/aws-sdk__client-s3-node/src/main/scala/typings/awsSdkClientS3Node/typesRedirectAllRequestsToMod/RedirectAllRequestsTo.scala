package typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.http
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectAllRequestsTo extends js.Object {
  
  /**
    * <p>Name of the host where requests will be redirected.</p>
    */
  var HostName: String = js.native
  
  /**
    * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
    */
  var Protocol: js.UndefOr[http | https | String] = js.native
}
object RedirectAllRequestsTo {
  
  @scala.inline
  def apply(HostName: String): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
  
  @scala.inline
  implicit class RedirectAllRequestsToOps[Self <: RedirectAllRequestsTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostName(value: String): Self = this.set("HostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: http | https | String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
  }
}
