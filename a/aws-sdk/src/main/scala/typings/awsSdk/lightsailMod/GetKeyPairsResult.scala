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
  def apply(keyPairs: KeyPairList = null, nextPageToken: String = null): GetKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    if (keyPairs != null) __obj.updateDynamic("keyPairs")(keyPairs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPairsResult]
  }
}

