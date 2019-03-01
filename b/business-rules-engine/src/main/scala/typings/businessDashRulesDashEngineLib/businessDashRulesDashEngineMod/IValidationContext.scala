package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationContext[T] extends js.Object {
  var Data: T
  var Key: java.lang.String
  var Value: java.lang.String
}

object IValidationContext {
  @scala.inline
  def apply[T](Data: T, Key: java.lang.String, Value: java.lang.String): IValidationContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.updateDynamic("Key")(Key)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[IValidationContext[T]]
  }
}

