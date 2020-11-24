package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUUtilization extends js.Object {
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the I/O Wait state over the last 10 seconds.
    */
  var IOWait: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the IRQ state over the last 10 seconds.
    */
  var IRQ: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Percentage of time that the CPU has spent in the Idle state over the last 10 seconds.
    */
  var Idle: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the Nice state over the last 10 seconds.
    */
  var Nice: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Available on Windows environments only. Percentage of time that the CPU has spent in the Privileged state over the last 10 seconds.
    */
  var Privileged: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the SoftIRQ state over the last 10 seconds.
    */
  var SoftIRQ: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the System state over the last 10 seconds.
    */
  var System: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Percentage of time that the CPU has spent in the User state over the last 10 seconds.
    */
  var User: js.UndefOr[NullableDouble] = js.native
}
object CPUUtilization {
  
  @scala.inline
  def apply(): CPUUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUUtilization]
  }
  
  @scala.inline
  implicit class CPUUtilizationOps[Self <: CPUUtilization] (val x: Self) extends AnyVal {
    
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
    def setIOWait(value: NullableDouble): Self = this.set("IOWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIOWait: Self = this.set("IOWait", js.undefined)
    
    @scala.inline
    def setIRQ(value: NullableDouble): Self = this.set("IRQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIRQ: Self = this.set("IRQ", js.undefined)
    
    @scala.inline
    def setIdle(value: NullableDouble): Self = this.set("Idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdle: Self = this.set("Idle", js.undefined)
    
    @scala.inline
    def setNice(value: NullableDouble): Self = this.set("Nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNice: Self = this.set("Nice", js.undefined)
    
    @scala.inline
    def setPrivileged(value: NullableDouble): Self = this.set("Privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileged: Self = this.set("Privileged", js.undefined)
    
    @scala.inline
    def setSoftIRQ(value: NullableDouble): Self = this.set("SoftIRQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftIRQ: Self = this.set("SoftIRQ", js.undefined)
    
    @scala.inline
    def setSystem(value: NullableDouble): Self = this.set("System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("System", js.undefined)
    
    @scala.inline
    def setUser(value: NullableDouble): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
