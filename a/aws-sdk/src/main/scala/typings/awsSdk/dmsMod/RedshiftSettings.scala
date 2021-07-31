package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftSettings extends StObject {
  
  /**
    * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be loaded without generating an error. You can choose true or false (the default). This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a NULL value into that field. 
    */
  var AcceptAnyDate: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing the code.
    */
  var AfterConnectScript: js.UndefOr[String] = js.undefined
  
  /**
    * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift cluster.  For full load mode, AWS DMS converts source records into .csv files and loads them to the BucketFolder/TableID path. AWS DMS uses the Redshift COPY command to upload the .csv files to the target table. The files are deleted once the COPY operation has finished. For more information, see Amazon Redshift Database Developer Guide  For change-data-capture (CDC) mode, AWS DMS creates a NetChanges table, and loads the .csv files to this BucketFolder/NetChangesTableID path.
    */
  var BucketFolder: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * If Amazon Redshift is configured to support case sensitive schema names, set CaseSensitiveNames to true. The default is false.
    */
  var CaseSensitiveNames: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * If you set CompUpdate to true Amazon Redshift applies automatic compression if the table is empty. This applies even if the table columns already have encodings other than RAW. If you set CompUpdate to false, automatic compression is disabled and existing column encodings aren't changed. The default is true.
    */
  var CompUpdate: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you initially establish a connection.
    */
  var ConnectionTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the Amazon Redshift data warehouse (service) that you are working with.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The date format that you are using. Valid values are auto (case-sensitive), your date format string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using auto recognizes most strings, even some that aren't supported when you use a date format string.  If your date and time values use formats different from each other, set this to auto. 
    */
  var DateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of true sets empty CHAR and VARCHAR fields to null. The default is false.
    */
  var EmptyAsNull: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS.   For the ModifyEndpoint operation, you can change the existing value of the EncryptionMode parameter from SSE_KMS to SSE_S3. But you can’t change the existing value from SSE_S3 to SSE_KMS.  To use SSE_S3, create an AWS Identity and Access Management (IAM) role with a policy that allows "arn:aws:s3:::*" to use the following actions: "s3:PutObject", "s3:ListBucket" 
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined
  
  /**
    * This setting is only valid for a full-load migration task. Set ExplicitIds to true to have tables with IDENTITY columns override their auto-generated values with explicit values loaded from the source data files used to populate the tables. The default is false.
    */
  var ExplicitIds: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults to 10. The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For more information, see Multipart upload overview.   FileTransferUploadStreams accepts a value from 1 through 64. It defaults to 10.
    */
  var FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
    */
  var LoadTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift. It defaults to 1048576KB (1 GB).
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The password for the user named in the username property.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * The port number for Amazon Redshift. The default value is 5439.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters within the quotation marks, including delimiters, are retained. Choose true to remove quotation marks. The default is false.
    */
  var RemoveQuotes: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that specifies to replaces the invalid characters specified in ReplaceInvalidChars, substituting the specified characters instead. The default is "?".
    */
  var ReplaceChars: js.UndefOr[String] = js.undefined
  
  /**
    * A list of characters that you want to replace. Use with ReplaceChars.
    */
  var ReplaceInvalidChars: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon Redshift cluster you are using.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS KMS key ID. If you are using SSE_KMS for the EncryptionMode, provide this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The time format that you want to use. Valid values are auto (case-sensitive), 'timeformat_string', 'epochsecs', or 'epochmillisecs'. It defaults to 10. Using auto recognizes most strings, even some that aren't supported when you use a time format string.  If your date and time values use formats different from each other, set this parameter to auto. 
    */
  var TimeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter applies only to columns with a VARCHAR data type. Choose true to remove unneeded white space. The default is false.
    */
  var TrimBlanks: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4 MB or less. Choose true to truncate data. The default is false.
    */
  var TruncateColumns: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An Amazon Redshift user name for a registered user.
    */
  var Username: js.UndefOr[String] = js.undefined
  
  /**
    * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
    */
  var WriteBufferSize: js.UndefOr[IntegerOptional] = js.undefined
}
object RedshiftSettings {
  
