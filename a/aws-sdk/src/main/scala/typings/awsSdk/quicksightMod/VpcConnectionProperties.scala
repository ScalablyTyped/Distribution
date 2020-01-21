package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConnectionProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the VPC connection.
    */
  var VpcConnectionArn: Arn = js.native
}

object VpcConnectionProperties {
  @scala.inline
  def apply(VpcConnectionArn: Arn): VpcConnectionProperties = {
    val __obj = js.Dynamic.literal(VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcConnectionProperties]
  }
}

