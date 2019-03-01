package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructuralType extends js.Object {
  var complexProperties: js.Array[DataProperty]
  var dataProperties: js.Array[DataProperty]
  var name: java.lang.String
  var namespace: java.lang.String
  var shortName: java.lang.String
  var unmappedProperties: js.Array[DataProperty]
  var validators: js.Array[Validator]
}

object IStructuralType {
  @scala.inline
  def apply(
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    name: java.lang.String,
    namespace: java.lang.String,
    shortName: java.lang.String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): IStructuralType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complexProperties")(complexProperties)
    __obj.updateDynamic("dataProperties")(dataProperties)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("shortName")(shortName)
    __obj.updateDynamic("unmappedProperties")(unmappedProperties)
    __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[IStructuralType]
  }
}

