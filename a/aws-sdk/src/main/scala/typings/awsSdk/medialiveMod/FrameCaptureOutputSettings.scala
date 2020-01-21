package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureOutputSettings extends js.Object {
  /**
    * Required if the output group contains more than one output. This modifier forms part of the output file name.
    */
  var NameModifier: js.UndefOr[string] = js.native
}

object FrameCaptureOutputSettings {
  @scala.inline
  def apply(NameModifier: string = null): FrameCaptureOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureOutputSettings]
  }
}

