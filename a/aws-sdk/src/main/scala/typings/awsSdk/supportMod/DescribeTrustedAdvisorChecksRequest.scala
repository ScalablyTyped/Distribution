package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorChecksRequest extends js.Object {
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: String = js.native
}

object DescribeTrustedAdvisorChecksRequest {
  @scala.inline
  def apply(language: String): DescribeTrustedAdvisorChecksRequest = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksRequest]
  }
}

