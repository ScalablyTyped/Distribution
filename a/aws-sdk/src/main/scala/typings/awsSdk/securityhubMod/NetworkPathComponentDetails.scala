package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPathComponentDetails extends js.Object {
  
  /**
    * The IP addresses of the destination.
    */
  var Address: js.UndefOr[StringList] = js.native
  
  /**
    * A list of port ranges for the destination.
    */
  var PortRanges: js.UndefOr[PortRangeList] = js.native
}
object NetworkPathComponentDetails {
  
  @scala.inline
  def apply(): NetworkPathComponentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPathComponentDetails]
  }
  
  @scala.inline
  implicit class NetworkPathComponentDetailsOps[Self <: NetworkPathComponentDetails] (val x: Self) extends AnyVal {
    
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
    def setAddressVarargs(value: NonEmptyString*): Self = this.set("Address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: StringList): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setPortRangesVarargs(value: PortRange*): Self = this.set("PortRanges", js.Array(value :_*))
    
    @scala.inline
    def setPortRanges(value: PortRangeList): Self = this.set("PortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortRanges: Self = this.set("PortRanges", js.undefined)
  }
}
