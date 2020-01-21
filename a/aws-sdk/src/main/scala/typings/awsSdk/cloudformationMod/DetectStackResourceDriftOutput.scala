package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackResourceDriftOutput extends js.Object {
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: typings.awsSdk.cloudformationMod.StackResourceDrift = js.native
}

object DetectStackResourceDriftOutput {
  @scala.inline
  def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
}

