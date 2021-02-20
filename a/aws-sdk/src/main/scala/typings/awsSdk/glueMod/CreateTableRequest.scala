package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the Table. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of partition indexes, PartitionIndex structures, to create in the table.
    */
  var PartitionIndexes: js.UndefOr[PartitionIndexList] = js.native
  
  /**
    * The TableInput object that defines the metadata table to create in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput = js.native
}
object CreateTableRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableInput: TableInput): CreateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  @scala.inline
  implicit class CreateTableRequestMutableBuilder[Self <: CreateTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIndexes(value: PartitionIndexList): Self = StObject.set(x, "PartitionIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIndexesUndefined: Self = StObject.set(x, "PartitionIndexes", js.undefined)
    
    @scala.inline
    def setPartitionIndexesVarargs(value: PartitionIndex*): Self = StObject.set(x, "PartitionIndexes", js.Array(value :_*))
    
    @scala.inline
    def setTableInput(value: TableInput): Self = StObject.set(x, "TableInput", value.asInstanceOf[js.Any])
  }
}
