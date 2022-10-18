package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostKeyResponse extends StObject {
  
  /**
    * Returns the details for the specified host key.
    */
  var HostKey: DescribedHostKey
}
object DescribeHostKeyResponse {
  
  inline def apply(HostKey: DescribedHostKey): DescribeHostKeyResponse = {
    val __obj = js.Dynamic.literal(HostKey = HostKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostKeyResponse]
  }
  
  extension [Self <: DescribeHostKeyResponse](x: Self) {
    
    inline def setHostKey(value: DescribedHostKey): Self = StObject.set(x, "HostKey", value.asInstanceOf[js.Any])
  }
}
