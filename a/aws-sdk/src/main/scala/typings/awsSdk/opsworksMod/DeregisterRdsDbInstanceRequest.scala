package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterRdsDbInstanceRequest extends js.Object {
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}

object DeregisterRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String): DeregisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRdsDbInstanceRequest]
  }
}

