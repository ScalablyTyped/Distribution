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
  def apply(): ListPublicKeysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResult]
  }
  @scala.inline
  implicit class ListPublicKeysResultOps[Self <: ListPublicKeysResult] (val x: Self) extends AnyVal {
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
    def setPublicKeyList(value: PublicKeyList): Self = this.set("PublicKeyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeyList: Self = this.set("PublicKeyList", js.undefined)
  }
  
}

