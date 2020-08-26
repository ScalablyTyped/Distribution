package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsRequest extends js.Object {
  /**
    * The maximum number of domain names you want returned. The range is 1 to 100. The default setting is 100.
    */
  var MaxNumberOfDomains: js.UndefOr[Integer] = js.native
  /**
    * A string informing Amazon SimpleDB where to start the next list of domain names.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDomainsRequest {
  @scala.inline
  def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  @scala.inline
  implicit class ListDomainsRequestOps[Self <: ListDomainsRequest] (val x: Self) extends AnyVal {
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
    def setMaxNumberOfDomains(value: Integer): Self = this.set("MaxNumberOfDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNumberOfDomains: Self = this.set("MaxNumberOfDomains", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

