package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProperty
  extends StObject
     with IProperty {
  
  var associationName: String
  
  var entityType: EntityType
  
  var foreignKeyNames: js.Array[String]
  
  var inverse: NavigationProperty
  
  var isScalar: Boolean
  
  var relatedDataProperties: js.Array[DataProperty]
}
object NavigationProperty {
  
  inline def apply(
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
  
  extension [Self <: NavigationProperty](x: Self) {
    
    inline def setAssociationName(value: String): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNames", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "foreignKeyNames", js.Array(value :_*))
    
    inline def setInverse(value: NavigationProperty): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setRelatedDataProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "relatedDataProperties", value.asInstanceOf[js.Any])
    
    inline def setRelatedDataPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "relatedDataProperties", js.Array(value :_*))
  }
}
