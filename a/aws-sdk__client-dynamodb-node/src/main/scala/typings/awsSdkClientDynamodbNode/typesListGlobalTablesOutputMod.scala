package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesGlobalTableMod.UnmarshalledGlobalTable
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListGlobalTablesOutputMod {
  
  @js.native
  trait ListGlobalTablesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>List of global table names.</p>
      */
    var GlobalTables: js.UndefOr[js.Array[UnmarshalledGlobalTable]] = js.native
    
    /**
      * <p>Last evaluated global table name.</p>
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.native
  }
  object ListGlobalTablesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListGlobalTablesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListGlobalTablesOutput]
    }
    
    @scala.inline
    implicit class ListGlobalTablesOutputMutableBuilder[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTables(value: js.Array[UnmarshalledGlobalTable]): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
      
      @scala.inline
      def setGlobalTablesVarargs(value: UnmarshalledGlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value :_*))
      
      @scala.inline
      def setLastEvaluatedGlobalTableName(value: String): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
    }
  }
}
