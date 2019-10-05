package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ValidationOptions")
@js.native
class ValidationOptions () extends js.Object {
  def this(config: ValidationOptionsConfiguration) = this()
  var validateOnAttach: Boolean = js.native
  var validateOnPropertyChange: Boolean = js.native
  var validateOnQuery: Boolean = js.native
  var validateOnSave: Boolean = js.native
  def setAsDefault(): ValidationOptions = js.native
  def using(config: ValidationOptionsConfiguration): ValidationOptions = js.native
}

/* static members */
@JSGlobal("breeze.ValidationOptions")
@js.native
object ValidationOptions extends js.Object {
  var defaultInstance: ValidationOptions = js.native
}

