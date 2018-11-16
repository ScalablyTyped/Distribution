package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ValidationError")
@js.native
class ValidationError protected () extends js.Object {
  def this(validator: Validator, context: js.Any, errorMessage: java.lang.String, key: java.lang.String) = this()
  var context: js.Any = js.native
  var errorMessage: java.lang.String = js.native
  var key: java.lang.String = js.native
  var property: IProperty = js.native
  var propertyName: java.lang.String = js.native
  var validator: Validator = js.native
  def getKey(validator: Validator, property: java.lang.String): java.lang.String = js.native
}

