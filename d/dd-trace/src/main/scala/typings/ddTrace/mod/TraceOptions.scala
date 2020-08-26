package typings.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceOptions extends Analyzable {
  /**
    * The resource you are tracing. The resource name must not be longer than
    * 5000 characters.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * The service you are tracing. The service name must not be longer than
    * 100 characters.
    */
  var service: js.UndefOr[String] = js.native
  /**
    * The type of request.
    */
  var `type`: js.UndefOr[String] = js.native
}

object TraceOptions {
  @scala.inline
  def apply(): TraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceOptions]
  }
  @scala.inline
  implicit class TraceOptionsOps[Self <: TraceOptions] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

