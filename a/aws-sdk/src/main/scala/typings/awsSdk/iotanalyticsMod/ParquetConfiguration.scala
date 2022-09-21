package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParquetConfiguration extends StObject {
  
  /**
    * Information needed to define a schema.
    */
  var schemaDefinition: js.UndefOr[SchemaDefinition] = js.undefined
}
object ParquetConfiguration {
  
  inline def apply(): ParquetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParquetConfiguration]
  }
  
  extension [Self <: ParquetConfiguration](x: Self) {
    
    inline def setSchemaDefinition(value: SchemaDefinition): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinitionUndefined: Self = StObject.set(x, "schemaDefinition", js.undefined)
  }
}
