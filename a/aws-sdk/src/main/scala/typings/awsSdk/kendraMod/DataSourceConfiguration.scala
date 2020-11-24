package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceConfiguration extends js.Object {
  
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
  implicit class DataSourceConfigurationOps[Self <: DataSourceConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfluenceConfiguration(value: ConfluenceConfiguration): Self = this.set("ConfluenceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfluenceConfiguration: Self = this.set("ConfluenceConfiguration", js.undefined)
    
    @scala.inline
    def setDatabaseConfiguration(value: DatabaseConfiguration): Self = this.set("DatabaseConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseConfiguration: Self = this.set("DatabaseConfiguration", js.undefined)
    
    @scala.inline
    def setOneDriveConfiguration(value: OneDriveConfiguration): Self = this.set("OneDriveConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveConfiguration: Self = this.set("OneDriveConfiguration", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3DataSourceConfiguration): Self = this.set("S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Configuration: Self = this.set("S3Configuration", js.undefined)
    
    @scala.inline
    def setSalesforceConfiguration(value: SalesforceConfiguration): Self = this.set("SalesforceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceConfiguration: Self = this.set("SalesforceConfiguration", js.undefined)
    
    @scala.inline
    def setServiceNowConfiguration(value: ServiceNowConfiguration): Self = this.set("ServiceNowConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNowConfiguration: Self = this.set("ServiceNowConfiguration", js.undefined)
    
    @scala.inline
    def setSharePointConfiguration(value: SharePointConfiguration): Self = this.set("SharePointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharePointConfiguration: Self = this.set("SharePointConfiguration", js.undefined)
  }
}
