package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var TdtInterval: js.UndefOr[integerMin1000Max30000] = js.native
}

object DvbTdtSettings {
  @scala.inline
  def apply(TdtInterval: Int | Double = null): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    if (TdtInterval != null) __obj.updateDynamic("TdtInterval")(TdtInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbTdtSettings]
  }
}

