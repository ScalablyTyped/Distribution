package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessResponse extends StObject {
  
  /**
    * The external ID of the server that the access is attached to.
    */
  var Access: DescribedAccess
  
  /**
    * A system-assigned unique identifier for a server that has this access assigned.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object DescribeAccessResponse {
  
  inline def apply(Access: DescribedAccess, ServerId: ServerId): DescribeAccessResponse = {
    val __obj = js.Dynamic.literal(Access = Access.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessResponse]
  }
  
  extension [Self <: DescribeAccessResponse](x: Self) {
    
    inline def setAccess(value: DescribedAccess): Self = StObject.set(x, "Access", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
