package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResult extends StObject {
  
  /**
    * The resource policy document, as provided in the PutResourcePolicyRequest.
    */
  var ResourcePolicy: js.UndefOr[typings.awsSdk.clientsXrayMod.ResourcePolicy] = js.undefined
}
object PutResourcePolicyResult {
  
  inline def apply(): PutResourcePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyResult] (val x: Self) extends AnyVal {
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
