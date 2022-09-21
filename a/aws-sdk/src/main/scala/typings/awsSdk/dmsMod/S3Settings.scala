package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Settings extends StObject {
  
  /**
    * An optional parameter that, when set to true or y, you can use to add column name information to the .csv output file. The default value is false. Valid values are true, false, y, and n.
    */
  var AddColumnName: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Use the S3 target endpoint setting AddTrailingPaddingCharacter to add padding on string data. The default value is false.
    */
  var AddTrailingPaddingCharacter: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path  bucketFolder/schema_name/table_name/. If this parameter isn't specified, then the path used is  schema_name/table_name/. 
    */
  var BucketFolder: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the S3 bucket. 
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that enables DMS to specify a predefined (canned) access control list for objects created in an Amazon S3 bucket as .csv or .parquet files. For more information about Amazon S3 canned ACLs, see Canned ACL in the Amazon S3 Developer Guide.  The default value is NONE. Valid values include NONE, PRIVATE, PUBLIC_READ, PUBLIC_READ_WRITE, AUTHENTICATED_READ, AWS_EXEC_READ, BUCKET_OWNER_READ, and BUCKET_OWNER_FULL_CONTROL.
    */
  var CannedAclForObjects: js.UndefOr[CannedAclForObjectsValue] = js.undefined
  
  /**
    * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default setting is false, but when CdcInsertsAndUpdates is set to true or y, only INSERTs and UPDATEs from the source database are migrated to the .csv or .parquet file.  For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the IncludeOpForFullLoad parameter. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to either I or U to indicate INSERT and UPDATE operations at the source. But if IncludeOpForFullLoad is set to false, CDC records are written without an indication of INSERT or UPDATE operations at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the Database Migration Service User Guide..  DMS supports the use of the CdcInsertsAndUpdates parameter in versions 3.3.1 and later.  CdcInsertsOnly and CdcInsertsAndUpdates can't both be set to true for the same endpoint. Set either CdcInsertsOnly or CdcInsertsAndUpdates to true for the same endpoint, but not both. 
    */
  var CdcInsertsAndUpdates: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage (.parquet) output files. By default (the false setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or deleted at the source database for a CDC load to the target. If CdcInsertsOnly is set to true or y, only INSERTs from the source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends on the value of IncludeOpForFullLoad. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to I to indicate the INSERT operation at the source. If IncludeOpForFullLoad is set to false, every CDC record is written without a first field to indicate the INSERT operation at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the Database Migration Service User Guide..  DMS supports the interaction described preceding between the CdcInsertsOnly and IncludeOpForFullLoad parameters in versions 3.1.4 and later.   CdcInsertsOnly and CdcInsertsAndUpdates can't both be set to true for the same endpoint. Set either CdcInsertsOnly or CdcInsertsAndUpdates to true for the same endpoint, but not both. 
    */
  var CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Maximum length of the interval, defined in seconds, after which to output a file to Amazon S3. When CdcMaxBatchInterval and CdcMinFileSize are both specified, the file write is triggered by whichever parameter condition is met first within an DMS CloudFormation template. The default value is 60 seconds.
    */
  var CdcMaxBatchInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum file size, defined in megabytes, to reach for a file output to Amazon S3. When CdcMinFileSize and CdcMaxBatchInterval are both specified, the file write is triggered by whichever parameter condition is met first within an DMS CloudFormation template. The default value is 32 MB.
    */
  var CdcMinFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures change data; otherwise, it's optional. If CdcPath is set, DMS reads CDC files from this path and replicates the data changes to the target endpoint. For an S3 target if you set  PreserveTransactions  to true, DMS verifies that you have set this parameter to a folder path on your S3 target where DMS can save the transaction order for the CDC load. DMS creates this CDC folder path in either your S3 target working directory or the S3 target location specified by  BucketFolder  and  BucketName . For example, if you specify CdcPath as MyChangedData, and you specify BucketName as MyTargetBucket but do not specify BucketFolder, DMS creates the CDC folder path following: MyTargetBucket/MyChangedData. If you specify the same CdcPath, and you specify BucketName as MyTargetBucket and BucketFolder as MyTargetData, DMS creates the CDC folder path following: MyTargetBucket/MyTargetData/MyChangedData. For more information on CDC including transaction order on an S3 target, see Capturing data changes (CDC) including transaction order on the S3 target.  This setting is supported in DMS versions 3.4.2 and later. 
    */
  var CdcPath: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies to both .csv and .parquet file formats. 
    */
  var CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined
  
  /**
    *  The delimiter used to separate columns in the .csv file for both source and target. The default is a comma. 
    */
  var CsvDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are written in .csv format. If  UseCsvNoSupValue  is set to true, specify a string value that you want DMS to use for all columns not included in the supplemental log. If you do not specify a string value, DMS uses the null value for these columns regardless of the UseCsvNoSupValue setting.  This setting is supported in DMS versions 3.4.1 and later. 
    */
  var CsvNoSupValue: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter that specifies how DMS treats null values. While handling the null value, you can use this parameter to pass a user-defined string as null when writing to the target. For example, when target columns are not nullable, you can use this option to differentiate between the empty string value and the null value. So, if you set this parameter value to the empty string ("" or ''), DMS treats the empty string as the null value instead of NULL. The default value is NULL. Valid values include any valid string.
    */
  var CsvNullValue: js.UndefOr[String] = js.undefined
  
  /**
    *  The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage return (\n). 
    */
  var CsvRowDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the data that you want to use for output. You can choose one of the following:     csv : This is a row-based file format with comma-separated values (.csv).     parquet : Apache Parquet (.parquet) is a columnar storage file format that features efficient compression and provides faster query response.   
    */
  var DataFormat: js.UndefOr[DataFormatValue] = js.undefined
  
  /**
    * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file format only. 
    */
  var DataPageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies a date separating delimiter to use during folder partitioning. The default value is SLASH. Use this parameter when DatePartitionedEnabled is set to true.
    */
  var DatePartitionDelimiter: js.UndefOr[DatePartitionDelimiterValue] = js.undefined
  
  /**
    * When set to true, this parameter partitions S3 bucket folders based on transaction commit dates. The default value is false. For more information about date-based folder partitioning, see Using date-based folder partitioning.
    */
  var DatePartitionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Identifies the sequence of the date format to use during folder partitioning. The default value is YYYYMMDD. Use this parameter when DatePartitionedEnabled is set to true.
    */
  var DatePartitionSequence: js.UndefOr[DatePartitionSequenceValue] = js.undefined
  
  /**
    * When creating an S3 target endpoint, set DatePartitionTimezone to convert the current UTC time into a specified time zone. The conversion occurs when a date partition folder is created and a CDC filename is generated. The time zone format is Area/Location. Use this parameter when DatePartitionedEnabled is set to true, as shown in the following example.  s3-settings='{"DatePartitionEnabled": true, "DatePartitionSequence": "YYYYMMDDHH", "DatePartitionDelimiter": "SLASH", "DatePartitionTimezone":"Asia/Seoul", "BucketName": "dms-nattarat-test"}' 
    */
  var DatePartitionTimezone: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is stored using an encoding type of PLAIN. This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page before it reverts to PLAIN encoding. This size is used for .parquet file format only. 
    */
  var DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that enables statistics for Parquet pages and row groups. Choose true to enable statistics, false to disable. Statistics include NULL, DISTINCT, MAX, and MIN values. This parameter defaults to true. This value is used for .parquet file format only.
    */
  var EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The type of encoding you are using:     RLE_DICTIONARY uses a combination of bit-packing and run-length encoding to store repeated values more efficiently. This is the default.    PLAIN doesn't use encoding at all. Values are stored as they are.    PLAIN_DICTIONARY builds a dictionary of the values encountered in a given column. The dictionary is stored in a dictionary page for each column chunk.  
    */
  var EncodingType: js.UndefOr[EncodingTypeValue] = js.undefined
  
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS.   For the ModifyEndpoint operation, you can change the existing value of the EncryptionMode parameter from SSE_KMS to SSE_S3. But you can’t change the existing value from SSE_S3 to SSE_KMS.  To use SSE_S3, you need an Identity and Access Management (IAM) role with permission to allow "arn:aws:s3:::dms-*" to use the following actions:    s3:CreateBucket     s3:ListBucket     s3:DeleteBucket     s3:GetBucketLocation     s3:GetObject     s3:PutObject     s3:DeleteObject     s3:GetObjectVersion     s3:GetBucketPolicy     s3:PutBucketPolicy     s3:DeleteBucketPolicy   
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined
  
  /**
    * To specify a bucket owner and prevent sniping, you can use the ExpectedBucketOwner endpoint setting.  Example: --s3-settings='{"ExpectedBucketOwner": "AWS_Account_ID"}'  When you make a request to test a connection or perform a migration, S3 checks the account ID of the bucket owner against the specified parameter.
    */
  var ExpectedBucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies how tables are defined in the S3 source files only. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * When this value is set to 1, DMS ignores the first row header in a .csv file. A value of 1 turns on the feature; a value of 0 turns off the feature. The default is 0.
    */
  var IgnoreHeaderRows: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only to indicate how the rows were added to the source database.  DMS supports the IncludeOpForFullLoad parameter in versions 3.1.4 and later.  For full load, records can only be inserted. By default (the false setting), no information is recorded in these output files for a full load to indicate that the rows were inserted at the source database. If IncludeOpForFullLoad is set to true or y, the INSERT is recorded as an I annotation in the first field of the .csv file. This allows the format of your target records from a full load to be consistent with the target records from a CDC load.  This setting works together with the CdcInsertsOnly and the CdcInsertsAndUpdates parameters for output to .csv files only. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the Database Migration Service User Guide.. 
    */
  var IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that specifies the maximum size (in KB) of any .csv file to be created while migrating to an S3 target during full load. The default value is 1,048,576 KB (1 GB). Valid values include 1 to 1,048,576.
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that specifies the precision of any TIMESTAMP column values that are written to an Amazon S3 object file in .parquet format.  DMS supports the ParquetTimestampInMillisecond parameter in versions 3.1.4 and later.  When ParquetTimestampInMillisecond is set to true or y, DMS writes all TIMESTAMP columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes them with microsecond precision. Currently, Amazon Athena and Glue can handle only millisecond precision for TIMESTAMP values. Set this parameter to true for S3 endpoint object files that are .parquet formatted only if you plan to query or process the data with Athena or Glue.  DMS writes any TIMESTAMP column values written to an S3 file in .csv format with microsecond precision. Setting ParquetTimestampInMillisecond has no effect on the string format of the timestamp column value that is inserted by setting the TimestampColumnName parameter. 
    */
  var ParquetTimestampInMillisecond: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The version of the Apache Parquet format that you want to use: parquet_1_0 (the default) or parquet_2_0.
    */
  var ParquetVersion: js.UndefOr[ParquetVersionValue] = js.undefined
  
  /**
    * If set to true, DMS saves the transaction order for a change data capture (CDC) load on the Amazon S3 target specified by  CdcPath . For more information, see Capturing data changes (CDC) including transaction order on the S3 target.  This setting is supported in DMS versions 3.4.2 and later. 
    */
  var PreserveTransactions: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * For an S3 source, when this value is set to true or y, each leading double quotation mark has to be followed by an ending double quotation mark. This formatting complies with RFC 4180. When this value is set to false or n, string literals are copied to the target as is. In this case, a delimiter (row or column) signals the end of the field. Thus, you can't use a delimiter as part of the string, because it signals the end of the value. For an S3 target, an optional parameter used to set behavior to comply with RFC 4180 for data migrated to Amazon S3 using .csv file format only. When this value is set to true or y using Amazon S3 as a target, if the data has quotation marks or newline characters in it, DMS encloses the entire column with an additional pair of double quotation marks ("). Every quotation mark within the data is repeated twice. The default value is true. Valid values include true, false, y, and n.
    */
  var Rfc4180: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet file format only.  If you choose a value larger than the maximum, RowGroupLength is set to the max row group length in bytes (64 * 1024 * 1024). 
    */
  var RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If you are using SSE_KMS for the EncryptionMode, provide the KMS key ID. The key that you use needs an attached policy that enables Identity and Access Management (IAM) user permissions and allows use of the key. Here is a CLI example: aws dms create-endpoint --endpoint-identifier value --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=value,BucketFolder=value,BucketName=value,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=value  
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) used by the service to access the IAM role. The role must allow the iam:PassRole action. It is a required parameter that enables DMS to write and read objects from an S3 bucket.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A value that when nonblank causes DMS to add a column with timestamp information to the endpoint data for an Amazon S3 target.  DMS supports the TimestampColumnName parameter in versions 3.1.4 and later.  DMS includes an additional STRING column in the .csv or .parquet object files of your migrated data when you set TimestampColumnName to a nonblank value. For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from the source to the target by DMS.  For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of that row in the source database. The string format for this timestamp column value is yyyy-MM-dd HH:mm:ss.SSSSSS. By default, the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit timestamp supported by DMS for the source database. When the AddColumnName parameter is set to true, DMS also includes a name for the timestamp column that you set with TimestampColumnName.
    */
  var TimestampColumnName: js.UndefOr[String] = js.undefined
  
  /**
    * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format. If set to true for columns not included in the supplemental log, DMS uses the value specified by  CsvNoSupValue . If not set or set to false, DMS uses the null value for these columns.  This setting is supported in DMS versions 3.4.1 and later. 
    */
  var UseCsvNoSupValue: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When set to true, this parameter uses the task start time as the timestamp column value instead of the time data is written to target. For full load, when useTaskStartTimeForFullLoadTimestamp is set to true, each row of the timestamp column contains the task start time. For CDC loads, each row of the timestamp column contains the transaction commit time. When useTaskStartTimeForFullLoadTimestamp is set to false, the full load timestamp in the timestamp column increments with the time data arrives at the target. 
    */
  var UseTaskStartTimeForFullLoadTimestamp: js.UndefOr[BooleanOptional] = js.undefined
}
object S3Settings {
  
