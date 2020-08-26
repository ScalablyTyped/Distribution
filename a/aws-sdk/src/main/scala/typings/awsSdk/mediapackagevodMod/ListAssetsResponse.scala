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
  def apply(): ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResponse]
  }
  @scala.inline
  implicit class ListAssetsResponseOps[Self <: ListAssetsResponse] (val x: Self) extends AnyVal {
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
    def setAssetsVarargs(value: AssetShallow*): Self = this.set("Assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: listOfAssetShallow): Self = this.set("Assets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssets: Self = this.set("Assets", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

