package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProperty extends IProperty {
  var complexTypeName: String
  var concurrencyMode: String
  var dataType: DataTypeSymbol
  var defaultValue: js.Any
  var isComplexProperty: Boolean
  var isInherited: Boolean
  var isNullable: Boolean
  var isPartOfKey: Boolean
  var isUnmapped: Boolean
  var maxLength: Double
  var relatedNavigationProperty: NavigationProperty
}

object DataProperty {
  @scala.inline
  def apply(
    complexTypeName: String,
    concurrencyMode: String,
    dataType: DataTypeSymbol,
    defaultValue: js.Any,
    displayName: String,
    isComplexProperty: Boolean,
    isDataProperty: Boolean,
    isInherited: Boolean,
    isNavigationProperty: Boolean,
    isNullable: Boolean,
    isPartOfKey: Boolean,
    isUnmapped: Boolean,
    maxLength: Double,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    relatedNavigationProperty: NavigationProperty,
    validators: js.Array[Validator]
  ): DataProperty = {
    val __obj = js.Dynamic.literal(complexTypeName = complexTypeName.asInstanceOf[js.Any], concurrencyMode = concurrencyMode.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isComplexProperty = isComplexProperty.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isInherited = isInherited.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isNullable = isNullable.asInstanceOf[js.Any], isPartOfKey = isPartOfKey.asInstanceOf[js.Any], isUnmapped = isUnmapped.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedNavigationProperty = relatedNavigationProperty.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProperty]
  }
}

