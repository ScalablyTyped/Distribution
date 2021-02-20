package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlueTable extends StObject {
  
  /**
    * A unique identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the connection to the AWS Glue Data Catalog.
    */
  var ConnectionName: js.UndefOr[NameString] = js.native
  
  /**
    * A database name in the AWS Glue Data Catalog.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A table name in the AWS Glue Data Catalog.
    */
  var TableName: NameString = js.native
}
object GlueTable {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): GlueTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueTable]
  }
  
  @scala.inline
  implicit class GlueTableMutableBuilder[Self <: GlueTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: NameString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: NameString): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
