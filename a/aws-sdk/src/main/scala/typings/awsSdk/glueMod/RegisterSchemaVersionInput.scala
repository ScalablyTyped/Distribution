package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterSchemaVersionInput extends StObject {
  
  /**
    * The schema definition using the DataFormat setting for the SchemaName.
    */
  var SchemaDefinition: SchemaDefinitionString
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.   SchemaId$SchemaName: The name of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId
}
object RegisterSchemaVersionInput {
  
  inline def apply(SchemaDefinition: SchemaDefinitionString, SchemaId: SchemaId): RegisterSchemaVersionInput = {
    val __obj = js.Dynamic.literal(SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterSchemaVersionInput]
  }
  
  extension [Self <: RegisterSchemaVersionInput](x: Self) {
    
    inline def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
  }
}
