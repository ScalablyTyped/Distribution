package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsRequest extends js.Object {
  /**
    * Criteria for restricting the resulting list of platform versions. The filter is interpreted as a logical conjunction (AND) of the separate PlatformFilter terms.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.native
  /**
    * The maximum number of platform version values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.native
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListPlatformVersionsRequest {
  @scala.inline
  def apply(): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
  @scala.inline
  implicit class ListPlatformVersionsRequestOps[Self <: ListPlatformVersionsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: PlatformFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: PlatformFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxRecords(value: PlatformMaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

