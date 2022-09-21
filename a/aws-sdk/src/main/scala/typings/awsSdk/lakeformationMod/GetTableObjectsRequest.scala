package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableObjectsRequest extends StObject {
  
  /**
    * The catalog containing the governed table. Defaults to the caller’s account.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The database containing the governed table.
    */
  var DatabaseName: NameString
  
  /**
    * Specifies how many values to return in a page.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token if this is not the first call to retrieve these objects.
    */
  var NextToken: js.UndefOr[TokenString] = js.undefined
  
  /**
    * A predicate to filter the objects returned based on the partition keys defined in the governed table.   The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=   The logical operators supported are: AND   The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd HH:mm:ss"), string and decimal.  
    */
  var PartitionPredicate: js.UndefOr[PredicateString] = js.undefined
  
  /**
    * The time as of when to read the governed table contents. If not set, the most recent transaction commit time is used. Cannot be specified along with TransactionId.
    */
  var QueryAsOfTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The governed table for which to retrieve objects.
    */
  var TableName: NameString
  
  /**
    * The transaction ID at which to read the governed table contents. If this transaction has aborted, an error is returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with QueryAsOfTime.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object GetTableObjectsRequest {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): GetTableObjectsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableObjectsRequest]
  }
  
  extension [Self <: GetTableObjectsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: TokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartitionPredicate(value: PredicateString): Self = StObject.set(x, "PartitionPredicate", value.asInstanceOf[js.Any])
    
    inline def setPartitionPredicateUndefined: Self = StObject.set(x, "PartitionPredicate", js.undefined)
    
    inline def setQueryAsOfTime(value: js.Date): Self = StObject.set(x, "QueryAsOfTime", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTimeUndefined: Self = StObject.set(x, "QueryAsOfTime", js.undefined)
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
