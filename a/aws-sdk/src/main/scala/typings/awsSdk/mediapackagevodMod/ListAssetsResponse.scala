package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssetsResponse extends js.Object {
  /**
    * A list of MediaPackage VOD Asset resources.
    */
  var Assets: js.UndefOr[listOfAssetShallow] = js.native
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListAssetsResponse {
  @scala.inline
  def apply(Assets: listOfAssetShallow = null, NextToken: string = null): ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Assets != null) __obj.updateDynamic("Assets")(Assets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsResponse]
  }
}

