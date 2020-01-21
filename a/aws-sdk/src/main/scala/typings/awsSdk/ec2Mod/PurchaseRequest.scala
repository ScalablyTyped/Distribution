package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseRequest extends js.Object {
  /**
    * The number of instances.
    */
  var InstanceCount: Integer = js.native
  /**
    * The purchase token.
    */
  var PurchaseToken: String = js.native
}

object PurchaseRequest {
  @scala.inline
  def apply(InstanceCount: Integer, PurchaseToken: String): PurchaseRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], PurchaseToken = PurchaseToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PurchaseRequest]
  }
}

