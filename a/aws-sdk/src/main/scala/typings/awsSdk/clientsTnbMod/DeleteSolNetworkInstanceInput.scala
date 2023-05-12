package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSolNetworkInstanceInput extends StObject {
  
  /**
    * Network instance ID.
    */
  var nsInstanceId: NsInstanceId
}
object DeleteSolNetworkInstanceInput {
  
  inline def apply(nsInstanceId: NsInstanceId): DeleteSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsInstanceId = nsInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
  }
}
