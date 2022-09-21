package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFunctionRequest extends StObject {
  
  /**
    * The function code. For more information about writing a CloudFront function, see Writing function code for CloudFront Functions in the Amazon CloudFront Developer Guide.
    */
  var FunctionCode: FunctionBlob
  
  /**
    * Configuration information about the function, including an optional comment and the function’s runtime.
    */
  var FunctionConfig: typings.awsSdk.cloudfrontMod.FunctionConfig
  
  /**
    * A name to identify the function.
    */
  var Name: FunctionName
}
object CreateFunctionRequest {
  
  inline def apply(FunctionCode: FunctionBlob, FunctionConfig: FunctionConfig, Name: FunctionName): CreateFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionCode = FunctionCode.asInstanceOf[js.Any], FunctionConfig = FunctionConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionRequest]
  }
  
  extension [Self <: CreateFunctionRequest](x: Self) {
    
    inline def setFunctionCode(value: FunctionBlob): Self = StObject.set(x, "FunctionCode", value.asInstanceOf[js.Any])
    
    inline def setFunctionConfig(value: FunctionConfig): Self = StObject.set(x, "FunctionConfig", value.asInstanceOf[js.Any])
    
    inline def setName(value: FunctionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
