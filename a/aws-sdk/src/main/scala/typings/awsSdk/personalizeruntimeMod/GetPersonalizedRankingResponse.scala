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
  def apply(personalizedRanking: ItemList = null): GetPersonalizedRankingResponse = {
    val __obj = js.Dynamic.literal()
    if (personalizedRanking != null) __obj.updateDynamic("personalizedRanking")(personalizedRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonalizedRankingResponse]
  }
}

