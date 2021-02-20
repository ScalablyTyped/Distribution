package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketAddress extends StObject {
  
  /**
    * Name of a socket address.
    */
  var name: String = js.native
  
  /**
    * Port of a socket address.
    */
  var port: Integer = js.native
}
object SocketAddress {
  
  @scala.inline
  def apply(name: String, port: Integer): SocketAddress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketAddress]
  }
  
  @scala.inline
  implicit class SocketAddressMutableBuilder[Self <: SocketAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
