package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfiguration extends StObject {
  
  /**
    * The VPC subnets and security groups associated with a task.  All specified subnets and security groups must be from the same VPC. 
    */
  var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
}
object NetworkConfiguration {
  
  inline def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  extension [Self <: NetworkConfiguration](x: Self) {
    
    inline def setAwsvpcConfiguration(value: AwsVpcConfiguration): Self = StObject.set(x, "awsvpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAwsvpcConfigurationUndefined: Self = StObject.set(x, "awsvpcConfiguration", js.undefined)
  }
}
