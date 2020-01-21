package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoggingStatusMessage extends js.Object {
  /**
    * The identifier of the cluster from which to get the logging status. Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
}

object DescribeLoggingStatusMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DescribeLoggingStatusMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLoggingStatusMessage]
  }
}

