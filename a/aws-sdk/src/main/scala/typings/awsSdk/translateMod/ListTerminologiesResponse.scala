package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTerminologiesResponse extends js.Object {
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typings.awsSdk.translateMod.TerminologyPropertiesList] = js.native
}

object ListTerminologiesResponse {
  @scala.inline
  def apply(): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
  @scala.inline
  implicit class ListTerminologiesResponseOps[Self <: ListTerminologiesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTerminologyPropertiesListVarargs(value: TerminologyProperties*): Self = this.set("TerminologyPropertiesList", js.Array(value :_*))
    @scala.inline
    def setTerminologyPropertiesList(value: TerminologyPropertiesList): Self = this.set("TerminologyPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminologyPropertiesList: Self = this.set("TerminologyPropertiesList", js.undefined)
  }
  
}

