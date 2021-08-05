package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfiguration extends StObject {
  
  /**
    * Provides configuration information for connecting to a Confluence data source.
    */
  var ConfluenceConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ConfluenceConfiguration] = js.undefined
  
  /**
    * Provides information necessary to create a data source connector for a database.
    */
  var DatabaseConfiguration: js.UndefOr[typings.awsSdk.kendraMod.DatabaseConfiguration] = js.undefined
  
  /**
    * Provided configuration for data sources that connect to Microsoft OneDrive.
    */
  var OneDriveConfiguration: js.UndefOr[typings.awsSdk.kendraMod.OneDriveConfiguration] = js.undefined
  
  /**
    * Provides information to create a data source connector for a document repository in an Amazon S3 bucket.
    */
  var S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.undefined
  
  /**
    * Provides configuration information for data sources that connect to a Salesforce site.
    */
  var SalesforceConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SalesforceConfiguration] = js.undefined
  
  /**
    * Provides configuration for data sources that connect to ServiceNow instances.
    */
  var ServiceNowConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ServiceNowConfiguration] = js.undefined
  
  /**
    * Provides information necessary to create a data source connector for a Microsoft SharePoint site.
    */
  var SharePointConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SharePointConfiguration] = js.undefined
}
object DataSourceConfiguration {
  
  inline def apply(): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  
  extension [Self <: DataSourceConfiguration](x: Self) {
    
    inline def setConfluenceConfiguration(value: ConfluenceConfiguration): Self = StObject.set(x, "ConfluenceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConfluenceConfigurationUndefined: Self = StObject.set(x, "ConfluenceConfiguration", js.undefined)
    
    inline def setDatabaseConfiguration(value: DatabaseConfiguration): Self = StObject.set(x, "DatabaseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDatabaseConfigurationUndefined: Self = StObject.set(x, "DatabaseConfiguration", js.undefined)
    
    inline def setOneDriveConfiguration(value: OneDriveConfiguration): Self = StObject.set(x, "OneDriveConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOneDriveConfigurationUndefined: Self = StObject.set(x, "OneDriveConfiguration", js.undefined)
    
    inline def setS3Configuration(value: S3DataSourceConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
    
    inline def setSalesforceConfiguration(value: SalesforceConfiguration): Self = StObject.set(x, "SalesforceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSalesforceConfigurationUndefined: Self = StObject.set(x, "SalesforceConfiguration", js.undefined)
    
    inline def setServiceNowConfiguration(value: ServiceNowConfiguration): Self = StObject.set(x, "ServiceNowConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceNowConfigurationUndefined: Self = StObject.set(x, "ServiceNowConfiguration", js.undefined)
    
    inline def setSharePointConfiguration(value: SharePointConfiguration): Self = StObject.set(x, "SharePointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSharePointConfigurationUndefined: Self = StObject.set(x, "SharePointConfiguration", js.undefined)
  }
}
