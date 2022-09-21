package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableMod.UnmarshalledGlobalTable
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListGlobalTablesOutputMod {
  
  trait ListGlobalTablesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>List of global table names.</p>
      */
    var GlobalTables: js.UndefOr[js.Array[UnmarshalledGlobalTable]] = js.undefined
    
    /**
      * <p>Last evaluated global table name.</p>
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.undefined
  }
  object ListGlobalTablesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListGlobalTablesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListGlobalTablesOutput]
    }
    
    extension [Self <: ListGlobalTablesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setGlobalTables(value: js.Array[UnmarshalledGlobalTable]): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
      
      inline def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
      
      inline def setGlobalTablesVarargs(value: UnmarshalledGlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value*))
      
      inline def setLastEvaluatedGlobalTableName(value: String): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
    }
  }
}
