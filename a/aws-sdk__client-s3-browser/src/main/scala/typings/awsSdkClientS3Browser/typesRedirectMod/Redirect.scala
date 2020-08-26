package typings.awsSdkClientS3Browser.typesRedirectMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.http
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  /**
    * <p>The host name to use in the redirect request.</p>
    */
  var HostName: js.UndefOr[String] = js.native
  /**
    * <p>The HTTP redirect code to use on the response. Not required if one of the siblings is present.</p>
    */
  var HttpRedirectCode: js.UndefOr[String] = js.native
  /**
    * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
    */
  var Protocol: js.UndefOr[http | https | String] = js.native
  /**
    * <p>The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.</p>
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
  /**
    * <p>The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the sibling is present. Can be present only if ReplaceKeyPrefixWith is not provided.</p>
    */
  var ReplaceKeyWith: js.UndefOr[String] = js.native
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
    def setHostName(value: String): Self = this.set("HostName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostName: Self = this.set("HostName", js.undefined)
    @scala.inline
    def setHttpRedirectCode(value: String): Self = this.set("HttpRedirectCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRedirectCode: Self = this.set("HttpRedirectCode", js.undefined)
    @scala.inline
    def setProtocol(value: http | https | String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setReplaceKeyPrefixWith(value: String): Self = this.set("ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyPrefixWith: Self = this.set("ReplaceKeyPrefixWith", js.undefined)
    @scala.inline
    def setReplaceKeyWith(value: String): Self = this.set("ReplaceKeyWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyWith: Self = this.set("ReplaceKeyWith", js.undefined)
  }
  
}

