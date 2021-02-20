package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
  /**
    * The specific AMI settings (for example, launch permissions, AMI tags). 
    */
  var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.native
  
  /**
    * The License Manager Configuration to associate with the AMI in the specified Region.
    */
  var licenseConfigurationArns: js.UndefOr[LicenseConfigurationArnList] = js.native
  
  /**
    * The target Region. 
    */
  var region: NonEmptyString = js.native
}
object Distribution {
  
  @scala.inline
  def apply(region: NonEmptyString): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmiDistributionConfiguration(value: AmiDistributionConfiguration): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArns(value: LicenseConfigurationArnList): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: LicenseConfigurationArn*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