  @scala.inline
  def apply(): RedshiftSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftSettings]
  }
  
  @scala.inline
  implicit class RedshiftSettingsMutableBuilder[Self <: RedshiftSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptAnyDate(value: BooleanOptional): Self = StObject.set(x, "AcceptAnyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptAnyDateUndefined: Self = StObject.set(x, "AcceptAnyDate", js.undefined)
    
    @scala.inline
    def setAfterConnectScript(value: String): Self = StObject.set(x, "AfterConnectScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterConnectScriptUndefined: Self = StObject.set(x, "AfterConnectScript", js.undefined)
    
    @scala.inline
    def setBucketFolder(value: String): Self = StObject.set(x, "BucketFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketFolderUndefined: Self = StObject.set(x, "BucketFolder", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    @scala.inline
    def setCaseSensitiveNames(value: BooleanOptional): Self = StObject.set(x, "CaseSensitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveNamesUndefined: Self = StObject.set(x, "CaseSensitiveNames", js.undefined)
    
    @scala.inline
    def setCompUpdate(value: BooleanOptional): Self = StObject.set(x, "CompUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompUpdateUndefined: Self = StObject.set(x, "CompUpdate", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: IntegerOptional): Self = StObject.set(x, "ConnectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "ConnectionTimeout", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "DateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "DateFormat", js.undefined)
    
    @scala.inline
    def setEmptyAsNull(value: BooleanOptional): Self = StObject.set(x, "EmptyAsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyAsNullUndefined: Self = StObject.set(x, "EmptyAsNull", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionModeValue): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    @scala.inline
    def setExplicitIds(value: BooleanOptional): Self = StObject.set(x, "ExplicitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitIdsUndefined: Self = StObject.set(x, "ExplicitIds", js.undefined)
    
    @scala.inline
    def setFileTransferUploadStreams(value: IntegerOptional): Self = StObject.set(x, "FileTransferUploadStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTransferUploadStreamsUndefined: Self = StObject.set(x, "FileTransferUploadStreams", js.undefined)
    
    @scala.inline
    def setLoadTimeout(value: IntegerOptional): Self = StObject.set(x, "LoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTimeoutUndefined: Self = StObject.set(x, "LoadTimeout", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setRemoveQuotes(value: BooleanOptional): Self = StObject.set(x, "RemoveQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveQuotesUndefined: Self = StObject.set(x, "RemoveQuotes", js.undefined)
    
    @scala.inline
    def setReplaceChars(value: String): Self = StObject.set(x, "ReplaceChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceCharsUndefined: Self = StObject.set(x, "ReplaceChars", js.undefined)
    
    @scala.inline
    def setReplaceInvalidChars(value: String): Self = StObject.set(x, "ReplaceInvalidChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceInvalidCharsUndefined: Self = StObject.set(x, "ReplaceInvalidChars", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionKmsKeyId(value: String): Self = StObject.set(x, "ServerSideEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = StObject.set(x, "TimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatUndefined: Self = StObject.set(x, "TimeFormat", js.undefined)
    
    @scala.inline
    def setTrimBlanks(value: BooleanOptional): Self = StObject.set(x, "TrimBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimBlanksUndefined: Self = StObject.set(x, "TrimBlanks", js.undefined)
    
    @scala.inline
    def setTruncateColumns(value: BooleanOptional): Self = StObject.set(x, "TruncateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateColumnsUndefined: Self = StObject.set(x, "TruncateColumns", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
    
    @scala.inline
    def setWriteBufferSize(value: IntegerOptional): Self = StObject.set(x, "WriteBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteBufferSizeUndefined: Self = StObject.set(x, "WriteBufferSize", js.undefined)
  }
}
