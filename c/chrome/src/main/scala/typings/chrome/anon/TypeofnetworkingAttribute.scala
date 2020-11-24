package typings.chrome.anon

import typings.chrome.chrome.enterprise.networkingAttributes.NetworkDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofnetworkingAttribute extends js.Object {
  
  def getNetworkDetails(callback: js.Function1[/* networkDetails */ NetworkDetails, Unit]): Unit = js.native
}
object TypeofnetworkingAttribute {
  
  @scala.inline
  def apply(getNetworkDetails: js.Function1[/* networkDetails */ NetworkDetails, Unit] => Unit): TypeofnetworkingAttribute = {
    val __obj = js.Dynamic.literal(getNetworkDetails = js.Any.fromFunction1(getNetworkDetails))
    __obj.asInstanceOf[TypeofnetworkingAttribute]
  }
  
  @scala.inline
  implicit class TypeofnetworkingAttributeOps[Self <: TypeofnetworkingAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetNetworkDetails(value: js.Function1[/* networkDetails */ NetworkDetails, Unit] => Unit): Self = this.set("getNetworkDetails", js.Any.fromFunction1(value))
  }
}
