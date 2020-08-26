package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPairsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the key pairs.
    */
  var keyPairs: js.UndefOr[KeyPairList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetKeyPairs request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetKeyPairsResult {
  @scala.inline
  def apply(): GetKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairsResult]
  }
  @scala.inline
  implicit class GetKeyPairsResultOps[Self <: GetKeyPairsResult] (val x: Self) extends AnyVal {
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
    def setKeyPairsVarargs(value: KeyPair*): Self = this.set("keyPairs", js.Array(value :_*))
    @scala.inline
    def setKeyPairs(value: KeyPairList): Self = this.set("keyPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPairs: Self = this.set("keyPairs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

