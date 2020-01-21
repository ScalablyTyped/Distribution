package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionsList extends js.Object {
  /**
    * A list of connections used by the job.
    */
  var Connections: js.UndefOr[OrchestrationStringList] = js.native
}

object ConnectionsList {
  @scala.inline
  def apply(Connections: OrchestrationStringList = null): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionsList]
  }
}

