package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkParameters extends js.Object {
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port = js.native
}

object SparkParameters {
  @scala.inline
  def apply(Host: Host, Port: Port): SparkParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkParameters]
  }
}

