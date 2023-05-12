package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPolicyResponse extends StObject {
  
  /**
    * <p>A key policy document in JSON format.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object GetKeyPolicyResponse {
  
  inline def apply(): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
