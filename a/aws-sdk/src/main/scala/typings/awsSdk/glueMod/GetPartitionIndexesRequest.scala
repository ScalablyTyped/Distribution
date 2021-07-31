package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionIndexesRequest extends StObject {
  
  /**
    * The catalog ID where the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Specifies the name of a database from which you want to retrieve partition indexes.
    */
  var DatabaseName: NameString
  
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Specifies the name of a table for which you want to retrieve the partition indexes.
    */
  var TableName: NameString
}
object GetPartitionIndexesRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): GetPartitionIndexesRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionIndexesRequest]
  }
  
  @scala.inline
  implicit class GetPartitionIndexesRequestMutableBuilder[Self <: GetPartitionIndexesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
