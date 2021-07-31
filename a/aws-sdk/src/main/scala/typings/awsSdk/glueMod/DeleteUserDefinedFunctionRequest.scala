package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the function definition to be deleted.
    */
  var FunctionName: NameString
}
object DeleteUserDefinedFunctionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, FunctionName: NameString): DeleteUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserDefinedFunctionRequest]
  }
  
  @scala.inline
  implicit class DeleteUserDefinedFunctionRequestMutableBuilder[Self <: DeleteUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
