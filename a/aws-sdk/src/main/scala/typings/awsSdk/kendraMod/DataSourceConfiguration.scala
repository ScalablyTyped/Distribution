package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceConfiguration extends StObject {
  
  /**
    * Provides configuration information for connecting to a Confluence data source.
    */
  var ConfluenceConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ConfluenceConfiguration] = js.native
  
  /**
    * Provides information necessary to create a data source connector for a database.
    */
  var DatabaseConfiguration: js.UndefOr[typings.awsSdk.kendraMod.DatabaseConfiguration] = js.native
  
  /**
    * Provided configuration for data sources that connect to Microsoft OneDrive.
    */
  var OneDriveConfiguration: js.UndefOr[typings.awsSdk.kendraMod.OneDriveConfiguration] = js.native
  
  /**
    * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
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
    * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
    */
  var SharePointConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SharePointConfiguration] = js.native
}
object DataSourceConfiguration {
  
  @scala.inline
  def apply(): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  
  @scala.inline
  implicit class DataSourceConfigurationMutableBuilder[Self <: DataSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfluenceConfiguration(value: ConfluenceConfiguration): Self = StObject.set(x, "ConfluenceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfluenceConfigurationUndefined: Self = StObject.set(x, "ConfluenceConfiguration", js.undefined)
    
    @scala.inline
    def setDatabaseConfiguration(value: DatabaseConfiguration): Self = StObject.set(x, "DatabaseConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseConfigurationUndefined: Self = StObject.set(x, "DatabaseConfiguration", js.undefined)
    
    @scala.inline
    def setOneDriveConfiguration(value: OneDriveConfiguration): Self = StObject.set(x, "OneDriveConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneDriveConfigurationUndefined: Self = StObject.set(x, "OneDriveConfiguration", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3DataSourceConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
    
    @scala.inline
    def setSalesforceConfiguration(value: SalesforceConfiguration): Self = StObject.set(x, "SalesforceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceConfigurationUndefined: Self = StObject.set(x, "SalesforceConfiguration", js.undefined)
    
    @scala.inline
    def setServiceNowConfiguration(value: ServiceNowConfiguration): Self = StObject.set(x, "ServiceNowConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowConfigurationUndefined: Self = StObject.set(x, "ServiceNowConfiguration", js.undefined)
    
    @scala.inline
    def setSharePointConfiguration(value: SharePointConfiguration): Self = StObject.set(x, "SharePointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointConfigurationUndefined: Self = StObject.set(x, "SharePointConfiguration", js.undefined)
  }
}
