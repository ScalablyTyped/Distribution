package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostInstance extends js.Object {
  
  /**
    * The ID of instance that is running on the Dedicated Host.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The instance type (for example, m3.medium) of the running instance.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the instance.
    */
  var OwnerId: js.UndefOr[String] = js.native
}
object HostInstance {
  
  @scala.inline
  def apply(): HostInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostInstance]
  }
  
  @scala.inline
  implicit class HostInstanceOps[Self <: HostInstance] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
  }
}
