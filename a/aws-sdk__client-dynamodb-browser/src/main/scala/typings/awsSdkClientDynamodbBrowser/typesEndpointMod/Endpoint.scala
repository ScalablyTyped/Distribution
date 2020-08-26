package typings.awsSdkClientDynamodbBrowser.typesEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * _String shape
    */
  var Address: String = js.native
  /**
    * _Long shape
    */
  var CachePeriodInMinutes: Double = js.native
}

object Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachePeriodInMinutes(value: Double): Self = this.set("CachePeriodInMinutes", value.asInstanceOf[js.Any])
  }
  
}

