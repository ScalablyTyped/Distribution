package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegistriesResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of registry summaries.
    */
  var Registries: js.UndefOr[listOfRegistrySummary] = js.native
}

object ListRegistriesResponse {
  @scala.inline
  def apply(): ListRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesResponse]
  }
  @scala.inline
  implicit class ListRegistriesResponseOps[Self <: ListRegistriesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRegistriesVarargs(value: RegistrySummary*): Self = this.set("Registries", js.Array(value :_*))
    @scala.inline
    def setRegistries(value: listOfRegistrySummary): Self = this.set("Registries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistries: Self = this.set("Registries", js.undefined)
  }
  
}

