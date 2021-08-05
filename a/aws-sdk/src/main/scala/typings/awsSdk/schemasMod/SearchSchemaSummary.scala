package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSchemaSummary extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.undefined
  
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSearchSchemaVersionSummary] = js.undefined
}
object SearchSchemaSummary {
  
  inline def apply(): SearchSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaSummary]
  }
  
  extension [Self <: SearchSchemaSummary](x: Self) {
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setSchemaVersions(value: listOfSearchSchemaVersionSummary): Self = StObject.set(x, "SchemaVersions", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionsUndefined: Self = StObject.set(x, "SchemaVersions", js.undefined)
    
    inline def setSchemaVersionsVarargs(value: SearchSchemaVersionSummary*): Self = StObject.set(x, "SchemaVersions", js.Array(value :_*))
  }
}