  inline def apply(): S3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Settings]
  }
  
  extension [Self <: S3Settings](x: Self) {
    
    inline def setAddColumnName(value: BooleanOptional): Self = StObject.set(x, "AddColumnName", value.asInstanceOf[js.Any])
    
    inline def setAddColumnNameUndefined: Self = StObject.set(x, "AddColumnName", js.undefined)
    
    inline def setAddTrailingPaddingCharacter(value: BooleanOptional): Self = StObject.set(x, "AddTrailingPaddingCharacter", value.asInstanceOf[js.Any])
    
    inline def setAddTrailingPaddingCharacterUndefined: Self = StObject.set(x, "AddTrailingPaddingCharacter", js.undefined)
    
    inline def setBucketFolder(value: String): Self = StObject.set(x, "BucketFolder", value.asInstanceOf[js.Any])
    
    inline def setBucketFolderUndefined: Self = StObject.set(x, "BucketFolder", js.undefined)
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setCannedAclForObjects(value: CannedAclForObjectsValue): Self = StObject.set(x, "CannedAclForObjects", value.asInstanceOf[js.Any])
    
    inline def setCannedAclForObjectsUndefined: Self = StObject.set(x, "CannedAclForObjects", js.undefined)
    
    inline def setCdcInsertsAndUpdates(value: BooleanOptional): Self = StObject.set(x, "CdcInsertsAndUpdates", value.asInstanceOf[js.Any])
    
    inline def setCdcInsertsAndUpdatesUndefined: Self = StObject.set(x, "CdcInsertsAndUpdates", js.undefined)
    
    inline def setCdcInsertsOnly(value: BooleanOptional): Self = StObject.set(x, "CdcInsertsOnly", value.asInstanceOf[js.Any])
    
    inline def setCdcInsertsOnlyUndefined: Self = StObject.set(x, "CdcInsertsOnly", js.undefined)
    
    inline def setCdcMaxBatchInterval(value: IntegerOptional): Self = StObject.set(x, "CdcMaxBatchInterval", value.asInstanceOf[js.Any])
    
    inline def setCdcMaxBatchIntervalUndefined: Self = StObject.set(x, "CdcMaxBatchInterval", js.undefined)
    
    inline def setCdcMinFileSize(value: IntegerOptional): Self = StObject.set(x, "CdcMinFileSize", value.asInstanceOf[js.Any])
    
    inline def setCdcMinFileSizeUndefined: Self = StObject.set(x, "CdcMinFileSize", js.undefined)
    
    inline def setCdcPath(value: String): Self = StObject.set(x, "CdcPath", value.asInstanceOf[js.Any])
    
    inline def setCdcPathUndefined: Self = StObject.set(x, "CdcPath", js.undefined)
    
    inline def setCompressionType(value: CompressionTypeValue): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setCsvDelimiter(value: String): Self = StObject.set(x, "CsvDelimiter", value.asInstanceOf[js.Any])
    
    inline def setCsvDelimiterUndefined: Self = StObject.set(x, "CsvDelimiter", js.undefined)
    
    inline def setCsvNoSupValue(value: String): Self = StObject.set(x, "CsvNoSupValue", value.asInstanceOf[js.Any])
    
    inline def setCsvNoSupValueUndefined: Self = StObject.set(x, "CsvNoSupValue", js.undefined)
    
    inline def setCsvNullValue(value: String): Self = StObject.set(x, "CsvNullValue", value.asInstanceOf[js.Any])
    
    inline def setCsvNullValueUndefined: Self = StObject.set(x, "CsvNullValue", js.undefined)
    
    inline def setCsvRowDelimiter(value: String): Self = StObject.set(x, "CsvRowDelimiter", value.asInstanceOf[js.Any])
    
    inline def setCsvRowDelimiterUndefined: Self = StObject.set(x, "CsvRowDelimiter", js.undefined)
    
    inline def setDataFormat(value: DataFormatValue): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setDataPageSize(value: IntegerOptional): Self = StObject.set(x, "DataPageSize", value.asInstanceOf[js.Any])
    
    inline def setDataPageSizeUndefined: Self = StObject.set(x, "DataPageSize", js.undefined)
    
    inline def setDatePartitionDelimiter(value: DatePartitionDelimiterValue): Self = StObject.set(x, "DatePartitionDelimiter", value.asInstanceOf[js.Any])
    
    inline def setDatePartitionDelimiterUndefined: Self = StObject.set(x, "DatePartitionDelimiter", js.undefined)
    
    inline def setDatePartitionEnabled(value: BooleanOptional): Self = StObject.set(x, "DatePartitionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatePartitionEnabledUndefined: Self = StObject.set(x, "DatePartitionEnabled", js.undefined)
    
    inline def setDatePartitionSequence(value: DatePartitionSequenceValue): Self = StObject.set(x, "DatePartitionSequence", value.asInstanceOf[js.Any])
    
    inline def setDatePartitionSequenceUndefined: Self = StObject.set(x, "DatePartitionSequence", js.undefined)
    
    inline def setDatePartitionTimezone(value: String): Self = StObject.set(x, "DatePartitionTimezone", value.asInstanceOf[js.Any])
    
    inline def setDatePartitionTimezoneUndefined: Self = StObject.set(x, "DatePartitionTimezone", js.undefined)
    
    inline def setDictPageSizeLimit(value: IntegerOptional): Self = StObject.set(x, "DictPageSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setDictPageSizeLimitUndefined: Self = StObject.set(x, "DictPageSizeLimit", js.undefined)
    
    inline def setEnableStatistics(value: BooleanOptional): Self = StObject.set(x, "EnableStatistics", value.asInstanceOf[js.Any])
    
    inline def setEnableStatisticsUndefined: Self = StObject.set(x, "EnableStatistics", js.undefined)
    
    inline def setEncodingType(value: EncodingTypeValue): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionModeValue): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    inline def setExpectedBucketOwner(value: String): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setExternalTableDefinition(value: String): Self = StObject.set(x, "ExternalTableDefinition", value.asInstanceOf[js.Any])
    
    inline def setExternalTableDefinitionUndefined: Self = StObject.set(x, "ExternalTableDefinition", js.undefined)
    
    inline def setIgnoreHeaderRows(value: IntegerOptional): Self = StObject.set(x, "IgnoreHeaderRows", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHeaderRowsUndefined: Self = StObject.set(x, "IgnoreHeaderRows", js.undefined)
    
    inline def setIncludeOpForFullLoad(value: BooleanOptional): Self = StObject.set(x, "IncludeOpForFullLoad", value.asInstanceOf[js.Any])
    
    inline def setIncludeOpForFullLoadUndefined: Self = StObject.set(x, "IncludeOpForFullLoad", js.undefined)
    
    inline def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    inline def setParquetTimestampInMillisecond(value: BooleanOptional): Self = StObject.set(x, "ParquetTimestampInMillisecond", value.asInstanceOf[js.Any])
    
    inline def setParquetTimestampInMillisecondUndefined: Self = StObject.set(x, "ParquetTimestampInMillisecond", js.undefined)
    
    inline def setParquetVersion(value: ParquetVersionValue): Self = StObject.set(x, "ParquetVersion", value.asInstanceOf[js.Any])
    
    inline def setParquetVersionUndefined: Self = StObject.set(x, "ParquetVersion", js.undefined)
    
    inline def setPreserveTransactions(value: BooleanOptional): Self = StObject.set(x, "PreserveTransactions", value.asInstanceOf[js.Any])
    
    inline def setPreserveTransactionsUndefined: Self = StObject.set(x, "PreserveTransactions", js.undefined)
    
    inline def setRfc4180(value: BooleanOptional): Self = StObject.set(x, "Rfc4180", value.asInstanceOf[js.Any])
    
    inline def setRfc4180Undefined: Self = StObject.set(x, "Rfc4180", js.undefined)
    
    inline def setRowGroupLength(value: IntegerOptional): Self = StObject.set(x, "RowGroupLength", value.asInstanceOf[js.Any])
    
    inline def setRowGroupLengthUndefined: Self = StObject.set(x, "RowGroupLength", js.undefined)
    
    inline def setServerSideEncryptionKmsKeyId(value: String): Self = StObject.set(x, "ServerSideEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideEncryptionKmsKeyId", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    inline def setTimestampColumnName(value: String): Self = StObject.set(x, "TimestampColumnName", value.asInstanceOf[js.Any])
    
    inline def setTimestampColumnNameUndefined: Self = StObject.set(x, "TimestampColumnName", js.undefined)
    
    inline def setUseCsvNoSupValue(value: BooleanOptional): Self = StObject.set(x, "UseCsvNoSupValue", value.asInstanceOf[js.Any])
    
    inline def setUseCsvNoSupValueUndefined: Self = StObject.set(x, "UseCsvNoSupValue", js.undefined)
    
    inline def setUseTaskStartTimeForFullLoadTimestamp(value: BooleanOptional): Self = StObject.set(x, "UseTaskStartTimeForFullLoadTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUseTaskStartTimeForFullLoadTimestampUndefined: Self = StObject.set(x, "UseTaskStartTimeForFullLoadTimestamp", js.undefined)
  }
}
