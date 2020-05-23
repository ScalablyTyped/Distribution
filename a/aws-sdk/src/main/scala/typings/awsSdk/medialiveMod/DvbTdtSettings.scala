package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin1000Max30000] = js.native
}

object DvbTdtSettings {
  @scala.inline
  def apply(RepInterval: js.UndefOr[integerMin1000Max30000] = js.undefined): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RepInterval)) __obj.updateDynamic("RepInterval")(RepInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbTdtSettings]
  }
}

