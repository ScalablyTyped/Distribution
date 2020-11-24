package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProperty extends IProperty {
  
  var complexTypeName: String = js.native
  
  var concurrencyMode: String = js.native
  
  var dataType: DataTypeSymbol = js.native
  
  var defaultValue: js.Any = js.native
  
  var isComplexProperty: Boolean = js.native
  
  var isInherited: Boolean = js.native
  
  var isNullable: Boolean = js.native
  
  var isPartOfKey: Boolean = js.native
  
  var isUnmapped: Boolean = js.native
  
  var maxLength: Double = js.native
  
  var relatedNavigationProperty: NavigationProperty = js.native
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
  
  @scala.inline
  implicit class DataPropertyOps[Self <: DataProperty] (val x: Self) extends AnyVal {
    
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
    def setComplexTypeName(value: String): Self = this.set("complexTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyMode(value: String): Self = this.set("concurrencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: DataTypeSymbol): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplexProperty(value: Boolean): Self = this.set("isComplexProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInherited(value: Boolean): Self = this.set("isInherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = this.set("isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPartOfKey(value: Boolean): Self = this.set("isPartOfKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnmapped(value: Boolean): Self = this.set("isUnmapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedNavigationProperty(value: NavigationProperty): Self = this.set("relatedNavigationProperty", value.asInstanceOf[js.Any])
  }
}
