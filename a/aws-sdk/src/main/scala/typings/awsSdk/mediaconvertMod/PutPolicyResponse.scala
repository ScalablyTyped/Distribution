package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPolicyResponse extends StObject {
  
  /**
    * A policy configures behavior that you allow or disallow for your account. For information about MediaConvert policies, see the user guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Policy: js.UndefOr[typings.awsSdk.mediaconvertMod.Policy] = js.undefined
}
object PutPolicyResponse {
  
  inline def apply(): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyResponse]
  }
  
  extension [Self <: PutPolicyResponse](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
