package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingConfig extends js.Object {
  /**
    * Current setting for autotrack.
    */
  var autotrack: Criticality = js.native
}

object TrackingConfig {
  @scala.inline
  def apply(autotrack: Criticality): TrackingConfig = {
    val __obj = js.Dynamic.literal(autotrack = autotrack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackingConfig]
  }
}

