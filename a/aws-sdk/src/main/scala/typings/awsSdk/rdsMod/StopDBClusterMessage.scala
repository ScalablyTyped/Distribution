package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDBClusterMessage extends js.Object {
  /**
    * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String = js.native
}

object StopDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBClusterMessage]
  }
  @scala.inline
  implicit class StopDBClusterMessageOps[Self <: StopDBClusterMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
  
}

