package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSuggesterResponse extends js.Object {
  /**
    * The status of the suggester being deleted.
    */
  var Suggester: SuggesterStatus = js.native
}

object DeleteSuggesterResponse {
  @scala.inline
  def apply(Suggester: SuggesterStatus): DeleteSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterResponse]
  }
}

