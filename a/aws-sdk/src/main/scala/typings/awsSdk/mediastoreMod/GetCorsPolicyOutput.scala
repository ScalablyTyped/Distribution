package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCorsPolicyOutput extends StObject {
  
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: typings.awsSdk.mediastoreMod.CorsPolicy = js.native
}
object GetCorsPolicyOutput {
  
  @scala.inline
  def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
  
  @scala.inline
  implicit class GetCorsPolicyOutputMutableBuilder[Self <: GetCorsPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "CorsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsPolicyVarargs(value: CorsRule*): Self = StObject.set(x, "CorsPolicy", js.Array(value :_*))
  }
}
