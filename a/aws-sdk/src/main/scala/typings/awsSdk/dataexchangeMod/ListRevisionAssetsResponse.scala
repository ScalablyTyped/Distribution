package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRevisionAssetsResponse extends js.Object {
  /**
    * The asset objects listed by the request.
    */
  var Assets: js.UndefOr[ListOfAssetEntry] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
}

object ListRevisionAssetsResponse {
  @scala.inline
  def apply(): ListRevisionAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRevisionAssetsResponse]
  }
  @scala.inline
  implicit class ListRevisionAssetsResponseOps[Self <: ListRevisionAssetsResponse] (val x: Self) extends AnyVal {
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
    def setAssetsVarargs(value: AssetEntry*): Self = this.set("Assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: ListOfAssetEntry): Self = this.set("Assets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssets: Self = this.set("Assets", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

