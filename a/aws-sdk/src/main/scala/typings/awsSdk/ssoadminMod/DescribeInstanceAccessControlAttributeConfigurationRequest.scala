package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
}
object DescribeInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(InstanceArn: InstanceArn): DescribeInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAccessControlAttributeConfigurationRequest]
  }
  
  extension [Self <: DescribeInstanceAccessControlAttributeConfigurationRequest](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
