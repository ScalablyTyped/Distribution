package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
}
object DeleteInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(InstanceArn: InstanceArn): DeleteInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceAccessControlAttributeConfigurationRequest]
  }
  
  extension [Self <: DeleteInstanceAccessControlAttributeConfigurationRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
