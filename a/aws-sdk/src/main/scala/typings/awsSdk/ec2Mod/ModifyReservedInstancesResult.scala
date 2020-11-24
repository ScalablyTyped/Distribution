package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReservedInstancesResult extends js.Object {
  
  /**
    * The ID for the modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
}
object ModifyReservedInstancesResult {
  
  @scala.inline
  def apply(): ModifyReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReservedInstancesResult]
  }
  
  @scala.inline
  implicit class ModifyReservedInstancesResultOps[Self <: ModifyReservedInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setReservedInstancesModificationId(value: String): Self = this.set("ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesModificationId: Self = this.set("ReservedInstancesModificationId", js.undefined)
  }
}
