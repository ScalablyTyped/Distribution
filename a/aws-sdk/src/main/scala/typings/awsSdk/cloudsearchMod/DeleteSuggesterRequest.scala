package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSuggesterRequest extends js.Object {
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * Specifies the name of the suggester you want to delete.
    */
  var SuggesterName: StandardName = js.native
}

object DeleteSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, SuggesterName: StandardName): DeleteSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSuggesterRequest]
  }
}

