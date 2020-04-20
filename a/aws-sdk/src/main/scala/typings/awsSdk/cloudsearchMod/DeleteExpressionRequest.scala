package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExpressionRequest extends js.Object {
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName = js.native
}

object DeleteExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ExpressionName = ExpressionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
}

