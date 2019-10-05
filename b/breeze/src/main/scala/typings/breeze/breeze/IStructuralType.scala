package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructuralType extends js.Object {
  var complexProperties: js.Array[DataProperty]
  var dataProperties: js.Array[DataProperty]
  var name: String
  var namespace: String
  var shortName: String
  var unmappedProperties: js.Array[DataProperty]
  var validators: js.Array[Validator]
}

object IStructuralType {
  @scala.inline
  def apply(
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    name: String,
    namespace: String,
    shortName: String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): IStructuralType = {
    val __obj = js.Dynamic.literal(complexProperties = complexProperties, dataProperties = dataProperties, name = name, namespace = namespace, shortName = shortName, unmappedProperties = unmappedProperties, validators = validators)
  
    __obj.asInstanceOf[IStructuralType]
  }
}

