package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeDetail extends js.Object {
  /**
    * The size of the volume, in GiB.
    */
  var Size: Long = js.native
}

object VolumeDetail {
  @scala.inline
  def apply(Size: Long): VolumeDetail = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeDetail]
  }
}

