package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolUsageResponse extends js.Object {
  /**
    * Total number of identities for the identity pool.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * Usage information for the identity pools.
    */
  var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.native
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIdentityPoolUsageResponse {
  @scala.inline
  def apply(): ListIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolUsageResponse]
  }
  @scala.inline
  implicit class ListIdentityPoolUsageResponseOps[Self <: ListIdentityPoolUsageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setIdentityPoolUsagesVarargs(value: IdentityPoolUsage*): Self = this.set("IdentityPoolUsages", js.Array(value :_*))
    @scala.inline
    def setIdentityPoolUsages(value: IdentityPoolUsageList): Self = this.set("IdentityPoolUsages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolUsages: Self = this.set("IdentityPoolUsages", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

