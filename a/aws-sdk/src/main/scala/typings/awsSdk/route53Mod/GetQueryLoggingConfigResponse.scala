package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryLoggingConfigResponse extends js.Object {
  /**
    * A complex type that contains information about the query logging configuration that you specified in a GetQueryLoggingConfig request.
    */
  var QueryLoggingConfig: typings.awsSdk.route53Mod.QueryLoggingConfig = js.native
}

object GetQueryLoggingConfigResponse {
  @scala.inline
  def apply(QueryLoggingConfig: QueryLoggingConfig): GetQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfig = QueryLoggingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryLoggingConfigResponse]
  }
  @scala.inline
  implicit class GetQueryLoggingConfigResponseOps[Self <: GetQueryLoggingConfigResponse] (val x: Self) extends AnyVal {
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
    def setQueryLoggingConfig(value: QueryLoggingConfig): Self = this.set("QueryLoggingConfig", value.asInstanceOf[js.Any])
  }
  
}

