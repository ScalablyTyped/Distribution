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
  def apply(Address: String = null, Port: Int | scala.Double = null): CustomerNodeEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerNodeEndpoint]
  }
}

