package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NavigationProperty")
@js.native
class NavigationProperty protected () extends IProperty {
  def this(config: NavigationPropertyOptions) = this()
  var associationName: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  var entityType: EntityType = js.native
  var foreignKeyNames: js.Array[String] = js.native
  var inverse: NavigationProperty = js.native
  /* CompleteClass */
  override var isDataProperty: Boolean = js.native
  /* CompleteClass */
  override var isNavigationProperty: Boolean = js.native
  var isScalar: Boolean = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var nameOnServer: String = js.native
  /* CompleteClass */
  override var parentType: IStructuralType = js.native
  var relatedDataProperties: js.Array[DataProperty] = js.native
  /* CompleteClass */
  override var validators: js.Array[Validator] = js.native
}

