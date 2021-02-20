package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTablesOutputMod {
  
  @js.native
  trait ListTablesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The name of the last table in the current page of results. Use this value as the <code>ExclusiveStartTableName</code> in a new request to obtain the next page of results, until all the table names are returned.</p> <p>If you do not receive a <code>LastEvaluatedTableName</code> value in the response, this means that there are no more table names to be retrieved.</p>
      */
    var LastEvaluatedTableName: js.UndefOr[String] = js.native
    
    /**
      * <p>The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100.</p> <p>If <code>LastEvaluatedTableName</code> also appears in the output, you can use this value as the <code>ExclusiveStartTableName</code> parameter in a subsequent <code>ListTables</code> request and obtain the next page of results.</p>
      */
    var TableNames: js.UndefOr[js.Array[String]] = js.native
  }
  object ListTablesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListTablesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTablesOutput]
    }
    
    @scala.inline
    implicit class ListTablesOutputMutableBuilder[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedTableName(value: String): Self = StObject.set(x, "LastEvaluatedTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedTableNameUndefined: Self = StObject.set(x, "LastEvaluatedTableName", js.undefined)
      
      @scala.inline
      def setTableNames(value: js.Array[String]): Self = StObject.set(x, "TableNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNamesUndefined: Self = StObject.set(x, "TableNames", js.undefined)
      
      @scala.inline
      def setTableNamesVarargs(value: String*): Self = StObject.set(x, "TableNames", js.Array(value :_*))
    }
  }
}
