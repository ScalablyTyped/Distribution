package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionsOnInterconnectRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId
}
object DescribeConnectionsOnInterconnectRequest {
  
  inline def apply(interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
  }
  
  extension [Self <: DescribeConnectionsOnInterconnectRequest](x: Self) {
    
    inline def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
  }
}
