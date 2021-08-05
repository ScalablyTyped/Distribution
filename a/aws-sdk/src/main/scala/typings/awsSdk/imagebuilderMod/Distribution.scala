package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  /**
    * The specific AMI settings (for example, launch permissions, AMI tags). 
    */
  var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.undefined
  
  /**
    * The License Manager Configuration to associate with the AMI in the specified Region.
    */
  var licenseConfigurationArns: js.UndefOr[LicenseConfigurationArnList] = js.undefined
  
  /**
    * The target Region. 
    */
  var region: NonEmptyString
}
object Distribution {
  
  inline def apply(region: NonEmptyString): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  extension [Self <: Distribution](x: Self) {
    
    inline def setAmiDistributionConfiguration(value: AmiDistributionConfiguration): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
    
    inline def setLicenseConfigurationArns(value: LicenseConfigurationArnList): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
    
    inline def setLicenseConfigurationArnsVarargs(value: LicenseConfigurationArn*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
