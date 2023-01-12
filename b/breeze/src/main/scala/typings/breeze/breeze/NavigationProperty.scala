package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProperty
  extends StObject
     with IProperty {
  
  var associationName: String
  
  var entityType: EntityType
  
  var entityTypeName: String
  
  var foreignKeyNames: js.Array[String]
  
  var foreignKeyNamesOnServer: js.Array[String]
  
  var invForeignKeyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var invForeignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.undefined
  
  var inverse: NavigationProperty
  
  var isScalar: Boolean
  
  var relatedDataProperties: js.Array[DataProperty]
}
object NavigationProperty {
  
  inline def apply(
    associationName: String,
    custom: Any,
    displayName: String,
    entityType: EntityType,
    entityTypeName: String,
    foreignKeyNames: js.Array[String],
    foreignKeyNamesOnServer: js.Array[String],
    inverse: NavigationProperty,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    isScalar: Boolean,
    name: String,
    nameOnServer: String,
    parentType: EntityType | ComplexType,
    relatedDataProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): NavigationProperty = {
    val __obj = js.Dynamic.literal(associationName = associationName.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], entityTypeName = entityTypeName.asInstanceOf[js.Any], foreignKeyNames = foreignKeyNames.asInstanceOf[js.Any], foreignKeyNamesOnServer = foreignKeyNamesOnServer.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isScalar = isScalar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedDataProperties = relatedDataProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationProperty] (val x: Self) extends AnyVal {
    
    inline def setAssociationName(value: String): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNames", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNamesOnServer(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNamesOnServer", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNamesOnServerVarargs(value: String*): Self = StObject.set(x, "foreignKeyNamesOnServer", js.Array(value*))
    
    inline def setForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "foreignKeyNames", js.Array(value*))
    
    inline def setInvForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "invForeignKeyNames", value.asInstanceOf[js.Any])
    
    inline def setInvForeignKeyNamesOnServer(value: js.Array[String]): Self = StObject.set(x, "invForeignKeyNamesOnServer", value.asInstanceOf[js.Any])
    
    inline def setInvForeignKeyNamesOnServerUndefined: Self = StObject.set(x, "invForeignKeyNamesOnServer", js.undefined)
    
    inline def setInvForeignKeyNamesOnServerVarargs(value: String*): Self = StObject.set(x, "invForeignKeyNamesOnServer", js.Array(value*))
    
    inline def setInvForeignKeyNamesUndefined: Self = StObject.set(x, "invForeignKeyNames", js.undefined)
    
    inline def setInvForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "invForeignKeyNames", js.Array(value*))
    
    inline def setInverse(value: NavigationProperty): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setRelatedDataProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "relatedDataProperties", value.asInstanceOf[js.Any])
    
    inline def setRelatedDataPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "relatedDataProperties", js.Array(value*))
  }
}
