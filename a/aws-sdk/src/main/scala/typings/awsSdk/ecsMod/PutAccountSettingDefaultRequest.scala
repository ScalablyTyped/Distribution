package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSettingDefaultRequest extends StObject {
  
  /**
    * The resource name for which to modify the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the ENI limit for your Amazon ECS container instances is affected. If containerInsights is specified, the default setting for CloudWatch Container Insights for your clusters is affected.
    */
  var name: SettingName
  
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled and disabled.
    */
  var value: String
}
object PutAccountSettingDefaultRequest {
  
  @scala.inline
  def apply(name: SettingName, value: String): PutAccountSettingDefaultRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountSettingDefaultRequest]
  }
  
  @scala.inline
  implicit class PutAccountSettingDefaultRequestMutableBuilder[Self <: PutAccountSettingDefaultRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
