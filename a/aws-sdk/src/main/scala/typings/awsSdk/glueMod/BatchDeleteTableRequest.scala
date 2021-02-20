package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database in which the tables to delete reside. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of the table to delete.
    */
  var TablesToDelete: BatchDeleteTableNameList = js.native
}
object BatchDeleteTableRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TablesToDelete: BatchDeleteTableNameList): BatchDeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TablesToDelete = TablesToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteTableRequestMutableBuilder[Self <: BatchDeleteTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesToDelete(value: BatchDeleteTableNameList): Self = StObject.set(x, "TablesToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesToDeleteVarargs(value: NameString*): Self = StObject.set(x, "TablesToDelete", js.Array(value :_*))
  }
}
