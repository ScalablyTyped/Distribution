package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalClusterMessage extends js.Object {
  /**
    *  The cluster identifier of the global database cluster being deleted. 
    */
  var GlobalClusterIdentifier: String = js.native
}

object DeleteGlobalClusterMessage {
  @scala.inline
  def apply(GlobalClusterIdentifier: String): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
}

