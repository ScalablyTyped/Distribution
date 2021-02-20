package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the function. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database in which to create the function.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A FunctionInput object that defines the function to create in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput = js.native
}
object CreateUserDefinedFunctionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput): CreateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
  }
  
  @scala.inline
  implicit class CreateUserDefinedFunctionRequestMutableBuilder[Self <: CreateUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionInput(value: UserDefinedFunctionInput): Self = StObject.set(x, "FunctionInput", value.asInstanceOf[js.Any])
  }
}
