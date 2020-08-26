package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Settings extends js.Object {
  /**
    *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path  bucketFolder/schema_name/table_name/. If this parameter isn't specified, then the path used is  schema_name/table_name/. 
    */
  var BucketFolder: js.UndefOr[String] = js.native
  /**
    *  The name of the S3 bucket. 
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet (columnar storage) output files. The default setting is false, but when CdcInsertsAndUpdates is set to trueor y, INSERTs and UPDATEs from the source database are migrated to the .csv or .parquet file.  For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the IncludeOpForFullLoad parameter. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to either I or U to indicate INSERT and UPDATE operations at the source. But if IncludeOpForFullLoad is set to false, CDC records are written without an indication of INSERT or UPDATE operations at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide..  AWS DMS supports the use of the CdcInsertsAndUpdates parameter in versions 3.3.1 and later.  CdcInsertsOnly and CdcInsertsAndUpdates can't both be set to true for the same endpoint. Set either CdcInsertsOnly or CdcInsertsAndUpdates to true for the same endpoint, but not both. 
    */
  var CdcInsertsAndUpdates: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage (.parquet) output files. By default (the false setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or deleted at the source database for a CDC load to the target. If CdcInsertsOnly is set to true or y, only INSERTs from the source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends on the value of IncludeOpForFullLoad. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to I to indicate the INSERT operation at the source. If IncludeOpForFullLoad is set to false, every CDC record is written without a first field to indicate the INSERT operation at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide..  AWS DMS supports the interaction described preceding between the CdcInsertsOnly and IncludeOpForFullLoad parameters in versions 3.1.4 and later.   CdcInsertsOnly and CdcInsertsAndUpdates can't both be set to true for the same endpoint. Set either CdcInsertsOnly or CdcInsertsAndUpdates to true for the same endpoint, but not both. 
    */
  var CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.native
  /**
    * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies to both .csv and .parquet file formats. 
    */
  var CompressionType: js.UndefOr[CompressionTypeValue] = js.native
  /**
    *  The delimiter used to separate columns in the source files. The default is a comma. 
    */
  var CsvDelimiter: js.UndefOr[String] = js.native
  /**
    *  The delimiter used to separate rows in the source files. The default is a carriage return (\n). 
    */
  var CsvRowDelimiter: js.UndefOr[String] = js.native
  /**
    * The format of the data that you want to use for output. You can choose one of the following:     csv : This is a row-based file format with comma-separated values (.csv).     parquet : Apache Parquet (.parquet) is a columnar storage file format that features efficient compression and provides faster query response.   
    */
  var DataFormat: js.UndefOr[DataFormatValue] = js.native
  /**
    * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file format only. 
    */
  var DataPageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is stored using an encoding type of PLAIN. This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page before it reverts to PLAIN encoding. This size is used for .parquet file format only. 
    */
  var DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that enables statistics for Parquet pages and row groups. Choose true to enable statistics, false to disable. Statistics include NULL, DISTINCT, MAX, and MIN values. This parameter defaults to true. This value is used for .parquet file format only.
    */
  var EnableStatistics: js.UndefOr[BooleanOptional] = js.native
  /**
    * The type of encoding you are using:     RLE_DICTIONARY uses a combination of bit-packing and run-length encoding to store repeated values more efficiently. This is the default.    PLAIN doesn't use encoding at all. Values are stored as they are.    PLAIN_DICTIONARY builds a dictionary of the values encountered in a given column. The dictionary is stored in a dictionary page for each column chunk.  
    */
  var EncodingType: js.UndefOr[EncodingTypeValue] = js.native
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS. To use SSE_S3, you need an AWS Identity and Access Management (IAM) role with permission to allow "arn:aws:s3:::dms-*" to use the following actions:    s3:CreateBucket     s3:ListBucket     s3:DeleteBucket     s3:GetBucketLocation     s3:GetObject     s3:PutObject     s3:DeleteObject     s3:GetObjectVersion     s3:GetBucketPolicy     s3:PutBucketPolicy     s3:DeleteBucketPolicy   
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.native
  /**
    *  The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only to indicate how the rows were added to the source database.  AWS DMS supports the IncludeOpForFullLoad parameter in versions 3.1.4 and later.  For full load, records can only be inserted. By default (the false setting), no information is recorded in these output files for a full load to indicate that the rows were inserted at the source database. If IncludeOpForFullLoad is set to true or y, the INSERT is recorded as an I annotation in the first field of the .csv file. This allows the format of your target records from a full load to be consistent with the target records from a CDC load.  This setting works together with the CdcInsertsOnly and the CdcInsertsAndUpdates parameters for output to .csv files only. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide.. 
    */
  var IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that specifies the precision of any TIMESTAMP column values that are written to an Amazon S3 object file in .parquet format.  AWS DMS supports the ParquetTimestampInMillisecond parameter in versions 3.1.4 and later.  When ParquetTimestampInMillisecond is set to true or y, AWS DMS writes all TIMESTAMP columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes them with microsecond precision. Currently, Amazon Athena and AWS Glue can handle only millisecond precision for TIMESTAMP values. Set this parameter to true for S3 endpoint object files that are .parquet formatted only if you plan to query or process the data with Athena or AWS Glue.  AWS DMS writes any TIMESTAMP column values written to an S3 file in .csv format with microsecond precision. Setting ParquetTimestampInMillisecond has no effect on the string format of the timestamp column value that is inserted by setting the TimestampColumnName parameter. 
    */
  var ParquetTimestampInMillisecond: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version of the Apache Parquet format that you want to use: parquet_1_0 (the default) or parquet_2_0.
    */
  var ParquetVersion: js.UndefOr[ParquetVersionValue] = js.native
  /**
    * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet file format only.  If you choose a value larger than the maximum, RowGroupLength is set to the max row group length in bytes (64 * 1024 * 1024). 
    */
  var RowGroupLength: js.UndefOr[IntegerOptional] = js.native
  /**
    * If you are using SSE_KMS for the EncryptionMode, provide the AWS KMS key ID. The key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and allows use of the key. Here is a CLI example: aws dms create-endpoint --endpoint-identifier value --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=value,BucketFolder=value,BucketName=value,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=value  
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.native
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an Amazon S3 target.  AWS DMS supports the TimestampColumnName parameter in versions 3.1.4 and later.  DMS includes an additional STRING column in the .csv or .parquet object files of your migrated data when you set TimestampColumnName to a nonblank value. For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from the source to the target by DMS.  For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of that row in the source database. The string format for this timestamp column value is yyyy-MM-dd HH:mm:ss.SSSSSS. By default, the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit timestamp supported by DMS for the source database. When the AddColumnName parameter is set to true, DMS also includes a name for the timestamp column that you set with TimestampColumnName.
    */
  var TimestampColumnName: js.UndefOr[String] = js.native
}

object S3Settings {
  @scala.inline
  def apply(): S3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Settings]
  }
  @scala.inline
  implicit class S3SettingsOps[Self <: S3Settings] (val x: Self) extends AnyVal {
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
    def setBucketFolder(value: String): Self = this.set("BucketFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketFolder: Self = this.set("BucketFolder", js.undefined)
    @scala.inline
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    @scala.inline
    def setCdcInsertsAndUpdates(value: BooleanOptional): Self = this.set("CdcInsertsAndUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdcInsertsAndUpdates: Self = this.set("CdcInsertsAndUpdates", js.undefined)
    @scala.inline
    def setCdcInsertsOnly(value: BooleanOptional): Self = this.set("CdcInsertsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdcInsertsOnly: Self = this.set("CdcInsertsOnly", js.undefined)
    @scala.inline
    def setCompressionType(value: CompressionTypeValue): Self = this.set("CompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionType: Self = this.set("CompressionType", js.undefined)
    @scala.inline
    def setCsvDelimiter(value: String): Self = this.set("CsvDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvDelimiter: Self = this.set("CsvDelimiter", js.undefined)
    @scala.inline
    def setCsvRowDelimiter(value: String): Self = this.set("CsvRowDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvRowDelimiter: Self = this.set("CsvRowDelimiter", js.undefined)
    @scala.inline
    def setDataFormat(value: DataFormatValue): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFormat: Self = this.set("DataFormat", js.undefined)
    @scala.inline
    def setDataPageSize(value: IntegerOptional): Self = this.set("DataPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPageSize: Self = this.set("DataPageSize", js.undefined)
    @scala.inline
    def setDictPageSizeLimit(value: IntegerOptional): Self = this.set("DictPageSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictPageSizeLimit: Self = this.set("DictPageSizeLimit", js.undefined)
    @scala.inline
    def setEnableStatistics(value: BooleanOptional): Self = this.set("EnableStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableStatistics: Self = this.set("EnableStatistics", js.undefined)
    @scala.inline
    def setEncodingType(value: EncodingTypeValue): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setEncryptionMode(value: EncryptionModeValue): Self = this.set("EncryptionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionMode: Self = this.set("EncryptionMode", js.undefined)
    @scala.inline
    def setExternalTableDefinition(value: String): Self = this.set("ExternalTableDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalTableDefinition: Self = this.set("ExternalTableDefinition", js.undefined)
    @scala.inline
    def setIncludeOpForFullLoad(value: BooleanOptional): Self = this.set("IncludeOpForFullLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOpForFullLoad: Self = this.set("IncludeOpForFullLoad", js.undefined)
    @scala.inline
    def setParquetTimestampInMillisecond(value: BooleanOptional): Self = this.set("ParquetTimestampInMillisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquetTimestampInMillisecond: Self = this.set("ParquetTimestampInMillisecond", js.undefined)
    @scala.inline
    def setParquetVersion(value: ParquetVersionValue): Self = this.set("ParquetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquetVersion: Self = this.set("ParquetVersion", js.undefined)
    @scala.inline
    def setRowGroupLength(value: IntegerOptional): Self = this.set("RowGroupLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowGroupLength: Self = this.set("RowGroupLength", js.undefined)
    @scala.inline
    def setServerSideEncryptionKmsKeyId(value: String): Self = this.set("ServerSideEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryptionKmsKeyId: Self = this.set("ServerSideEncryptionKmsKeyId", js.undefined)
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
    @scala.inline
    def setTimestampColumnName(value: String): Self = this.set("TimestampColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampColumnName: Self = this.set("TimestampColumnName", js.undefined)
  }
  
}

