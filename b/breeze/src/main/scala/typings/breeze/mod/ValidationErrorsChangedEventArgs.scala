package typings.breeze.mod

import typings.breeze.breeze.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "ValidationErrorsChangedEventArgs")
@js.native
class ValidationErrorsChangedEventArgs ()
  extends typings.breeze.breeze.ValidationErrorsChangedEventArgs {
  /* CompleteClass */
  override var added: js.Array[typings.breeze.breeze.ValidationError] = js.native
  /* CompleteClass */
  override var entity: Entity = js.native
  /* CompleteClass */
  override var removed: js.Array[typings.breeze.breeze.ValidationError] = js.native
}

