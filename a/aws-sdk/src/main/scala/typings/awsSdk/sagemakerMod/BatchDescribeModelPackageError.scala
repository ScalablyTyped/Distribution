package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeModelPackageError extends StObject {
  
  /**
    * 
    */
  var ErrorCode: String
  
  /**
    * 
    */
  var ErrorResponse: String
}
object BatchDescribeModelPackageError {
  
  inline def apply(ErrorCode: String, ErrorResponse: String): BatchDescribeModelPackageError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorResponse = ErrorResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeModelPackageError]
  }
  
  extension [Self <: BatchDescribeModelPackageError](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorResponse(value: String): Self = StObject.set(x, "ErrorResponse", value.asInstanceOf[js.Any])
  }
}
