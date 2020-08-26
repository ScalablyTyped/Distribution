package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchEntitiesResponse extends js.Object {
  /**
    * An array of descriptions for each entity returned in the search result.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.native
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object SearchEntitiesResponse {
  @scala.inline
  def apply(): SearchEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchEntitiesResponse]
  }
  @scala.inline
  implicit class SearchEntitiesResponseOps[Self <: SearchEntitiesResponse] (val x: Self) extends AnyVal {
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
    def setDescriptionsVarargs(value: EntityDescription*): Self = this.set("descriptions", js.Array(value :_*))
    @scala.inline
    def setDescriptions(value: EntityDescriptions): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

