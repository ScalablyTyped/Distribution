package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameters extends js.Object {
  
  /**
    * Amazon Elasticsearch Service parameters.
    */
  var AmazonElasticsearchParameters: js.UndefOr[typings.awsSdk.quicksightMod.AmazonElasticsearchParameters] = js.native
  
  /**
    * Amazon Athena parameters.
    */
  var AthenaParameters: js.UndefOr[typings.awsSdk.quicksightMod.AthenaParameters] = js.native
  
  /**
    * Amazon Aurora MySQL parameters.
    */
  var AuroraParameters: js.UndefOr[typings.awsSdk.quicksightMod.AuroraParameters] = js.native
  
  /**
    * Aurora PostgreSQL parameters.
    */
  var AuroraPostgreSqlParameters: js.UndefOr[typings.awsSdk.quicksightMod.AuroraPostgreSqlParameters] = js.native
  
  /**
    * AWS IoT Analytics parameters.
    */
  var AwsIotAnalyticsParameters: js.UndefOr[typings.awsSdk.quicksightMod.AwsIotAnalyticsParameters] = js.native
  
  /**
    * Jira parameters.
    */
  var JiraParameters: js.UndefOr[typings.awsSdk.quicksightMod.JiraParameters] = js.native
  
  /**
    * MariaDB parameters.
    */
  var MariaDbParameters: js.UndefOr[typings.awsSdk.quicksightMod.MariaDbParameters] = js.native
  
  /**
    * MySQL parameters.
    */
  var MySqlParameters: js.UndefOr[typings.awsSdk.quicksightMod.MySqlParameters] = js.native
  
  /**
    * Oracle parameters.
    */
  var OracleParameters: js.UndefOr[typings.awsSdk.quicksightMod.OracleParameters] = js.native
  
  /**
    * PostgreSQL parameters.
    */
  var PostgreSqlParameters: js.UndefOr[typings.awsSdk.quicksightMod.PostgreSqlParameters] = js.native
  
  /**
    * Presto parameters.
    */
  var PrestoParameters: js.UndefOr[typings.awsSdk.quicksightMod.PrestoParameters] = js.native
  
  /**
    * Amazon RDS parameters.
    */
  var RdsParameters: js.UndefOr[typings.awsSdk.quicksightMod.RdsParameters] = js.native
  
  /**
    * Amazon Redshift parameters.
    */
  var RedshiftParameters: js.UndefOr[typings.awsSdk.quicksightMod.RedshiftParameters] = js.native
  
  /**
    * S3 parameters.
    */
  var S3Parameters: js.UndefOr[typings.awsSdk.quicksightMod.S3Parameters] = js.native
  
  /**
    * ServiceNow parameters.
    */
  var ServiceNowParameters: js.UndefOr[typings.awsSdk.quicksightMod.ServiceNowParameters] = js.native
  
  /**
    * Snowflake parameters.
    */
  var SnowflakeParameters: js.UndefOr[typings.awsSdk.quicksightMod.SnowflakeParameters] = js.native
  
  /**
    * Spark parameters.
    */
  var SparkParameters: js.UndefOr[typings.awsSdk.quicksightMod.SparkParameters] = js.native
  
  /**
    * SQL Server parameters.
    */
  var SqlServerParameters: js.UndefOr[typings.awsSdk.quicksightMod.SqlServerParameters] = js.native
  
  /**
    * Teradata parameters.
    */
  var TeradataParameters: js.UndefOr[typings.awsSdk.quicksightMod.TeradataParameters] = js.native
  
  /**
    * Twitter parameters.
    */
  var TwitterParameters: js.UndefOr[typings.awsSdk.quicksightMod.TwitterParameters] = js.native
}
object DataSourceParameters {
  
