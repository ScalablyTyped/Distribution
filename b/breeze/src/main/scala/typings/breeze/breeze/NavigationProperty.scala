package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProperty extends IProperty {
  var associationName: String = js.native
  var entityType: EntityType = js.native
  var foreignKeyNames: js.Array[String] = js.native
  var inverse: NavigationProperty = js.native
  var isScalar: Boolean = js.native
  var relatedDataProperties: js.Array[DataProperty] = js.native
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
  @scala.inline
  implicit class NavigationPropertyOps[Self <: NavigationProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationName(value: String): Self = this.set("associationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeignKeyNamesVarargs(value: String*): Self = this.set("foreignKeyNames", js.Array(value :_*))
    @scala.inline
    def setForeignKeyNames(value: js.Array[String]): Self = this.set("foreignKeyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverse(value: NavigationProperty): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScalar(value: Boolean): Self = this.set("isScalar", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedDataPropertiesVarargs(value: DataProperty*): Self = this.set("relatedDataProperties", js.Array(value :_*))
    @scala.inline
    def setRelatedDataProperties(value: js.Array[DataProperty]): Self = this.set("relatedDataProperties", value.asInstanceOf[js.Any])
  }
  
}

