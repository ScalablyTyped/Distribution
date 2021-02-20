package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}
object DescribeServerRequest {
  
  @scala.inline
  def apply(ServerId: ServerId): DescribeServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerRequest]
  }
  
  @scala.inline
  implicit class DescribeServerRequestMutableBuilder[Self <: DescribeServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
