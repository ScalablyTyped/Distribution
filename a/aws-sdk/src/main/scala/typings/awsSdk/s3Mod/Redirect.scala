package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  /**
    * The host name to use in the redirect request.
    */
  var HostName: js.UndefOr[typings.awsSdk.s3Mod.HostName] = js.native
  /**
    * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
    */
  var HttpRedirectCode: js.UndefOr[typings.awsSdk.s3Mod.HttpRedirectCode] = js.native
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsSdk.s3Mod.Protocol] = js.native
  /**
    * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[typings.awsSdk.s3Mod.ReplaceKeyPrefixWith] = js.native
  /**
    * The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the siblings is present. Can be present only if ReplaceKeyPrefixWith is not provided.
    */
  var ReplaceKeyWith: js.UndefOr[typings.awsSdk.s3Mod.ReplaceKeyWith] = js.native
}

object Redirect {
  @scala.inline
  def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
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
    def setHostName(value: HostName): Self = this.set("HostName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostName: Self = this.set("HostName", js.undefined)
    @scala.inline
    def setHttpRedirectCode(value: HttpRedirectCode): Self = this.set("HttpRedirectCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRedirectCode: Self = this.set("HttpRedirectCode", js.undefined)
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setReplaceKeyPrefixWith(value: ReplaceKeyPrefixWith): Self = this.set("ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyPrefixWith: Self = this.set("ReplaceKeyPrefixWith", js.undefined)
    @scala.inline
    def setReplaceKeyWith(value: ReplaceKeyWith): Self = this.set("ReplaceKeyWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyWith: Self = this.set("ReplaceKeyWith", js.undefined)
  }
  
}

