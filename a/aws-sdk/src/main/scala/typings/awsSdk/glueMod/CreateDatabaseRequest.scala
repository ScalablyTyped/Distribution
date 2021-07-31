package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatabaseRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the database. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The metadata for the database.
    */
  var DatabaseInput: typings.awsSdk.glueMod.DatabaseInput
}
object CreateDatabaseRequest {
  
  @scala.inline
  def apply(DatabaseInput: DatabaseInput): CreateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatabaseRequest]
  }
  
  @scala.inline
  implicit class CreateDatabaseRequestMutableBuilder[Self <: CreateDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseInput(value: DatabaseInput): Self = StObject.set(x, "DatabaseInput", value.asInstanceOf[js.Any])
  }
}
