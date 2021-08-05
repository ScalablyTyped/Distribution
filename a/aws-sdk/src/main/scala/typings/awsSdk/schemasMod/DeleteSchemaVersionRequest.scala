package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaVersionRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * The name of the schema.
    */
  var SchemaName: string
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: string
}
object DeleteSchemaVersionRequest {
  
  inline def apply(RegistryName: string, SchemaName: string, SchemaVersion: string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
  
  extension [Self <: DeleteSchemaVersionRequest](x: Self) {
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
  }
}
