package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDBClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to restart. Example: docdb-2019-05-28-15-24-52 
    */
  var DBClusterIdentifier: String = js.native
}

object StartDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): StartDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDBClusterMessage]
  }
}

