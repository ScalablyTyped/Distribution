package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHandshakeResponse extends StObject {
  
  /**
    * A structure that contains information about the specified handshake.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.undefined
}
object DescribeHandshakeResponse {
  
  inline def apply(): DescribeHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHandshakeResponse]
  }
  
  extension [Self <: DescribeHandshakeResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
