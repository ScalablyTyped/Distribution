package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchThingsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of things in the result set.
    */
  var things: js.UndefOr[Things] = js.native
}

object SearchThingsResponse {
  @scala.inline
  def apply(): SearchThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchThingsResponse]
  }
  @scala.inline
  implicit class SearchThingsResponseOps[Self <: SearchThingsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setThingsVarargs(value: Thing*): Self = this.set("things", js.Array(value :_*))
    @scala.inline
    def setThings(value: Things): Self = this.set("things", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThings: Self = this.set("things", js.undefined)
  }
  
}

