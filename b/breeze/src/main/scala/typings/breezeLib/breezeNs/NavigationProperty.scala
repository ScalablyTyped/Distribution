package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NavigationProperty")
@js.native
class NavigationProperty protected () extends IProperty {
  def this(config: NavigationPropertyOptions) = this()
  var associationName: java.lang.String = js.native
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  var entityType: EntityType = js.native
  var foreignKeyNames: js.Array[java.lang.String] = js.native
  var inverse: NavigationProperty = js.native
  /* CompleteClass */
  override var isDataProperty: scala.Boolean = js.native
  /* CompleteClass */
  override var isNavigationProperty: scala.Boolean = js.native
  var isScalar: scala.Boolean = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var nameOnServer: java.lang.String = js.native
  /* CompleteClass */
  override var parentType: IStructuralType = js.native
  var relatedDataProperties: js.Array[DataProperty] = js.native
  /* CompleteClass */
  override var validators: js.Array[Validator] = js.native
}

