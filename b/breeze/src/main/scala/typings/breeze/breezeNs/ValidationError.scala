package typings.breeze.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ValidationError")
@js.native
class ValidationError protected () extends js.Object {
  def this(validator: Validator, context: js.Any, errorMessage: String, key: String) = this()
  var context: js.Any = js.native
  var errorMessage: String = js.native
  var key: String = js.native
  var property: IProperty = js.native
  var propertyName: String = js.native
  var validator: Validator = js.native
  def getKey(validator: Validator, property: String): String = js.native
}

