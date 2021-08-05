package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySchemaVersionMetadataResponse extends StObject {
  
  /**
    * A map of a metadata key and associated values.
    */
  var MetadataInfoMap: js.UndefOr[typings.awsSdk.glueMod.MetadataInfoMap] = js.undefined
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
}
object QuerySchemaVersionMetadataResponse {
  
  inline def apply(): QuerySchemaVersionMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchemaVersionMetadataResponse]
  }
  
  extension [Self <: QuerySchemaVersionMetadataResponse](x: Self) {
    
    inline def setMetadataInfoMap(value: MetadataInfoMap): Self = StObject.set(x, "MetadataInfoMap", value.asInstanceOf[js.Any])
    
    inline def setMetadataInfoMapUndefined: Self = StObject.set(x, "MetadataInfoMap", js.undefined)
    
    inline def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
  }
}
