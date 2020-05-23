package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * The DNS address of the Cluster.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.native
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, Port: js.UndefOr[Integer] = js.undefined): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

