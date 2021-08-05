package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogInputDefinition extends StObject {
  
  /**
    * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
    */
  var CatalogId: js.UndefOr[typings.awsSdk.databrewMod.CatalogId] = js.undefined
  
  /**
    * The name of a database in the Data Catalog.
    */
  var DatabaseName: typings.awsSdk.databrewMod.DatabaseName
  
  /**
    * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
    */
  var TableName: typings.awsSdk.databrewMod.TableName
  
  /**
    * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
    */
  var TempDirectory: js.UndefOr[S3Location] = js.undefined
}
object DataCatalogInputDefinition {
  
  inline def apply(DatabaseName: DatabaseName, TableName: TableName): DataCatalogInputDefinition = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogInputDefinition]
  }
  
  extension [Self <: DataCatalogInputDefinition](x: Self) {
    
    inline def setCatalogId(value: CatalogId): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}
