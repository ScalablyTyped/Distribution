package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReference extends StObject {
  
  /**
    * A structure that contains schema identity fields. Either this or the SchemaVersionId has to be provided.
    */
  var SchemaId: js.UndefOr[typings.awsSdk.glueMod.SchemaId] = js.undefined
  
  /**
    * The unique ID assigned to a version of the schema. Either this or the SchemaId has to be provided.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object SchemaReference {
  
  inline def apply(): SchemaReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReference]
  }
  
  extension [Self <: SchemaReference](x: Self) {
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setSchemaVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}
