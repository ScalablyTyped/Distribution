package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceParameters extends StObject {
  
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
  implicit class DataSourceParametersMutableBuilder[Self <: DataSourceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonElasticsearchParameters(value: AmazonElasticsearchParameters): Self = StObject.set(x, "AmazonElasticsearchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonElasticsearchParametersUndefined: Self = StObject.set(x, "AmazonElasticsearchParameters", js.undefined)
    
    @scala.inline
    def setAthenaParameters(value: AthenaParameters): Self = StObject.set(x, "AthenaParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAthenaParametersUndefined: Self = StObject.set(x, "AthenaParameters", js.undefined)
    
    @scala.inline
    def setAuroraParameters(value: AuroraParameters): Self = StObject.set(x, "AuroraParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuroraParametersUndefined: Self = StObject.set(x, "AuroraParameters", js.undefined)
    
    @scala.inline
    def setAuroraPostgreSqlParameters(value: AuroraPostgreSqlParameters): Self = StObject.set(x, "AuroraPostgreSqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuroraPostgreSqlParametersUndefined: Self = StObject.set(x, "AuroraPostgreSqlParameters", js.undefined)
    
    @scala.inline
    def setAwsIotAnalyticsParameters(value: AwsIotAnalyticsParameters): Self = StObject.set(x, "AwsIotAnalyticsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotAnalyticsParametersUndefined: Self = StObject.set(x, "AwsIotAnalyticsParameters", js.undefined)
    
    @scala.inline
    def setJiraParameters(value: JiraParameters): Self = StObject.set(x, "JiraParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJiraParametersUndefined: Self = StObject.set(x, "JiraParameters", js.undefined)
    
    @scala.inline
    def setMariaDbParameters(value: MariaDbParameters): Self = StObject.set(x, "MariaDbParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMariaDbParametersUndefined: Self = StObject.set(x, "MariaDbParameters", js.undefined)
    
    @scala.inline
    def setMySqlParameters(value: MySqlParameters): Self = StObject.set(x, "MySqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySqlParametersUndefined: Self = StObject.set(x, "MySqlParameters", js.undefined)
    
    @scala.inline
    def setOracleParameters(value: OracleParameters): Self = StObject.set(x, "OracleParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOracleParametersUndefined: Self = StObject.set(x, "OracleParameters", js.undefined)
    
    @scala.inline
    def setPostgreSqlParameters(value: PostgreSqlParameters): Self = StObject.set(x, "PostgreSqlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostgreSqlParametersUndefined: Self = StObject.set(x, "PostgreSqlParameters", js.undefined)
    
    @scala.inline
    def setPrestoParameters(value: PrestoParameters): Self = StObject.set(x, "PrestoParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrestoParametersUndefined: Self = StObject.set(x, "PrestoParameters", js.undefined)
    
    @scala.inline
    def setRdsParameters(value: RdsParameters): Self = StObject.set(x, "RdsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsParametersUndefined: Self = StObject.set(x, "RdsParameters", js.undefined)
    
    @scala.inline
    def setRedshiftParameters(value: RedshiftParameters): Self = StObject.set(x, "RedshiftParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftParametersUndefined: Self = StObject.set(x, "RedshiftParameters", js.undefined)
    
    @scala.inline
    def setS3Parameters(value: S3Parameters): Self = StObject.set(x, "S3Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ParametersUndefined: Self = StObject.set(x, "S3Parameters", js.undefined)
    
    @scala.inline
    def setServiceNowParameters(value: ServiceNowParameters): Self = StObject.set(x, "ServiceNowParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowParametersUndefined: Self = StObject.set(x, "ServiceNowParameters", js.undefined)
    
    @scala.inline
    def setSnowflakeParameters(value: SnowflakeParameters): Self = StObject.set(x, "SnowflakeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowflakeParametersUndefined: Self = StObject.set(x, "SnowflakeParameters", js.undefined)
    
    @scala.inline
    def setSparkParameters(value: SparkParameters): Self = StObject.set(x, "SparkParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparkParametersUndefined: Self = StObject.set(x, "SparkParameters", js.undefined)
    
    @scala.inline
    def setSqlServerParameters(value: SqlServerParameters): Self = StObject.set(x, "SqlServerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlServerParametersUndefined: Self = StObject.set(x, "SqlServerParameters", js.undefined)
    
    @scala.inline
    def setTeradataParameters(value: TeradataParameters): Self = StObject.set(x, "TeradataParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeradataParametersUndefined: Self = StObject.set(x, "TeradataParameters", js.undefined)
    
    @scala.inline
    def setTwitterParameters(value: TwitterParameters): Self = StObject.set(x, "TwitterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitterParametersUndefined: Self = StObject.set(x, "TwitterParameters", js.undefined)
  }
}
