package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpParameters extends js.Object {
  /**
    * The headers that need to be sent as part of request invoking the API Gateway REST API.
    */
  var HeaderParameters: js.UndefOr[HeaderParametersMap] = js.native
  /**
    * The path parameter values to be used to populate API Gateway REST API path wildcards ("*").
    */
  var PathParameterValues: js.UndefOr[PathParameterList] = js.native
  /**
    * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API.
    */
  var QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.native
}

object HttpParameters {
  @scala.inline
  def apply(): HttpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParameters]
  }
  @scala.inline
  implicit class HttpParametersOps[Self <: HttpParameters] (val x: Self) extends AnyVal {
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
    def setHeaderParameters(value: HeaderParametersMap): Self = this.set("HeaderParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderParameters: Self = this.set("HeaderParameters", js.undefined)
    @scala.inline
    def setPathParameterValuesVarargs(value: PathParameter*): Self = this.set("PathParameterValues", js.Array(value :_*))
    @scala.inline
    def setPathParameterValues(value: PathParameterList): Self = this.set("PathParameterValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathParameterValues: Self = this.set("PathParameterValues", js.undefined)
    @scala.inline
    def setQueryStringParameters(value: QueryStringParametersMap): Self = this.set("QueryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStringParameters: Self = this.set("QueryStringParameters", js.undefined)
  }
  
}

