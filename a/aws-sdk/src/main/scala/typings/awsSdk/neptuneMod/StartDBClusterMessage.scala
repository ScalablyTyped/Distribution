package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDBClusterMessage extends js.Object {
  /**
    * The DB cluster identifier of the Neptune DB cluster to be started. This parameter is stored as a lowercase string.
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

