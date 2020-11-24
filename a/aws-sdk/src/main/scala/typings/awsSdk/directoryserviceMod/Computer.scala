package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computer extends js.Object {
  
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.native
  
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.directoryserviceMod.ComputerName] = js.native
}
object Computer {
  
  @scala.inline
  def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  
  @scala.inline
  implicit class ComputerOps[Self <: Computer] (val x: Self) extends AnyVal {
    
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
    def setComputerAttributesVarargs(value: Attribute*): Self = this.set("ComputerAttributes", js.Array(value :_*))
    
    @scala.inline
    def setComputerAttributes(value: Attributes): Self = this.set("ComputerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerAttributes: Self = this.set("ComputerAttributes", js.undefined)
    
    @scala.inline
    def setComputerId(value: SID): Self = this.set("ComputerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerId: Self = this.set("ComputerId", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = this.set("ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerName: Self = this.set("ComputerName", js.undefined)
  }
}
