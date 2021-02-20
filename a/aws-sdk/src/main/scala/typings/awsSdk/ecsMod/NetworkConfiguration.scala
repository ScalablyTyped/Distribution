package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfiguration extends StObject {
  
  /**
    * The VPC subnets and security groups associated with a task.  All specified subnets and security groups must be from the same VPC. 
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