  @scala.inline
  def apply(): DataSourceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameters]
  }
  
  @scala.inline
  implicit class DataSourceParametersOps[Self <: DataSourceParameters] (val x: Self) extends AnyVal {
    
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
    def setAmazonElasticsearchParameters(value: AmazonElasticsearchParameters): Self = this.set("AmazonElasticsearchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonElasticsearchParameters: Self = this.set("AmazonElasticsearchParameters", js.undefined)
    
    @scala.inline
    def setAthenaParameters(value: AthenaParameters): Self = this.set("AthenaParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAthenaParameters: Self = this.set("AthenaParameters", js.undefined)
    
    @scala.inline
    def setAuroraParameters(value: AuroraParameters): Self = this.set("AuroraParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuroraParameters: Self = this.set("AuroraParameters", js.undefined)
    
    @scala.inline
    def setAuroraPostgreSqlParameters(value: AuroraPostgreSqlParameters): Self = this.set("AuroraPostgreSqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuroraPostgreSqlParameters: Self = this.set("AuroraPostgreSqlParameters", js.undefined)
    
    @scala.inline
    def setAwsIotAnalyticsParameters(value: AwsIotAnalyticsParameters): Self = this.set("AwsIotAnalyticsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotAnalyticsParameters: Self = this.set("AwsIotAnalyticsParameters", js.undefined)
    
    @scala.inline
    def setJiraParameters(value: JiraParameters): Self = this.set("JiraParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJiraParameters: Self = this.set("JiraParameters", js.undefined)
    
    @scala.inline
    def setMariaDbParameters(value: MariaDbParameters): Self = this.set("MariaDbParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMariaDbParameters: Self = this.set("MariaDbParameters", js.undefined)
    
    @scala.inline
    def setMySqlParameters(value: MySqlParameters): Self = this.set("MySqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMySqlParameters: Self = this.set("MySqlParameters", js.undefined)
    
    @scala.inline
    def setOracleParameters(value: OracleParameters): Self = this.set("OracleParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOracleParameters: Self = this.set("OracleParameters", js.undefined)
    
    @scala.inline
    def setPostgreSqlParameters(value: PostgreSqlParameters): Self = this.set("PostgreSqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostgreSqlParameters: Self = this.set("PostgreSqlParameters", js.undefined)
    
    @scala.inline
    def setPrestoParameters(value: PrestoParameters): Self = this.set("PrestoParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrestoParameters: Self = this.set("PrestoParameters", js.undefined)
    
    @scala.inline
    def setRdsParameters(value: RdsParameters): Self = this.set("RdsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsParameters: Self = this.set("RdsParameters", js.undefined)
    
    @scala.inline
    def setRedshiftParameters(value: RedshiftParameters): Self = this.set("RedshiftParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshiftParameters: Self = this.set("RedshiftParameters", js.undefined)
    
    @scala.inline
    def setS3Parameters(value: S3Parameters): Self = this.set("S3Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Parameters: Self = this.set("S3Parameters", js.undefined)
    
    @scala.inline
    def setServiceNowParameters(value: ServiceNowParameters): Self = this.set("ServiceNowParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNowParameters: Self = this.set("ServiceNowParameters", js.undefined)
    
    @scala.inline
    def setSnowflakeParameters(value: SnowflakeParameters): Self = this.set("SnowflakeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowflakeParameters: Self = this.set("SnowflakeParameters", js.undefined)
    
    @scala.inline
    def setSparkParameters(value: SparkParameters): Self = this.set("SparkParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparkParameters: Self = this.set("SparkParameters", js.undefined)
    
    @scala.inline
    def setSqlServerParameters(value: SqlServerParameters): Self = this.set("SqlServerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlServerParameters: Self = this.set("SqlServerParameters", js.undefined)
    
    @scala.inline
    def setTeradataParameters(value: TeradataParameters): Self = this.set("TeradataParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeradataParameters: Self = this.set("TeradataParameters", js.undefined)
    
    @scala.inline
    def setTwitterParameters(value: TwitterParameters): Self = this.set("TwitterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitterParameters: Self = this.set("TwitterParameters", js.undefined)
  }
}
