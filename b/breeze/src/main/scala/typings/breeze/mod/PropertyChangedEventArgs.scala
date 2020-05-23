package typings.breeze.mod

import typings.breeze.breeze.Entity
import typings.breeze.breeze.IProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "PropertyChangedEventArgs")
@js.native
class PropertyChangedEventArgs ()
  extends typings.breeze.breeze.PropertyChangedEventArgs {
  /* CompleteClass */
  override var entity: Entity = js.native
  /* CompleteClass */
  override var newValue: js.Any = js.native
  /* CompleteClass */
  override var oldValue: js.Any = js.native
  /* CompleteClass */
  override var parent: js.Any = js.native
  /* CompleteClass */
  override var property: IProperty = js.native
  /* CompleteClass */
  override var propertyName: String = js.native
}

