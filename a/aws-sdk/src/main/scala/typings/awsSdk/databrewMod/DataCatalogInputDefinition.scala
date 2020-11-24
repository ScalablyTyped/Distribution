package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogInputDefinition extends js.Object {
  
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
  implicit class DataCatalogInputDefinitionOps[Self <: DataCatalogInputDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogId): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setTempDirectory(value: S3Location): Self = this.set("TempDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempDirectory: Self = this.set("TempDirectory", js.undefined)
  }
}
