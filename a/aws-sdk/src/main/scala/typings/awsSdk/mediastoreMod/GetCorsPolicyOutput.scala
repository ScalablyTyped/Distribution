package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCorsPolicyOutput extends StObject {
  
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: typings.awsSdk.mediastoreMod.CorsPolicy
}
object GetCorsPolicyOutput {
  
  inline def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
  
  extension [Self <: GetCorsPolicyOutput](x: Self) {
    
    inline def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "CorsPolicy", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicyVarargs(value: CorsRule*): Self = StObject.set(x, "CorsPolicy", js.Array(value :_*))
  }
}
