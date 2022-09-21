package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenConfigurationNode extends StObject {
  
  /**
    * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
    */
  var Aggregate: js.UndefOr[typings.awsSdk.glueMod.Aggregate] = js.undefined
  
  /**
    * Specifies a transform that maps data property keys in the data source to data property keys in the data target. You can rename keys, modify the data types for keys, and choose which keys to drop from the dataset.
    */
  var ApplyMapping: js.UndefOr[typings.awsSdk.glueMod.ApplyMapping] = js.undefined
  
  /**
    * Specifies a connector to an Amazon Athena data source.
    */
  var AthenaConnectorSource: js.UndefOr[typings.awsSdk.glueMod.AthenaConnectorSource] = js.undefined
  
  /**
    * Specifies an Apache Kafka data store in the Data Catalog.
    */
  var CatalogKafkaSource: js.UndefOr[typings.awsSdk.glueMod.CatalogKafkaSource] = js.undefined
  
  /**
    * Specifies a Kinesis data source in the Glue Data Catalog.
    */
  var CatalogKinesisSource: js.UndefOr[typings.awsSdk.glueMod.CatalogKinesisSource] = js.undefined
  
  /**
    * Specifies a data store in the Glue Data Catalog.
    */
  var CatalogSource: js.UndefOr[typings.awsSdk.glueMod.CatalogSource] = js.undefined
  
  /**
    * Specifies a target that uses a Glue Data Catalog table.
    */
  var CatalogTarget: js.UndefOr[BasicCatalogTarget] = js.undefined
  
  /**
    * Specifies a transform that uses custom code you provide to perform the data transformation. The output is a collection of DynamicFrames.
    */
  var CustomCode: js.UndefOr[typings.awsSdk.glueMod.CustomCode] = js.undefined
  
  /**
    * Specifies an Apache Kafka data store.
    */
  var DirectKafkaSource: js.UndefOr[typings.awsSdk.glueMod.DirectKafkaSource] = js.undefined
  
  /**
    * Specifies a direct Amazon Kinesis data source.
    */
  var DirectKinesisSource: js.UndefOr[typings.awsSdk.glueMod.DirectKinesisSource] = js.undefined
  
  /**
    * Specifies a transform that removes rows of repeating data from a data set.
    */
  var DropDuplicates: js.UndefOr[typings.awsSdk.glueMod.DropDuplicates] = js.undefined
  
  /**
    * Specifies a transform that chooses the data property keys that you want to drop.
    */
  var DropFields: js.UndefOr[typings.awsSdk.glueMod.DropFields] = js.undefined
  
  /**
    * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default, Glue Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1 integers or other placeholders such as zeros, are not automatically recognized as nulls.
    */
  var DropNullFields: js.UndefOr[typings.awsSdk.glueMod.DropNullFields] = js.undefined
  
  var DynamoDBCatalogSource: js.UndefOr[typings.awsSdk.glueMod.DynamoDBCatalogSource] = js.undefined
  
  /**
    * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a value determined by imputation. The input data set is used to train the machine learning model that determines what the missing value should be.
    */
  var FillMissingValues: js.UndefOr[typings.awsSdk.glueMod.FillMissingValues] = js.undefined
  
  /**
    * Specifies a transform that splits a dataset into two, based on a filter condition.
    */
  var Filter: js.UndefOr[typings.awsSdk.glueMod.Filter] = js.undefined
  
  /**
    * Specifies a data source in a goverened Data Catalog.
    */
  var GovernedCatalogSource: js.UndefOr[typings.awsSdk.glueMod.GovernedCatalogSource] = js.undefined
  
  /**
    * Specifies a data target that writes to a goverened catalog.
    */
  var GovernedCatalogTarget: js.UndefOr[typings.awsSdk.glueMod.GovernedCatalogTarget] = js.undefined
  
  /**
    * Specifies a connector to a JDBC data source.
    */
  var JDBCConnectorSource: js.UndefOr[typings.awsSdk.glueMod.JDBCConnectorSource] = js.undefined
  
  /**
    * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
    */
  var JDBCConnectorTarget: js.UndefOr[typings.awsSdk.glueMod.JDBCConnectorTarget] = js.undefined
  
  /**
    * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data property keys. You can use inner, outer, left, right, left semi, and left anti joins.
    */
  var Join: js.UndefOr[typings.awsSdk.glueMod.Join] = js.undefined
  
  /**
    * Specifies a transform that merges a DynamicFrame with a staging DynamicFrame based on the specified primary keys to identify records. Duplicate records (records with the same primary keys) are not de-duplicated. 
    */
  var Merge: js.UndefOr[typings.awsSdk.glueMod.Merge] = js.undefined
  
  /**
    * Specifies a Microsoft SQL server data source in the Glue Data Catalog.
    */
  var MicrosoftSQLServerCatalogSource: js.UndefOr[typings.awsSdk.glueMod.MicrosoftSQLServerCatalogSource] = js.undefined
  
  /**
    * Specifies a target that uses Microsoft SQL.
    */
  var MicrosoftSQLServerCatalogTarget: js.UndefOr[typings.awsSdk.glueMod.MicrosoftSQLServerCatalogTarget] = js.undefined
  
  /**
    * Specifies a MySQL data source in the Glue Data Catalog.
    */
  var MySQLCatalogSource: js.UndefOr[typings.awsSdk.glueMod.MySQLCatalogSource] = js.undefined
  
  /**
    * Specifies a target that uses MySQL.
    */
  var MySQLCatalogTarget: js.UndefOr[typings.awsSdk.glueMod.MySQLCatalogTarget] = js.undefined
  
  /**
    * Specifies an Oracle data source in the Glue Data Catalog.
    */
  var OracleSQLCatalogSource: js.UndefOr[typings.awsSdk.glueMod.OracleSQLCatalogSource] = js.undefined
  
  /**
    * Specifies a target that uses Oracle SQL.
    */
  var OracleSQLCatalogTarget: js.UndefOr[typings.awsSdk.glueMod.OracleSQLCatalogTarget] = js.undefined
  
  /**
    * Specifies a transform that identifies, removes or masks PII data.
    */
  var PIIDetection: js.UndefOr[typings.awsSdk.glueMod.PIIDetection] = js.undefined
  
  /**
    * Specifies a PostgresSQL data source in the Glue Data Catalog.
    */
  var PostgreSQLCatalogSource: js.UndefOr[typings.awsSdk.glueMod.PostgreSQLCatalogSource] = js.undefined
  
  /**
    * Specifies a target that uses Postgres SQL.
    */
  var PostgreSQLCatalogTarget: js.UndefOr[typings.awsSdk.glueMod.PostgreSQLCatalogTarget] = js.undefined
  
  /**
    * Specifies an Amazon Redshift data store.
    */
  var RedshiftSource: js.UndefOr[typings.awsSdk.glueMod.RedshiftSource] = js.undefined
  
  /**
    * Specifies a target that uses Amazon Redshift.
    */
  var RedshiftTarget: js.UndefOr[typings.awsSdk.glueMod.RedshiftTarget] = js.undefined
  
  var RelationalCatalogSource: js.UndefOr[typings.awsSdk.glueMod.RelationalCatalogSource] = js.undefined
  
  /**
    * Specifies a transform that renames a single data property key.
    */
  var RenameField: js.UndefOr[typings.awsSdk.glueMod.RenameField] = js.undefined
  
  /**
    * Specifies an Amazon S3 data store in the Glue Data Catalog.
    */
  var S3CatalogSource: js.UndefOr[typings.awsSdk.glueMod.S3CatalogSource] = js.undefined
  
  /**
    * Specifies a data target that writes to Amazon S3 using the Glue Data Catalog.
    */
  var S3CatalogTarget: js.UndefOr[typings.awsSdk.glueMod.S3CatalogTarget] = js.undefined
  
  /**
    * Specifies a command-separated value (CSV) data store stored in Amazon S3.
    */
  var S3CsvSource: js.UndefOr[typings.awsSdk.glueMod.S3CsvSource] = js.undefined
  
  /**
    * Specifies a data target that writes to Amazon S3.
    */
  var S3DirectTarget: js.UndefOr[typings.awsSdk.glueMod.S3DirectTarget] = js.undefined
  
  /**
    * Specifies a data target that writes to Amazon S3 in Apache Parquet columnar storage.
    */
  var S3GlueParquetTarget: js.UndefOr[typings.awsSdk.glueMod.S3GlueParquetTarget] = js.undefined
  
  /**
    * Specifies a JSON data store stored in Amazon S3.
    */
  var S3JsonSource: js.UndefOr[typings.awsSdk.glueMod.S3JsonSource] = js.undefined
  
  /**
    * Specifies an Apache Parquet data store stored in Amazon S3.
    */
  var S3ParquetSource: js.UndefOr[typings.awsSdk.glueMod.S3ParquetSource] = js.undefined
  
  /**
    * Specifies a transform that chooses the data property keys that you want to keep.
    */
  var SelectFields: js.UndefOr[typings.awsSdk.glueMod.SelectFields] = js.undefined
  
  /**
    * Specifies a transform that chooses one DynamicFrame from a collection of DynamicFrames. The output is the selected DynamicFrame 
    */
  var SelectFromCollection: js.UndefOr[typings.awsSdk.glueMod.SelectFromCollection] = js.undefined
  
  /**
    * Specifies a connector to an Apache Spark data source.
    */
  var SparkConnectorSource: js.UndefOr[typings.awsSdk.glueMod.SparkConnectorSource] = js.undefined
  
  /**
    * Specifies a target that uses an Apache Spark connector.
    */
  var SparkConnectorTarget: js.UndefOr[typings.awsSdk.glueMod.SparkConnectorTarget] = js.undefined
  
  /**
    * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a single DynamicFrame.
    */
  var SparkSQL: js.UndefOr[typings.awsSdk.glueMod.SparkSQL] = js.undefined
  
  /**
    * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
    */
  var Spigot: js.UndefOr[typings.awsSdk.glueMod.Spigot] = js.undefined
  
  /**
    * Specifies a transform that splits data property keys into two DynamicFrames. The output is a collection of DynamicFrames: one with selected data property keys, and one with the remaining data property keys.
    */
  var SplitFields: js.UndefOr[typings.awsSdk.glueMod.SplitFields] = js.undefined
  
  /**
    * Specifies a transform that combines the rows from two or more datasets into a single result.
    */
  var Union: js.UndefOr[typings.awsSdk.glueMod.Union] = js.undefined
}
object CodeGenConfigurationNode {
  
