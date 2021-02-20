package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteTableVersionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the tables reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the table. For Hive compatibility, this name is entirely lowercase.
    */
  var TableName: NameString = js.native
  
  /**
    * A list of the IDs of versions to be deleted. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionIds: BatchDeleteTableVersionList = js.native
}
object BatchDeleteTableVersionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString, VersionIds: BatchDeleteTableVersionList): BatchDeleteTableVersionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], VersionIds = VersionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableVersionRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteTableVersionRequestMutableBuilder[Self <: BatchDeleteTableVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIds(value: BatchDeleteTableVersionList): Self = StObject.set(x, "VersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdsVarargs(value: VersionString*): Self = StObject.set(x, "VersionIds", js.Array(value :_*))
  }
}
