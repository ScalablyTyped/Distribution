package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationContext[T] extends js.Object {
  var Data: T
  var Key: String
  var Value: String
}

object IValidationContext {
  @scala.inline
  def apply[T](Data: T, Key: String, Value: String): IValidationContext[T] = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValidationContext[T]]
  }
}

