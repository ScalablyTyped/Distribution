package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysResult extends js.Object {
  /**
    * Returns a list of all public keys that have been added to CloudFront for this account.
    */
  var PublicKeyList: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKeyList] = js.native
}

object ListPublicKeysResult {
  @scala.inline
  def apply(PublicKeyList: PublicKeyList = null): ListPublicKeysResult = {
    val __obj = js.Dynamic.literal()
    if (PublicKeyList != null) __obj.updateDynamic("PublicKeyList")(PublicKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublicKeysResult]
  }
}

