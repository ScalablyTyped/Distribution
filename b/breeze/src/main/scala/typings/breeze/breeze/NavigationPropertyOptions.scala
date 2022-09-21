package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPropertyOptions extends StObject {
  
  var associationName: js.UndefOr[String] = js.undefined
  
  var entityTypeName: String
  
  var foreignKeyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.undefined
  
  var invForeignKeyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var invForeignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.undefined
  
  var isScalar: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nameOnServer: js.UndefOr[String] = js.undefined
  
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}
object NavigationPropertyOptions {
  
  inline def apply(entityTypeName: String): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
  
  extension [Self <: NavigationPropertyOptions](x: Self) {
    
    inline def setAssociationName(value: String): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
    
    inline def setAssociationNameUndefined: Self = StObject.set(x, "associationName", js.undefined)
    
    inline def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNames", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNamesOnServer(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNamesOnServer", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNamesOnServerUndefined: Self = StObject.set(x, "foreignKeyNamesOnServer", js.undefined)
    
    inline def setForeignKeyNamesOnServerVarargs(value: String*): Self = StObject.set(x, "foreignKeyNamesOnServer", js.Array(value*))
    
    inline def setForeignKeyNamesUndefined: Self = StObject.set(x, "foreignKeyNames", js.undefined)
    
    inline def setForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "foreignKeyNames", js.Array(value*))
    
    inline def setInvForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "invForeignKeyNames", value.asInstanceOf[js.Any])
    
    inline def setInvForeignKeyNamesOnServer(value: js.Array[String]): Self = StObject.set(x, "invForeignKeyNamesOnServer", value.asInstanceOf[js.Any])
    
    inline def setInvForeignKeyNamesOnServerUndefined: Self = StObject.set(x, "invForeignKeyNamesOnServer", js.undefined)
    
    inline def setInvForeignKeyNamesOnServerVarargs(value: String*): Self = StObject.set(x, "invForeignKeyNamesOnServer", js.Array(value*))
    
    inline def setInvForeignKeyNamesUndefined: Self = StObject.set(x, "invForeignKeyNames", js.undefined)
    
    inline def setInvForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "invForeignKeyNames", js.Array(value*))
    
    inline def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setIsScalarUndefined: Self = StObject.set(x, "isScalar", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    inline def setNameOnServerUndefined: Self = StObject.set(x, "nameOnServer", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
