package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityTypesListItem extends StObject {
  
  /**
    * An entity type within a labeled training dataset that Amazon Comprehend uses to train a custom entity recognizer. Entity types must not contain the following invalid characters: \n (line break), \\n (escaped line break, \r (carriage return), \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
    */
  var Type: EntityTypeName
}
object EntityTypesListItem {
  
  inline def apply(Type: EntityTypeName): EntityTypesListItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypesListItem]
  }
  
  extension [Self <: EntityTypesListItem](x: Self) {
    
    inline def setType(value: EntityTypeName): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
