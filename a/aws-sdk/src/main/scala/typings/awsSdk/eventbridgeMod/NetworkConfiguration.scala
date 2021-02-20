package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfiguration extends StObject {
  
  /**
    * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode.
    */
  var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.native
}
object NetworkConfiguration {
  
  @scala.inline
  def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  @scala.inline
  implicit class NetworkConfigurationMutableBuilder[Self <: NetworkConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsvpcConfiguration(value: AwsVpcConfiguration): Self = StObject.set(x, "awsvpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsvpcConfigurationUndefined: Self = StObject.set(x, "awsvpcConfiguration", js.undefined)
  }
}
