package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCodeBindingSourceRequest extends StObject {
  
  /**
    * The language of the code binding.
    */
  var Language: string
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * The name of the schema.
    */
  var SchemaName: string
  
  /**
    * Specifying this limits the results to only this schema version.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
}
object GetCodeBindingSourceRequest {
  
  inline def apply(Language: string, RegistryName: string, SchemaName: string): GetCodeBindingSourceRequest = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeBindingSourceRequest]
  }
  
  extension [Self <: GetCodeBindingSourceRequest](x: Self) {
    
    inline def setLanguage(value: string): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
  }
}
