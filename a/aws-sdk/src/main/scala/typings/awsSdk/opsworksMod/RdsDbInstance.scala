package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdsDbInstance extends StObject {
  
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
  implicit class RdsDbInstanceMutableBuilder[Self <: RdsDbInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: String): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setMissingOnRds(value: Boolean): Self = StObject.set(x, "MissingOnRds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingOnRdsUndefined: Self = StObject.set(x, "MissingOnRds", js.undefined)
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsDbInstanceArnUndefined: Self = StObject.set(x, "RdsDbInstanceArn", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
