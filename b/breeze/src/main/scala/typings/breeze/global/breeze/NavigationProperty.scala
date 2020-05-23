package typings.breeze.global.breeze

import typings.breeze.breeze.IStructuralType
import typings.breeze.breeze.NavigationPropertyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NavigationProperty")
@js.native
class NavigationProperty protected ()
  extends typings.breeze.breeze.NavigationProperty {
  def this(config: NavigationPropertyOptions) = this()
  /* CompleteClass */
  override var associationName: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var entityType: typings.breeze.breeze.EntityType = js.native
  /* CompleteClass */
  override var foreignKeyNames: js.Array[String] = js.native
  /* CompleteClass */
  override var inverse: typings.breeze.breeze.NavigationProperty = js.native
  /* CompleteClass */
  override var isDataProperty: Boolean = js.native
  /* CompleteClass */
  override var isNavigationProperty: Boolean = js.native
  /* CompleteClass */
  override var isScalar: Boolean = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var nameOnServer: String = js.native
  /* CompleteClass */
  override var parentType: IStructuralType = js.native
  /* CompleteClass */
  override var relatedDataProperties: js.Array[typings.breeze.breeze.DataProperty] = js.native
  /* CompleteClass */
  override var validators: js.Array[typings.breeze.breeze.Validator] = js.native
}

