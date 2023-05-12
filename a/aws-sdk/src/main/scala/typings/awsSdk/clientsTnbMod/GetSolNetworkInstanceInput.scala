package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkInstanceInput extends StObject {
  
  /**
    * ID of the network instance.
    */
  var nsInstanceId: NsInstanceId
}
object GetSolNetworkInstanceInput {
  
  inline def apply(nsInstanceId: NsInstanceId): GetSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsInstanceId = nsInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
  }
}
