package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBgpFailoverTestResponse extends StObject {
  
  /**
    * Information about the virtual interface failover test.
    */
  var virtualInterfaceTest: js.UndefOr[VirtualInterfaceTestHistory] = js.native
}
object StopBgpFailoverTestResponse {
  
  @scala.inline
  def apply(): StopBgpFailoverTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBgpFailoverTestResponse]
  }
  
  @scala.inline
  implicit class StopBgpFailoverTestResponseMutableBuilder[Self <: StopBgpFailoverTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterfaceTest(value: VirtualInterfaceTestHistory): Self = StObject.set(x, "virtualInterfaceTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceTestUndefined: Self = StObject.set(x, "virtualInterfaceTest", js.undefined)
  }
}
