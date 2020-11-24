package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowConfiguration extends js.Object {
  
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
  implicit class ServiceNowConfigurationOps[Self <: ServiceNowConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostUrl(value: ServiceNowHostUrl): Self = this.set("HostUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowBuildVersion(value: ServiceNowBuildVersionType): Self = this.set("ServiceNowBuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeArticleConfiguration(value: ServiceNowKnowledgeArticleConfiguration): Self = this.set("KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnowledgeArticleConfiguration: Self = this.set("KnowledgeArticleConfiguration", js.undefined)
    
    @scala.inline
    def setServiceCatalogConfiguration(value: ServiceNowServiceCatalogConfiguration): Self = this.set("ServiceCatalogConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCatalogConfiguration: Self = this.set("ServiceCatalogConfiguration", js.undefined)
  }
}
