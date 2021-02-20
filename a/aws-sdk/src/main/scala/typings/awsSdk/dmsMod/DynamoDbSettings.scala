package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamoDbSettings extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: String = js.native
}
object DynamoDbSettings {
  
  @scala.inline
  def apply(ServiceAccessRoleArn: String): DynamoDbSettings = {
    val __obj = js.Dynamic.literal(ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSettings]
  }
  
  @scala.inline
  implicit class DynamoDbSettingsMutableBuilder[Self <: DynamoDbSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
