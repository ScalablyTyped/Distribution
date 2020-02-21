package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiePreference extends js.Object {
  /**
    * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies specified in the WhitelistedNames complex type. Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify none for the Forward element.
    */
  var Forward: ItemSelection = js.native
  /**
    * Required if you specify whitelist for the value of Forward. A complex type that specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if you want to forward selected cookies, the names of those cookies. If you specify all or none for the value of Forward, omit WhitelistedNames. If you change the value of Forward from whitelist to all or none and you don't delete the WhitelistedNames element and its child elements, CloudFront deletes them automatically. For the current limit on the number of cookie names that you can whitelist for each cache behavior, see  CloudFront Limits in the AWS General Reference.
    */
  var WhitelistedNames: js.UndefOr[CookieNames] = js.native
}

object CookiePreference {
  @scala.inline
  def apply(Forward: ItemSelection, WhitelistedNames: CookieNames = null): CookiePreference = {
    val __obj = js.Dynamic.literal(Forward = Forward.asInstanceOf[js.Any])
    if (WhitelistedNames != null) __obj.updateDynamic("WhitelistedNames")(WhitelistedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiePreference]
  }
}

