package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataProperty")
@js.native
class DataProperty protected () extends IProperty {
  def this(config: DataPropertyOptions) = this()
  var complexTypeName: java.lang.String = js.native
  var concurrencyMode: java.lang.String = js.native
  var dataType: DataTypeSymbol = js.native
  var defaultValue: js.Any = js.native
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  var isComplexProperty: scala.Boolean = js.native
  /* CompleteClass */
  override var isDataProperty: scala.Boolean = js.native
  var isInherited: scala.Boolean = js.native
  /* CompleteClass */
  override var isNavigationProperty: scala.Boolean = js.native
  var isNullable: scala.Boolean = js.native
  var isPartOfKey: scala.Boolean = js.native
  var isUnmapped: scala.Boolean = js.native
  var maxLength: scala.Double = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var nameOnServer: java.lang.String = js.native
  /* CompleteClass */
  override var parentType: IStructuralType = js.native
  var relatedNavigationProperty: NavigationProperty = js.native
  /* CompleteClass */
  override var validators: js.Array[Validator] = js.native
}

