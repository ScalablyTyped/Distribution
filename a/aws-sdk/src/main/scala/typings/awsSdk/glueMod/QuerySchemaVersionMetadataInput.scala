package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySchemaVersionMetadataInput extends StObject {
  
  /**
    * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
    */
  var MaxResults: js.UndefOr[QuerySchemaVersionMetadataMaxResults] = js.undefined
  
  /**
    * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.glueMod.MetadataList] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
  
  /**
    * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: js.UndefOr[typings.awsSdk.glueMod.SchemaId] = js.undefined
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.glueMod.SchemaVersionNumber] = js.undefined
}
object QuerySchemaVersionMetadataInput {
  
  @scala.inline
  def apply(): QuerySchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit class QuerySchemaVersionMetadataInputMutableBuilder[Self <: QuerySchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QuerySchemaVersionMetadataMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMetadataList(value: MetadataList): Self = StObject.set(x, "MetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataListUndefined: Self = StObject.set(x, "MetadataList", js.undefined)
    
    @scala.inline
    def setMetadataListVarargs(value: MetadataKeyValuePair*): Self = StObject.set(x, "MetadataList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}
