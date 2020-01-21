package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineSuggesterResponse extends js.Object {
  var Suggester: SuggesterStatus = js.native
}

object DefineSuggesterResponse {
  @scala.inline
  def apply(Suggester: SuggesterStatus): DefineSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineSuggesterResponse]
  }
}

