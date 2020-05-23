package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProperty extends IProperty {
  var associationName: String
  var entityType: EntityType
  var foreignKeyNames: js.Array[String]
  var inverse: NavigationProperty
  var isScalar: Boolean
  var relatedDataProperties: js.Array[DataProperty]
}

object NavigationProperty {
  @scala.inline
  def apply(
    associationName: String,
    displayName: String,
    entityType: EntityType,
    foreignKeyNames: js.Array[String],
    inverse: NavigationProperty,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    isScalar: Boolean,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    relatedDataProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): NavigationProperty = {
    val __obj = js.Dynamic.literal(associationName = associationName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], foreignKeyNames = foreignKeyNames.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isScalar = isScalar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedDataProperties = relatedDataProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProperty]
  }
}

