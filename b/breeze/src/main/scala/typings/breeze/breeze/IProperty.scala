package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProperty extends js.Object {
  
  var displayName: String = js.native
  
  var isDataProperty: Boolean = js.native
  
  var isNavigationProperty: Boolean = js.native
  
  var name: String = js.native
  
  var nameOnServer: String = js.native
  
  var parentType: IStructuralType = js.native
  
  var validators: js.Array[Validator] = js.native
}
object IProperty {
  
  @scala.inline
  def apply(
    displayName: String,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    validators: js.Array[Validator]
  ): IProperty = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperty]
  }
  
  @scala.inline
  implicit class IPropertyOps[Self <: IProperty] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataProperty(value: Boolean): Self = this.set("isDataProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigationProperty(value: Boolean): Self = this.set("isNavigationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServer(value: String): Self = this.set("nameOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: IStructuralType): Self = this.set("parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
}
