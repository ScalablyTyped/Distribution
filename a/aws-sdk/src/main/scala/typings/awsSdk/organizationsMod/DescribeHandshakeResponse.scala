package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHandshakeResponse extends StObject {
  
  /**
    * A structure that contains information about the specified handshake.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}
object DescribeHandshakeResponse {
  
  @scala.inline
  def apply(): DescribeHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHandshakeResponse]
  }
  
  @scala.inline
  implicit class DescribeHandshakeResponseMutableBuilder[Self <: DescribeHandshakeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
