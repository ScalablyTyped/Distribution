package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterRdsDbInstanceRequest extends StObject {
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}
object DeregisterRdsDbInstanceRequest {
  
  @scala.inline
  def apply(RdsDbInstanceArn: String): DeregisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRdsDbInstanceRequest]
  }
  
  @scala.inline
  implicit class DeregisterRdsDbInstanceRequestMutableBuilder[Self <: DeregisterRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
  }
}
