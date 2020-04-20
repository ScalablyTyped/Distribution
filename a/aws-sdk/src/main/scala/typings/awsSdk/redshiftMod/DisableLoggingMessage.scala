package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableLoggingMessage extends js.Object {
  /**
    * The identifier of the cluster on which logging is to be stopped. Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
}

object DisableLoggingMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DisableLoggingMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableLoggingMessage]
  }
}

