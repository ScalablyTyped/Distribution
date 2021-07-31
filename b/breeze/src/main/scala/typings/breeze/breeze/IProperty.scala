package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProperty extends StObject {
  
  var displayName: String
  
  var isDataProperty: Boolean
  
  var isNavigationProperty: Boolean
  
  var name: String
  
  var nameOnServer: String
  
  var parentType: IStructuralType
  
  var validators: js.Array[Validator]
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
  implicit class IPropertyMutableBuilder[Self <: IProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataProperty(value: Boolean): Self = StObject.set(x, "isDataProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigationProperty(value: Boolean): Self = StObject.set(x, "isNavigationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: IStructuralType): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
