package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ec2AmiResource extends js.Object {
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: typings.awsSdk.snowballMod.AmiId = js.native
  /**
    * The ID of the AMI on the Snowball Edge device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.native
}

object Ec2AmiResource {
  @scala.inline
  def apply(AmiId: AmiId, SnowballAmiId: String = null): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId.asInstanceOf[js.Any])
    if (SnowballAmiId != null) __obj.updateDynamic("SnowballAmiId")(SnowballAmiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2AmiResource]
  }
}

