package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the function to be retrieved is located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the function.
    */
  var FunctionName: NameString = js.native
}
object GetUserDefinedFunctionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, FunctionName: NameString): GetUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionRequest]
  }
  
  @scala.inline
  implicit class GetUserDefinedFunctionRequestMutableBuilder[Self <: GetUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
    
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
