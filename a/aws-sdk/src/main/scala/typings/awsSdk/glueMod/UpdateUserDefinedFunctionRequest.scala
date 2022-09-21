package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the function to be updated is located. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database where the function to be updated is located.
    */
  var DatabaseName: NameString
  
  /**
    * A FunctionInput object that redefines the function in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput
  
  /**
    * The name of the function.
    */
  var FunctionName: NameString
}
object UpdateUserDefinedFunctionRequest {
  
  inline def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput, FunctionName: NameString): UpdateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
  }
  
  extension [Self <: UpdateUserDefinedFunctionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setFunctionInput(value: UserDefinedFunctionInput): Self = StObject.set(x, "FunctionInput", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
