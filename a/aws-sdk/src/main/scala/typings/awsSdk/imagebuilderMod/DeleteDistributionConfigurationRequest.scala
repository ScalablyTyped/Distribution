package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDistributionConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration to delete. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn
}
object DeleteDistributionConfigurationRequest {
  
  inline def apply(distributionConfigurationArn: DistributionConfigurationArn): DeleteDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionConfigurationRequest]
  }
  
  extension [Self <: DeleteDistributionConfigurationRequest](x: Self) {
    
    inline def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
  }
}
