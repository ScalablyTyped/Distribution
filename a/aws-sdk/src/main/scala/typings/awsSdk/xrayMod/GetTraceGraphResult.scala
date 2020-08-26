package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceGraphResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The services that have processed one of the specified requests.
    */
  var Services: js.UndefOr[ServiceList] = js.native
}

object GetTraceGraphResult {
  @scala.inline
  def apply(): GetTraceGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTraceGraphResult]
  }
  @scala.inline
  implicit class GetTraceGraphResultOps[Self <: GetTraceGraphResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setServicesVarargs(value: Service*): Self = this.set("Services", js.Array(value :_*))
    @scala.inline
    def setServices(value: ServiceList): Self = this.set("Services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
  }
  
}

