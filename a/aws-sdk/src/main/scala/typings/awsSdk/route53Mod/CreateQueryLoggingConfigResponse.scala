package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueryLoggingConfigResponse extends js.Object {
  /**
    * The unique URL representing the new query logging configuration.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains the ID for a query logging configuration, the ID of the hosted zone that you want to log queries for, and the ARN for the log group that you want Amazon Route 53 to send query logs to.
    */
  var QueryLoggingConfig: typings.awsSdk.route53Mod.QueryLoggingConfig = js.native
}

object CreateQueryLoggingConfigResponse {
  @scala.inline
  def apply(Location: ResourceURI, QueryLoggingConfig: QueryLoggingConfig): CreateQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], QueryLoggingConfig = QueryLoggingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueryLoggingConfigResponse]
  }
  @scala.inline
  implicit class CreateQueryLoggingConfigResponseOps[Self <: CreateQueryLoggingConfigResponse] (val x: Self) extends AnyVal {
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
    def setLocation(value: ResourceURI): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryLoggingConfig(value: QueryLoggingConfig): Self = this.set("QueryLoggingConfig", value.asInstanceOf[js.Any])
  }
  
}