  inline def apply(): CodeGenConfigurationNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeGenConfigurationNode]
  }
  
  extension [Self <: CodeGenConfigurationNode](x: Self) {
    
    inline def setAggregate(value: Aggregate): Self = StObject.set(x, "Aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "Aggregate", js.undefined)
    
    inline def setApplyMapping(value: ApplyMapping): Self = StObject.set(x, "ApplyMapping", value.asInstanceOf[js.Any])
    
    inline def setApplyMappingUndefined: Self = StObject.set(x, "ApplyMapping", js.undefined)
    
    inline def setAthenaConnectorSource(value: AthenaConnectorSource): Self = StObject.set(x, "AthenaConnectorSource", value.asInstanceOf[js.Any])
    
    inline def setAthenaConnectorSourceUndefined: Self = StObject.set(x, "AthenaConnectorSource", js.undefined)
    
    inline def setCatalogKafkaSource(value: CatalogKafkaSource): Self = StObject.set(x, "CatalogKafkaSource", value.asInstanceOf[js.Any])
    
    inline def setCatalogKafkaSourceUndefined: Self = StObject.set(x, "CatalogKafkaSource", js.undefined)
    
    inline def setCatalogKinesisSource(value: CatalogKinesisSource): Self = StObject.set(x, "CatalogKinesisSource", value.asInstanceOf[js.Any])
    
    inline def setCatalogKinesisSourceUndefined: Self = StObject.set(x, "CatalogKinesisSource", js.undefined)
    
    inline def setCatalogSource(value: CatalogSource): Self = StObject.set(x, "CatalogSource", value.asInstanceOf[js.Any])
    
    inline def setCatalogSourceUndefined: Self = StObject.set(x, "CatalogSource", js.undefined)
    
    inline def setCatalogTarget(value: BasicCatalogTarget): Self = StObject.set(x, "CatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setCatalogTargetUndefined: Self = StObject.set(x, "CatalogTarget", js.undefined)
    
    inline def setCustomCode(value: CustomCode): Self = StObject.set(x, "CustomCode", value.asInstanceOf[js.Any])
    
    inline def setCustomCodeUndefined: Self = StObject.set(x, "CustomCode", js.undefined)
    
    inline def setDirectKafkaSource(value: DirectKafkaSource): Self = StObject.set(x, "DirectKafkaSource", value.asInstanceOf[js.Any])
    
    inline def setDirectKafkaSourceUndefined: Self = StObject.set(x, "DirectKafkaSource", js.undefined)
    
    inline def setDirectKinesisSource(value: DirectKinesisSource): Self = StObject.set(x, "DirectKinesisSource", value.asInstanceOf[js.Any])
    
    inline def setDirectKinesisSourceUndefined: Self = StObject.set(x, "DirectKinesisSource", js.undefined)
    
    inline def setDropDuplicates(value: DropDuplicates): Self = StObject.set(x, "DropDuplicates", value.asInstanceOf[js.Any])
    
    inline def setDropDuplicatesUndefined: Self = StObject.set(x, "DropDuplicates", js.undefined)
    
    inline def setDropFields(value: DropFields): Self = StObject.set(x, "DropFields", value.asInstanceOf[js.Any])
    
    inline def setDropFieldsUndefined: Self = StObject.set(x, "DropFields", js.undefined)
    
    inline def setDropNullFields(value: DropNullFields): Self = StObject.set(x, "DropNullFields", value.asInstanceOf[js.Any])
    
    inline def setDropNullFieldsUndefined: Self = StObject.set(x, "DropNullFields", js.undefined)
    
    inline def setDynamoDBCatalogSource(value: DynamoDBCatalogSource): Self = StObject.set(x, "DynamoDBCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBCatalogSourceUndefined: Self = StObject.set(x, "DynamoDBCatalogSource", js.undefined)
    
    inline def setFillMissingValues(value: FillMissingValues): Self = StObject.set(x, "FillMissingValues", value.asInstanceOf[js.Any])
    
    inline def setFillMissingValuesUndefined: Self = StObject.set(x, "FillMissingValues", js.undefined)
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGovernedCatalogSource(value: GovernedCatalogSource): Self = StObject.set(x, "GovernedCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setGovernedCatalogSourceUndefined: Self = StObject.set(x, "GovernedCatalogSource", js.undefined)
    
    inline def setGovernedCatalogTarget(value: GovernedCatalogTarget): Self = StObject.set(x, "GovernedCatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setGovernedCatalogTargetUndefined: Self = StObject.set(x, "GovernedCatalogTarget", js.undefined)
    
    inline def setJDBCConnectorSource(value: JDBCConnectorSource): Self = StObject.set(x, "JDBCConnectorSource", value.asInstanceOf[js.Any])
    
    inline def setJDBCConnectorSourceUndefined: Self = StObject.set(x, "JDBCConnectorSource", js.undefined)
    
    inline def setJDBCConnectorTarget(value: JDBCConnectorTarget): Self = StObject.set(x, "JDBCConnectorTarget", value.asInstanceOf[js.Any])
    
    inline def setJDBCConnectorTargetUndefined: Self = StObject.set(x, "JDBCConnectorTarget", js.undefined)
    
    inline def setJoin(value: Join): Self = StObject.set(x, "Join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "Join", js.undefined)
    
    inline def setMerge(value: Merge): Self = StObject.set(x, "Merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "Merge", js.undefined)
    
    inline def setMicrosoftSQLServerCatalogSource(value: MicrosoftSQLServerCatalogSource): Self = StObject.set(x, "MicrosoftSQLServerCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftSQLServerCatalogSourceUndefined: Self = StObject.set(x, "MicrosoftSQLServerCatalogSource", js.undefined)
    
    inline def setMicrosoftSQLServerCatalogTarget(value: MicrosoftSQLServerCatalogTarget): Self = StObject.set(x, "MicrosoftSQLServerCatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftSQLServerCatalogTargetUndefined: Self = StObject.set(x, "MicrosoftSQLServerCatalogTarget", js.undefined)
    
    inline def setMySQLCatalogSource(value: MySQLCatalogSource): Self = StObject.set(x, "MySQLCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setMySQLCatalogSourceUndefined: Self = StObject.set(x, "MySQLCatalogSource", js.undefined)
    
    inline def setMySQLCatalogTarget(value: MySQLCatalogTarget): Self = StObject.set(x, "MySQLCatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setMySQLCatalogTargetUndefined: Self = StObject.set(x, "MySQLCatalogTarget", js.undefined)
    
    inline def setOracleSQLCatalogSource(value: OracleSQLCatalogSource): Self = StObject.set(x, "OracleSQLCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setOracleSQLCatalogSourceUndefined: Self = StObject.set(x, "OracleSQLCatalogSource", js.undefined)
    
    inline def setOracleSQLCatalogTarget(value: OracleSQLCatalogTarget): Self = StObject.set(x, "OracleSQLCatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setOracleSQLCatalogTargetUndefined: Self = StObject.set(x, "OracleSQLCatalogTarget", js.undefined)
    
    inline def setPIIDetection(value: PIIDetection): Self = StObject.set(x, "PIIDetection", value.asInstanceOf[js.Any])
    
    inline def setPIIDetectionUndefined: Self = StObject.set(x, "PIIDetection", js.undefined)
    
    inline def setPostgreSQLCatalogSource(value: PostgreSQLCatalogSource): Self = StObject.set(x, "PostgreSQLCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setPostgreSQLCatalogSourceUndefined: Self = StObject.set(x, "PostgreSQLCatalogSource", js.undefined)
    
    inline def setPostgreSQLCatalogTarget(value: PostgreSQLCatalogTarget): Self = StObject.set(x, "PostgreSQLCatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setPostgreSQLCatalogTargetUndefined: Self = StObject.set(x, "PostgreSQLCatalogTarget", js.undefined)
    
    inline def setRedshiftSource(value: RedshiftSource): Self = StObject.set(x, "RedshiftSource", value.asInstanceOf[js.Any])
    
    inline def setRedshiftSourceUndefined: Self = StObject.set(x, "RedshiftSource", js.undefined)
    
    inline def setRedshiftTarget(value: RedshiftTarget): Self = StObject.set(x, "RedshiftTarget", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTargetUndefined: Self = StObject.set(x, "RedshiftTarget", js.undefined)
    
    inline def setRelationalCatalogSource(value: RelationalCatalogSource): Self = StObject.set(x, "RelationalCatalogSource", value.asInstanceOf[js.Any])
    
    inline def setRelationalCatalogSourceUndefined: Self = StObject.set(x, "RelationalCatalogSource", js.undefined)
    
    inline def setRenameField(value: RenameField): Self = StObject.set(x, "RenameField", value.asInstanceOf[js.Any])
    
    inline def setRenameFieldUndefined: Self = StObject.set(x, "RenameField", js.undefined)
    
    inline def setS3CatalogSource(value: S3CatalogSource): Self = StObject.set(x, "S3CatalogSource", value.asInstanceOf[js.Any])
    
    inline def setS3CatalogSourceUndefined: Self = StObject.set(x, "S3CatalogSource", js.undefined)
    
    inline def setS3CatalogTarget(value: S3CatalogTarget): Self = StObject.set(x, "S3CatalogTarget", value.asInstanceOf[js.Any])
    
    inline def setS3CatalogTargetUndefined: Self = StObject.set(x, "S3CatalogTarget", js.undefined)
    
    inline def setS3CsvSource(value: S3CsvSource): Self = StObject.set(x, "S3CsvSource", value.asInstanceOf[js.Any])
    
    inline def setS3CsvSourceUndefined: Self = StObject.set(x, "S3CsvSource", js.undefined)
    
    inline def setS3DirectTarget(value: S3DirectTarget): Self = StObject.set(x, "S3DirectTarget", value.asInstanceOf[js.Any])
    
    inline def setS3DirectTargetUndefined: Self = StObject.set(x, "S3DirectTarget", js.undefined)
    
    inline def setS3GlueParquetTarget(value: S3GlueParquetTarget): Self = StObject.set(x, "S3GlueParquetTarget", value.asInstanceOf[js.Any])
    
    inline def setS3GlueParquetTargetUndefined: Self = StObject.set(x, "S3GlueParquetTarget", js.undefined)
    
    inline def setS3JsonSource(value: S3JsonSource): Self = StObject.set(x, "S3JsonSource", value.asInstanceOf[js.Any])
    
    inline def setS3JsonSourceUndefined: Self = StObject.set(x, "S3JsonSource", js.undefined)
    
    inline def setS3ParquetSource(value: S3ParquetSource): Self = StObject.set(x, "S3ParquetSource", value.asInstanceOf[js.Any])
    
    inline def setS3ParquetSourceUndefined: Self = StObject.set(x, "S3ParquetSource", js.undefined)
    
    inline def setSelectFields(value: SelectFields): Self = StObject.set(x, "SelectFields", value.asInstanceOf[js.Any])
    
    inline def setSelectFieldsUndefined: Self = StObject.set(x, "SelectFields", js.undefined)
    
    inline def setSelectFromCollection(value: SelectFromCollection): Self = StObject.set(x, "SelectFromCollection", value.asInstanceOf[js.Any])
    
    inline def setSelectFromCollectionUndefined: Self = StObject.set(x, "SelectFromCollection", js.undefined)
    
    inline def setSparkConnectorSource(value: SparkConnectorSource): Self = StObject.set(x, "SparkConnectorSource", value.asInstanceOf[js.Any])
    
    inline def setSparkConnectorSourceUndefined: Self = StObject.set(x, "SparkConnectorSource", js.undefined)
    
    inline def setSparkConnectorTarget(value: SparkConnectorTarget): Self = StObject.set(x, "SparkConnectorTarget", value.asInstanceOf[js.Any])
    
    inline def setSparkConnectorTargetUndefined: Self = StObject.set(x, "SparkConnectorTarget", js.undefined)
    
    inline def setSparkSQL(value: SparkSQL): Self = StObject.set(x, "SparkSQL", value.asInstanceOf[js.Any])
    
    inline def setSparkSQLUndefined: Self = StObject.set(x, "SparkSQL", js.undefined)
    
    inline def setSpigot(value: Spigot): Self = StObject.set(x, "Spigot", value.asInstanceOf[js.Any])
    
    inline def setSpigotUndefined: Self = StObject.set(x, "Spigot", js.undefined)
    
    inline def setSplitFields(value: SplitFields): Self = StObject.set(x, "SplitFields", value.asInstanceOf[js.Any])
    
    inline def setSplitFieldsUndefined: Self = StObject.set(x, "SplitFields", js.undefined)
    
    inline def setUnion(value: Union): Self = StObject.set(x, "Union", value.asInstanceOf[js.Any])
    
    inline def setUnionUndefined: Self = StObject.set(x, "Union", js.undefined)
  }
}
