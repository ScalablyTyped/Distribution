package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponse extends StObject {
  
  /**
    * The number of lines of code in a schema in a Fleet Advisor collector inventory.
    */
  var CodeLineCount: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The size level of the code in a schema in a Fleet Advisor collector inventory.
    */
  var CodeSize: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The complexity level of the code in a schema in a Fleet Advisor collector inventory.
    */
  var Complexity: js.UndefOr[String] = js.undefined
  
  /**
    * The database for a schema in a Fleet Advisor collector inventory.
    */
  var DatabaseInstance: js.UndefOr[DatabaseShortInfoResponse] = js.undefined
  
  var OriginalSchema: js.UndefOr[SchemaShortInfoResponse] = js.undefined
  
  /**
    * The ID of a schema in a Fleet Advisor collector inventory.
    */
  var SchemaId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a schema in a Fleet Advisor collector inventory.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The database server for a schema in a Fleet Advisor collector inventory.
    */
  var Server: js.UndefOr[ServerShortInfoResponse] = js.undefined
  
  /**
    * The similarity value for a schema in a Fleet Advisor collector inventory. A higher similarity value indicates that a schema is likely to be a duplicate.
    */
  var Similarity: js.UndefOr[DoubleOptional] = js.undefined
}
object SchemaResponse {
  
  inline def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  extension [Self <: SchemaResponse](x: Self) {
    
    inline def setCodeLineCount(value: LongOptional): Self = StObject.set(x, "CodeLineCount", value.asInstanceOf[js.Any])
    
    inline def setCodeLineCountUndefined: Self = StObject.set(x, "CodeLineCount", js.undefined)
    
    inline def setCodeSize(value: LongOptional): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    inline def setComplexity(value: String): Self = StObject.set(x, "Complexity", value.asInstanceOf[js.Any])
    
    inline def setComplexityUndefined: Self = StObject.set(x, "Complexity", js.undefined)
    
    inline def setDatabaseInstance(value: DatabaseShortInfoResponse): Self = StObject.set(x, "DatabaseInstance", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInstanceUndefined: Self = StObject.set(x, "DatabaseInstance", js.undefined)
    
    inline def setOriginalSchema(value: SchemaShortInfoResponse): Self = StObject.set(x, "OriginalSchema", value.asInstanceOf[js.Any])
    
    inline def setOriginalSchemaUndefined: Self = StObject.set(x, "OriginalSchema", js.undefined)
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setServer(value: ServerShortInfoResponse): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
    
    inline def setSimilarity(value: DoubleOptional): Self = StObject.set(x, "Similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "Similarity", js.undefined)
  }
}
