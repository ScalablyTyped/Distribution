package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysResponse extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typings.awsSdk.cloudtrailMod.PublicKeyList] = js.native
}

object ListPublicKeysResponse {
  @scala.inline
  def apply(NextToken: String = null, PublicKeyList: PublicKeyList = null): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PublicKeyList != null) __obj.updateDynamic("PublicKeyList")(PublicKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
}

