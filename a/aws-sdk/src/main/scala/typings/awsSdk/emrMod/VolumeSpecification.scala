package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeSpecification extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var SizeInGB: Integer = js.native
  /**
    * The volume type. Volume types supported are gp2, io1, standard.
    */
  var VolumeType: String = js.native
}

object VolumeSpecification {
  @scala.inline
  def apply(SizeInGB: Integer, VolumeType: String, Iops: Int | Double = null): VolumeSpecification = {
    val __obj = js.Dynamic.literal(SizeInGB = SizeInGB.asInstanceOf[js.Any], VolumeType = VolumeType.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeSpecification]
  }
}

