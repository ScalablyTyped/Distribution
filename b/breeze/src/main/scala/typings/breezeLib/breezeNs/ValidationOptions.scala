package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ValidationOptions")
@js.native
class ValidationOptions () extends js.Object {
  def this(config: ValidationOptionsConfiguration) = this()
  var validateOnAttach: scala.Boolean = js.native
  var validateOnPropertyChange: scala.Boolean = js.native
  var validateOnQuery: scala.Boolean = js.native
  var validateOnSave: scala.Boolean = js.native
  def setAsDefault(): ValidationOptions = js.native
  def using(config: ValidationOptionsConfiguration): ValidationOptions = js.native
}

@JSGlobal("breeze.ValidationOptions")
@js.native
object ValidationOptions extends js.Object {
  var defaultInstance: breezeLib.breezeNs.ValidationOptions = js.native
}

