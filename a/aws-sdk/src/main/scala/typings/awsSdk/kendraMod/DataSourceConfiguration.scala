package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfiguration extends js.Object {
  /**
    * Provides information necessary to create a connector for a database.
    */
  var DatabaseConfiguration: js.UndefOr[typings.awsSdk.kendraMod.DatabaseConfiguration] = js.native
  /**
    * Provided configuration for data sources that connect to Microsoft OneDrive.
    */
  var OneDriveConfiguration: js.UndefOr[typings.awsSdk.kendraMod.OneDriveConfiguration] = js.native
  /**
    * Provides information to create a connector for a document repository in an Amazon S3 bucket.
    */
  var S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.native
  /**
    * Provides configuration information for data sources that connect to a Salesforce site.
    */
  var SalesforceConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SalesforceConfiguration] = js.native
  /**
    * Provides configuration for data sources that connect to ServiceNow instances.
    */
  var ServiceNowConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServiceNowConfiguration] = js.native
  /**
    * Provides information necessary to create a connector for a Microsoft SharePoint site.
    */
  var SharePointConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SharePointConfiguration] = js.native
}

object DataSourceConfiguration {
  @scala.inline
  def apply(
    DatabaseConfiguration: DatabaseConfiguration = null,
    OneDriveConfiguration: OneDriveConfiguration = null,
    S3Configuration: S3DataSourceConfiguration = null,
    SalesforceConfiguration: SalesforceConfiguration = null,
    ServiceNowConfiguration: ServiceNowConfiguration = null,
    SharePointConfiguration: SharePointConfiguration = null
  ): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DatabaseConfiguration != null) __obj.updateDynamic("DatabaseConfiguration")(DatabaseConfiguration.asInstanceOf[js.Any])
    if (OneDriveConfiguration != null) __obj.updateDynamic("OneDriveConfiguration")(OneDriveConfiguration.asInstanceOf[js.Any])
    if (S3Configuration != null) __obj.updateDynamic("S3Configuration")(S3Configuration.asInstanceOf[js.Any])
    if (SalesforceConfiguration != null) __obj.updateDynamic("SalesforceConfiguration")(SalesforceConfiguration.asInstanceOf[js.Any])
    if (ServiceNowConfiguration != null) __obj.updateDynamic("ServiceNowConfiguration")(ServiceNowConfiguration.asInstanceOf[js.Any])
    if (SharePointConfiguration != null) __obj.updateDynamic("SharePointConfiguration")(SharePointConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfiguration]
  }
}

