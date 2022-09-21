package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFunctionRequest extends StObject {
  
  /**
    * The current version (ETag value) of the function that you are deleting, which you can get using DescribeFunction.
    */
  var IfMatch: String
  
  /**
    * The name of the function that you are deleting.
    */
  var Name: String
}
object DeleteFunctionRequest {
  
  inline def apply(IfMatch: String, Name: String): DeleteFunctionRequest = {
    val __obj = js.Dynamic.literal(IfMatch = IfMatch.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionRequest]
  }
  
  extension [Self <: DeleteFunctionRequest](x: Self) {
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
