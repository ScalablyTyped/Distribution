package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IcmpTypeCode extends js.Object {
  
  /**
    * The ICMP code. A value of -1 means all codes for the specified ICMP type.
    */
  var Code: js.UndefOr[Integer] = js.native
  
  /**
    * The ICMP type. A value of -1 means all types.
    */
  var Type: js.UndefOr[Integer] = js.native
}
object IcmpTypeCode {
  
  @scala.inline
  def apply(): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IcmpTypeCode]
  }
  
  @scala.inline
  implicit class IcmpTypeCodeOps[Self <: IcmpTypeCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Integer): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setType(value: Integer): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
