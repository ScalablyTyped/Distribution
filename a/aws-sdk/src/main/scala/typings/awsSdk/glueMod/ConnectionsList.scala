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
  def apply(): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionsList]
  }
  @scala.inline
  implicit class ConnectionsListOps[Self <: ConnectionsList] (val x: Self) extends AnyVal {
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
    def setConnectionsVarargs(value: GenericString*): Self = this.set("Connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: OrchestrationStringList): Self = this.set("Connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("Connections", js.undefined)
  }
  
}

