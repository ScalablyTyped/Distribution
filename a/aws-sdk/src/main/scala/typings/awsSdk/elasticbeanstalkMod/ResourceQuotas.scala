package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceQuotas extends StObject {
  
  /**
    * The quota for applications in the AWS account.
    */
  var ApplicationQuota: js.UndefOr[ResourceQuota] = js.native
  
  /**
    * The quota for application versions in the AWS account.
    */
  var ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.native
  
  /**
    * The quota for configuration templates in the AWS account.
    */
  var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.native
  
  /**
    * The quota for custom platforms in the AWS account.
    */
  var CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.native
  
  /**
    * The quota for environments in the AWS account.
    */
  var EnvironmentQuota: js.UndefOr[ResourceQuota] = js.native
}
object ResourceQuotas {
  
  @scala.inline
  def apply(): ResourceQuotas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotas]
  }
  
  @scala.inline
  implicit class ResourceQuotasMutableBuilder[Self <: ResourceQuotas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationQuota(value: ResourceQuota): Self = StObject.set(x, "ApplicationQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationQuotaUndefined: Self = StObject.set(x, "ApplicationQuota", js.undefined)
    
    @scala.inline
    def setApplicationVersionQuota(value: ResourceQuota): Self = StObject.set(x, "ApplicationVersionQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionQuotaUndefined: Self = StObject.set(x, "ApplicationVersionQuota", js.undefined)
    
    @scala.inline
    def setConfigurationTemplateQuota(value: ResourceQuota): Self = StObject.set(x, "ConfigurationTemplateQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTemplateQuotaUndefined: Self = StObject.set(x, "ConfigurationTemplateQuota", js.undefined)
    
    @scala.inline
    def setCustomPlatformQuota(value: ResourceQuota): Self = StObject.set(x, "CustomPlatformQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPlatformQuotaUndefined: Self = StObject.set(x, "CustomPlatformQuota", js.undefined)
    
    @scala.inline
    def setEnvironmentQuota(value: ResourceQuota): Self = StObject.set(x, "EnvironmentQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentQuotaUndefined: Self = StObject.set(x, "EnvironmentQuota", js.undefined)
  }
}
