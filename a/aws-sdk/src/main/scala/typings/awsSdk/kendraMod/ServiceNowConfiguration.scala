package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    ServiceNowBuildVersion: ServiceNowBuildVersionType,
    KnowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfiguration = null,
    ServiceCatalogConfiguration: ServiceNowServiceCatalogConfiguration = null
  ): ServiceNowConfiguration = {
    val __obj = js.Dynamic.literal(HostUrl = HostUrl.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], ServiceNowBuildVersion = ServiceNowBuildVersion.asInstanceOf[js.Any])
    if (KnowledgeArticleConfiguration != null) __obj.updateDynamic("KnowledgeArticleConfiguration")(KnowledgeArticleConfiguration.asInstanceOf[js.Any])
    if (ServiceCatalogConfiguration != null) __obj.updateDynamic("ServiceCatalogConfiguration")(ServiceCatalogConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConfiguration]
  }
}

