package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRedirectMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.http
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Redirect extends js.Object {
  /**
    * <p>The host name to use in the redirect request.</p>
    */
  var HostName: js.UndefOr[String] = js.undefined
  /**
    * <p>The HTTP redirect code to use on the response. Not required if one of the siblings is present.</p>
    */
  var HttpRedirectCode: js.UndefOr[String] = js.undefined
  /**
    * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
    */
  var Protocol: js.UndefOr[http | https | String] = js.undefined
  /**
    * <p>The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.</p>
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.undefined
  /**
    * <p>The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the sibling is present. Can be present only if ReplaceKeyPrefixWith is not provided.</p>
    */
  var ReplaceKeyWith: js.UndefOr[String] = js.undefined
}

object _Redirect {
  @scala.inline
  def apply(
    HostName: String = null,
    HttpRedirectCode: String = null,
    Protocol: http | https | String = null,
    ReplaceKeyPrefixWith: String = null,
    ReplaceKeyWith: String = null
  ): _Redirect = {
    val __obj = js.Dynamic.literal()
    if (HostName != null) __obj.updateDynamic("HostName")(HostName.asInstanceOf[js.Any])
    if (HttpRedirectCode != null) __obj.updateDynamic("HttpRedirectCode")(HttpRedirectCode.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (ReplaceKeyPrefixWith != null) __obj.updateDynamic("ReplaceKeyPrefixWith")(ReplaceKeyPrefixWith.asInstanceOf[js.Any])
    if (ReplaceKeyWith != null) __obj.updateDynamic("ReplaceKeyWith")(ReplaceKeyWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Redirect]
  }
}

