package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkHeader extends js.Object {
  
  /**
    * Information about the destination of the component.
    */
  var Destination: js.UndefOr[NetworkPathComponentDetails] = js.native
  
  /**
    * The protocol used for the component.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the origin of the component.
    */
  var Source: js.UndefOr[NetworkPathComponentDetails] = js.native
}
object NetworkHeader {
  
  @scala.inline
  def apply(): NetworkHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkHeader]
  }
  
  @scala.inline
  implicit class NetworkHeaderOps[Self <: NetworkHeader] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: NetworkPathComponentDetails): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setSource(value: NetworkPathComponentDetails): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
}
