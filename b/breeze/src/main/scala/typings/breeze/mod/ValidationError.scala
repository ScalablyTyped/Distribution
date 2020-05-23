package typings.breeze.mod

import typings.breeze.breeze.IProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "ValidationError")
@js.native
class ValidationError protected ()
  extends typings.breeze.breeze.ValidationError {
  def this(validator: typings.breeze.breeze.Validator, context: js.Any, errorMessage: String, key: String) = this()
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var errorMessage: String = js.native
  /* CompleteClass */
  override var key: String = js.native
  /* CompleteClass */
  override var property: IProperty = js.native
  /* CompleteClass */
  override var propertyName: String = js.native
  /* CompleteClass */
  override var validator: typings.breeze.breeze.Validator = js.native
  /* CompleteClass */
  override def getKey(validator: typings.breeze.breeze.Validator, property: String): String = js.native
}

