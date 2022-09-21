package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServerDescription extends StObject {
  
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[typings.awsSdk.elbMod.InstancePort] = js.undefined
  
  /**
    * The names of the policies enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.undefined
}
object BackendServerDescription {
  
  inline def apply(): BackendServerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServerDescription]
  }
  
  extension [Self <: BackendServerDescription](x: Self) {
    
    inline def setInstancePort(value: InstancePort): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    inline def setInstancePortUndefined: Self = StObject.set(x, "InstancePort", js.undefined)
    
    inline def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    inline def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
  }
}
