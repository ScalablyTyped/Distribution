package typings.breeze.global.breeze

import typings.breeze.breeze.ValidationOptionsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ValidationOptions")
@js.native
class ValidationOptions ()
  extends typings.breeze.breeze.ValidationOptions {
  def this(config: ValidationOptionsConfiguration) = this()
  /* CompleteClass */
  override var validateOnAttach: Boolean = js.native
  /* CompleteClass */
  override var validateOnPropertyChange: Boolean = js.native
  /* CompleteClass */
  override var validateOnQuery: Boolean = js.native
  /* CompleteClass */
  override var validateOnSave: Boolean = js.native
  /* CompleteClass */
  override def setAsDefault(): typings.breeze.breeze.ValidationOptions = js.native
  /* CompleteClass */
  override def using(config: ValidationOptionsConfiguration): typings.breeze.breeze.ValidationOptions = js.native
}

/* static members */
@JSGlobal("breeze.ValidationOptions")
@js.native
object ValidationOptions extends js.Object {
  var defaultInstance: typings.breeze.breeze.ValidationOptions = js.native
}

