package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachCertificateFromDistributionRequest extends StObject {
  
  /**
    * The name of the distribution from which to detach the certificate. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName
}
object DetachCertificateFromDistributionRequest {
  
  inline def apply(distributionName: ResourceName): DetachCertificateFromDistributionRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachCertificateFromDistributionRequest]
  }
  
  extension [Self <: DetachCertificateFromDistributionRequest](x: Self) {
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
  }
}
