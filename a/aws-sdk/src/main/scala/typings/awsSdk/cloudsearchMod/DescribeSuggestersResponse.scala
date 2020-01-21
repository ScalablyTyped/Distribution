package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSuggestersResponse extends js.Object {
  /**
    * The suggesters configured for the domain specified in the request.
    */
  var Suggesters: SuggesterStatusList = js.native
}

object DescribeSuggestersResponse {
  @scala.inline
  def apply(Suggesters: SuggesterStatusList): DescribeSuggestersResponse = {
    val __obj = js.Dynamic.literal(Suggesters = Suggesters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSuggestersResponse]
  }
}

