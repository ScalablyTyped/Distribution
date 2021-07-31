package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBgpFailoverTestResponse extends StObject {
  
  /**
    * Information about the virtual interface failover test.
    */
  var virtualInterfaceTest: js.UndefOr[VirtualInterfaceTestHistory] = js.undefined
}
object StartBgpFailoverTestResponse {
  
  @scala.inline
  def apply(): StartBgpFailoverTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBgpFailoverTestResponse]
  }
  
  @scala.inline
  implicit class StartBgpFailoverTestResponseMutableBuilder[Self <: StartBgpFailoverTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterfaceTest(value: VirtualInterfaceTestHistory): Self = StObject.set(x, "virtualInterfaceTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceTestUndefined: Self = StObject.set(x, "virtualInterfaceTest", js.undefined)
  }
}
