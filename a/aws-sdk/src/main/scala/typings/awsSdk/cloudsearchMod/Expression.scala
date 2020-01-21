package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var ExpressionName: StandardName = js.native
  var ExpressionValue: typings.awsSdk.cloudsearchMod.ExpressionValue = js.native
}

object Expression {
  @scala.inline
  def apply(ExpressionName: StandardName, ExpressionValue: ExpressionValue): Expression = {
    val __obj = js.Dynamic.literal(ExpressionName = ExpressionName.asInstanceOf[js.Any], ExpressionValue = ExpressionValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Expression]
  }
}

