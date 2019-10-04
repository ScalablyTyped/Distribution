package typings.ddDashTrace.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceOptions extends Analyzable {
  /**
    * The resource you are tracing. The resource name must not be longer than
    * 5000 characters.
    */
  var resource: js.UndefOr[String] = js.undefined
  /**
    * The service you are tracing. The service name must not be longer than
    * 100 characters.
    */
  var service: js.UndefOr[String] = js.undefined
  /**
    * The type of request.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TraceOptions {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    resource: String = null,
    service: String = null,
    `type`: String = null
  ): TraceOptions = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (service != null) __obj.updateDynamic("service")(service)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TraceOptions]
  }
}

