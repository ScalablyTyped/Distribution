package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureOption extends js.Object {
  /**
    * 
    */
  var CaptureMode: typings.awsSdk.sagemakerMod.CaptureMode = js.native
}

object CaptureOption {
  @scala.inline
  def apply(CaptureMode: CaptureMode): CaptureOption = {
    val __obj = js.Dynamic.literal(CaptureMode = CaptureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOption]
  }
}

