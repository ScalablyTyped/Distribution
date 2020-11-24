package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortRange extends js.Object {
  
  /**
    * The first port in the range.
    */
  var From: js.UndefOr[Integer] = js.native
  
  /**
    * The last port in the range.
    */
  var To: js.UndefOr[Integer] = js.native
}
object PortRange {
  
  @scala.inline
  def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Integer): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("From", js.undefined)
    
    @scala.inline
    def setTo(value: Integer): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
}
