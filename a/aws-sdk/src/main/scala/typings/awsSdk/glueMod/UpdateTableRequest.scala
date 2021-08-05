package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  
  /**
    * By default, UpdateTable always creates an archived version of the table before updating it. However, if skipArchive is set to true, UpdateTable does not create the archived version.
    */
  var SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
  
  /**
    * An updated TableInput object to define the metadata table in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput
}
object UpdateTableRequest {
  
  inline def apply(DatabaseName: NameString, TableInput: TableInput): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  extension [Self <: UpdateTableRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setSkipArchive(value: BooleanNullable): Self = StObject.set(x, "SkipArchive", value.asInstanceOf[js.Any])
    
    inline def setSkipArchiveUndefined: Self = StObject.set(x, "SkipArchive", js.undefined)
    
    inline def setTableInput(value: TableInput): Self = StObject.set(x, "TableInput", value.asInstanceOf[js.Any])
  }
}
