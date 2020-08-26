package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerNodeEndpoint extends js.Object {
  /**
    * The address of the node endpoint
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The port of the node endpoint
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
}

object CustomerNodeEndpoint {
  @scala.inline
  def apply(): CustomerNodeEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerNodeEndpoint]
  }
  @scala.inline
  implicit class CustomerNodeEndpointOps[Self <: CustomerNodeEndpoint] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
  
}

