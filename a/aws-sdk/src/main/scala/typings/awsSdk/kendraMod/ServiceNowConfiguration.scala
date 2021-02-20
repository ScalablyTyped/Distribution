package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowConfiguration extends StObject {
  
  /**
    * The ServiceNow instance that the data source connects to. The host endpoint should look like the following: {instance}.service-now.com. 
    */
  var HostUrl: ServiceNowHostUrl = js.native
  
  /**
    * Provides configuration information for crawling knowledge articles in the ServiceNow site.
    */
  var KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secret Manager secret that contains the user name and password required to connect to the ServiceNow instance.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * Provides configuration information for crawling service catalogs in the ServiceNow site.
    */
  var ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration] = js.native
  
  /**
    * The identifier of the release that the ServiceNow host is running. If the host is not running the LONDON release, use OTHERS.
    */
  var ServiceNowBuildVersion: ServiceNowBuildVersionType = js.native
}
object ServiceNowConfiguration {
  
  @scala.inline
  def apply(
    HostUrl: ServiceNowHostUrl,
    SecretArn: SecretArn,
    ServiceNowBuildVersion: ServiceNowBuildVersionType
  ): ServiceNowConfiguration = {
    val __obj = js.Dynamic.literal(HostUrl = HostUrl.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], ServiceNowBuildVersion = ServiceNowBuildVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConfiguration]
  }
  
  @scala.inline
  implicit class ServiceNowConfigurationMutableBuilder[Self <: ServiceNowConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostUrl(value: ServiceNowHostUrl): Self = StObject.set(x, "HostUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeArticleConfiguration(value: ServiceNowKnowledgeArticleConfiguration): Self = StObject.set(x, "KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeArticleConfigurationUndefined: Self = StObject.set(x, "KnowledgeArticleConfiguration", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCatalogConfiguration(value: ServiceNowServiceCatalogConfiguration): Self = StObject.set(x, "ServiceCatalogConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCatalogConfigurationUndefined: Self = StObject.set(x, "ServiceCatalogConfiguration", js.undefined)
    
    @scala.inline
    def setServiceNowBuildVersion(value: ServiceNowBuildVersionType): Self = StObject.set(x, "ServiceNowBuildVersion", value.asInstanceOf[js.Any])
  }
}
