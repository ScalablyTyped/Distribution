package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * By default, UpdateTable always creates an archived version of the table before updating it. However, if skipArchive is set to true, UpdateTable does not create the archived version.
    */
  var SkipArchive: js.UndefOr[BooleanNullable] = js.native
  
  /**
    * An updated TableInput object to define the metadata table in the catalog.
    */
  var TableInput: typings.awsSdk.glueMod.TableInput = js.native
}
object UpdateTableRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, TableInput: TableInput): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableInput = TableInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRequestMutableBuilder[Self <: UpdateTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipArchive(value: BooleanNullable): Self = StObject.set(x, "SkipArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipArchiveUndefined: Self = StObject.set(x, "SkipArchive", js.undefined)
    
    @scala.inline
    def setTableInput(value: TableInput): Self = StObject.set(x, "TableInput", value.asInstanceOf[js.Any])
  }
}
