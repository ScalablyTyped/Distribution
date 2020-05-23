package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The data processors.
    */
  var Processors: js.UndefOr[ProcessorList] = js.native
}

object ProcessingConfiguration {
  @scala.inline
  def apply(Enabled: js.UndefOr[BooleanObject] = js.undefined, Processors: ProcessorList = null): ProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (Processors != null) __obj.updateDynamic("Processors")(Processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingConfiguration]
  }
}

