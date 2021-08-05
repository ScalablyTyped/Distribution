package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which to create the function. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database in which to create the function.
    */
  var DatabaseName: NameString
  
  /**
    * A FunctionInput object that defines the function to create in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput
}
object CreateUserDefinedFunctionRequest {
  
  inline def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput): CreateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
  }
  
  extension [Self <: CreateUserDefinedFunctionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setFunctionInput(value: UserDefinedFunctionInput): Self = StObject.set(x, "FunctionInput", value.asInstanceOf[js.Any])
  }
}
