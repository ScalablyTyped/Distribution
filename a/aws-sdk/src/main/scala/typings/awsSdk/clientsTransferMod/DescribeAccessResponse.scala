package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessResponse extends StObject {
  
  /**
    * The external identifier of the server that the access is attached to.
    */
  var Access: DescribedAccess
  
  /**
    * A system-assigned unique identifier for a server that has this access assigned.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object DescribeAccessResponse {
  
  inline def apply(Access: DescribedAccess, ServerId: ServerId): DescribeAccessResponse = {
    val __obj = js.Dynamic.literal(Access = Access.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: DescribedAccess): Self = StObject.set(x, "Access", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
