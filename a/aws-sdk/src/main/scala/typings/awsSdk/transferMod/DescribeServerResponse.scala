package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServerResponse extends StObject {
  
  /**
    * An array containing the properties of a server with the ServerID you specified.
    */
  var Server: DescribedServer = js.native
}
object DescribeServerResponse {
  
  @scala.inline
  def apply(Server: DescribedServer): DescribeServerResponse = {
    val __obj = js.Dynamic.literal(Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerResponse]
  }
  
  @scala.inline
  implicit class DescribeServerResponseMutableBuilder[Self <: DescribeServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: DescribedServer): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
