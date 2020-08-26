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
  @scala.inline
  implicit class DescribeTrustedAdvisorChecksRequestOps[Self <: DescribeTrustedAdvisorChecksRequest] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
  }
  
}

