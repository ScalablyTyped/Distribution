package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperty extends js.Object {
  var displayName: java.lang.String
  var isDataProperty: scala.Boolean
  var isNavigationProperty: scala.Boolean
  var name: java.lang.String
  var nameOnServer: java.lang.String
  var parentType: IStructuralType
  var validators: js.Array[Validator]
}

object IProperty {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    isDataProperty: scala.Boolean,
    isNavigationProperty: scala.Boolean,
    name: java.lang.String,
    nameOnServer: java.lang.String,
    parentType: IStructuralType,
    validators: js.Array[Validator]
  ): IProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("isDataProperty")(isDataProperty)
    __obj.updateDynamic("isNavigationProperty")(isNavigationProperty)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameOnServer")(nameOnServer)
    __obj.updateDynamic("parentType")(parentType)
    __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[IProperty]
  }
}

