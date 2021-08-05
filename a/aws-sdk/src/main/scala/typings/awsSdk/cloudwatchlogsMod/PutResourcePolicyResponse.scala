package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * The new policy.
    */
  var resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
}
object PutResourcePolicyResponse {
  
  inline def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  extension [Self <: PutResourcePolicyResponse](x: Self) {
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "resourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "resourcePolicy", js.undefined)
  }
}
