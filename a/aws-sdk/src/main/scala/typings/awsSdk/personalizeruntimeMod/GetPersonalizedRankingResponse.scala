package typings.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPersonalizedRankingResponse extends js.Object {
  /**
    * A list of items in order of most likely interest to the user. The maximum is 500.
    */
  var personalizedRanking: js.UndefOr[ItemList] = js.native
}

object GetPersonalizedRankingResponse {
  @scala.inline
  def apply(): GetPersonalizedRankingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPersonalizedRankingResponse]
  }
  @scala.inline
  implicit class GetPersonalizedRankingResponseOps[Self <: GetPersonalizedRankingResponse] (val x: Self) extends AnyVal {
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
    def setPersonalizedRankingVarargs(value: PredictedItem*): Self = this.set("personalizedRanking", js.Array(value :_*))
    @scala.inline
    def setPersonalizedRanking(value: ItemList): Self = this.set("personalizedRanking", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonalizedRanking: Self = this.set("personalizedRanking", js.undefined)
  }
  
}

