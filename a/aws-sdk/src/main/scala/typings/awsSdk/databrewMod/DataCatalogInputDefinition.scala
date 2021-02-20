package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogInputDefinition extends StObject {
  
  /**
    * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
    */
  var CatalogId: js.UndefOr[typings.awsSdk.databrewMod.CatalogId] = js.native
  
  /**
    * The name of a database in the Data Catalog.
    */
  var DatabaseName: typings.awsSdk.databrewMod.DatabaseName = js.native
  
  /**
    * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
    */
  var TableName: typings.awsSdk.databrewMod.TableName = js.native
  
  /**
    * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
    */
  var TempDirectory: js.UndefOr[S3Location] = js.native
}
object DataCatalogInputDefinition {
  
  @scala.inline
  def apply(DatabaseName: DatabaseName, TableName: TableName): DataCatalogInputDefinition = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogInputDefinition]
  }
  
  @scala.inline
  implicit class DataCatalogInputDefinitionMutableBuilder[Self <: DataCatalogInputDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogId): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}
