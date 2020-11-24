package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdsDbInstance extends js.Object {
  
  /**
    * The instance's address.
    */
  var Address: js.UndefOr[String] = js.native
  
  /**
    * The DB instance identifier.
    */
  var DbInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var DbPassword: js.UndefOr[String] = js.native
  
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  
  /**
    * The instance's database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * Set to true if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks Stacks attempts to discover the instance only once. If this value is set to true, you must deregister the instance, and then register it again.
    */
  var MissingOnRds: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance's ARN.
    */
  var RdsDbInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  
  /**
    * The ID of the stack with which the instance is registered.
    */
  var StackId: js.UndefOr[String] = js.native
}
object RdsDbInstance {
  
  @scala.inline
  def apply(): RdsDbInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstance]
  }
  
  @scala.inline
  implicit class RdsDbInstanceOps[Self <: RdsDbInstance] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: String): Self = this.set("DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbPassword(value: String): Self = this.set("DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbPassword: Self = this.set("DbPassword", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setMissingOnRds(value: Boolean): Self = this.set("MissingOnRds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingOnRds: Self = this.set("MissingOnRds", js.undefined)
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = this.set("RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsDbInstanceArn: Self = this.set("RdsDbInstanceArn", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
}
