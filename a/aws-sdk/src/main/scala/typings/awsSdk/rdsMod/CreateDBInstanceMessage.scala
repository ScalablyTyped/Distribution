package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gibibytes) to allocate for the DB instance. Type: Integer  Amazon Aurora  Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases, though you are only charged for the space that you use in an Aurora cluster volume.  MySQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    MariaDB  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    PostgreSQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    Oracle  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 10 to 3072.    SQL Server  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 20 to 16384.     Provisioned IOPS storage (io1):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 100 to 16384.     Magnetic storage (standard):   Enterprise and Standard editions: Must be an integer from 200 to 1024.   Web and Express editions: Must be an integer from 20 to 1024.    
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the maintenance window. By default, minor engine upgrades are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The Availability Zone (AZ) where the database will be created. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d   Constraint: The AvailabilityZone parameter can't be specified if the DB instance is a Multi-AZ deployment. The specified Availability Zone must be in the same AWS Region as the current endpoint.   If you're creating a DB instance in an RDS on VMware environment, specify the identifier of the custom Availability Zone to create the DB instance in. For more information about RDS on VMware, see the  RDS on VMware User Guide.   
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. Default: 1 Constraints:   Must be a value from 0 to 35   Can't be set to 0 if the DB instance is a source to read replicas  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.  Amazon Aurora  Not applicable. The character set is managed by the DB cluster. For more information, see CreateDBCluster.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The identifier of the DB cluster that the instance will belong to.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide. 
    */
  var DBInstanceClass: String = js.native
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL  The name of the database to create when the DB instance is created. If this parameter isn't specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    MariaDB  The name of the database to create when the DB instance is created. If this parameter isn't specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    PostgreSQL  The name of the database to create when the DB instance is created. If this parameter isn't specified, the default "postgres" database is created in the DB instance. Constraints:   Must contain 1 to 63 letters, numbers, or underscores.   Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).   Can't be a word reserved by the specified database engine    Oracle  The Oracle System ID (SID) of the created DB instance. If you specify null, the default value ORCL is used. You can't specify the string NULL, or any other reserved word, for DBName.  Default: ORCL  Constraints:   Can't be longer than 8 characters    SQL Server  Not applicable. Must be null.  Amazon Aurora  The name of the database to create when the primary instance of the DB cluster is created. If this parameter isn't specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine  
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then the default DB parameter group for the specified DB engine and version is used. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A list of DB security groups to associate with this DB instance. Default: The default DB security group for the database engine.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * A DB subnet group to associate with this DB instance. If there is no DB subnet group, then it is a non-VPC DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance.   Amazon Aurora  Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see CreateDBCluster. DB instances in a DB cluster can be deleted even when deletion protection is enabled for the DB cluster. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Active Directory directory ID to create the DB instance in. Currently, only Microsoft SQL Server and Oracle DB instances can be created in an Active Directory Domain. For Microsoft SQL Server DB instances, Amazon RDS can use Windows Authentication to authenticate users that connect to the DB instance. For more information, see  Using Windows Authentication with an Amazon RDS DB Instance Running Microsoft SQL Server in the Amazon RDS User Guide. For Oracle DB instances, Amazon RDS can use Kerberos Authentication to authenticate users that connect to the DB instance. For more information, see  Using Kerberos Authentication with Amazon RDS for Oracle in the Amazon RDS User Guide.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon Relational Database Service User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. You can enable IAM database authentication for the following database engines:  Amazon Aurora  Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.  MySQL    For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   For MySQL 8.0, minor version 8.0.16 or higher    PostgreSQL    For PostgreSQL 9.5, minor version 9.5.15 or higher   For PostgreSQL 9.6, minor version 9.6.11 or higher   PostgreSQL 10.6, 10.7, and 10.9   For more information, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to enable Performance Insights for the DB instance.  For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.native
  /**
    * The name of the database engine to be used for this instance.  Not every database engine is available for every AWS Region.  Valid Values:     aurora (for MySQL 5.6-compatible Aurora)    aurora-mysql (for MySQL 5.7-compatible Aurora)    aurora-postgresql     mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var Engine: String = js.native
  /**
    * The version number of the database engine to use. For a list of valid engine versions, use the DescribeDBEngineVersions action. The following are the database engines and links to information about the major and minor versions that are available with Amazon RDS. Not every database engine is available for every AWS Region.  Amazon Aurora  Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB cluster.  MariaDB  See MariaDB on Amazon RDS Versions in the Amazon RDS User Guide.   Microsoft SQL Server  See Version and Feature Support on Amazon RDS in the Amazon RDS User Guide.   MySQL  See MySQL on Amazon RDS Versions in the Amazon RDS User Guide.   Oracle  See Oracle Database Engine Release Notes in the Amazon RDS User Guide.   PostgreSQL  See Supported PostgreSQL Database Versions in the Amazon RDS User Guide. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance. For information about valid Iops values, see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide.  Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50 of the storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and 50 of the storage amount for the DB instance. 
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * The AWS KMS key identifier for an encrypted DB instance. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.  Amazon Aurora  Not applicable. The KMS key identifier is managed by the DB cluster. For more information, see CreateDBCluster. If StorageEncrypted is enabled, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * License model information for this DB instance.  Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster.  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The name for the master user.  Amazon Aurora  Not applicable. The name for the master user is managed by the DB cluster.   MariaDB  Constraints:   Required for MariaDB.   Must be 1 to 16 letters or numbers.   Can't be a reserved word for the chosen database engine.    Microsoft SQL Server  Constraints:   Required for SQL Server.   Must be 1 to 128 letters or numbers.   The first character must be a letter.   Can't be a reserved word for the chosen database engine.    MySQL  Constraints:   Required for MySQL.   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    Oracle  Constraints:   Required for Oracle.   Must be 1 to 30 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    PostgreSQL  Constraints:   Required for PostgreSQL.   Must be 1 to 63 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to Setting Up and Enabling Enhanced Monitoring in the Amazon RDS User Guide. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * Indicates that the DB instance should be associated with the specified option group. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group. Also, that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The port number on which the database accepts connections.  MySQL   Default: 3306   Valid values: 1150-65535  Type: Integer  MariaDB   Default: 3306   Valid values: 1150-65535  Type: Integer  PostgreSQL   Default: 5432   Valid values: 1150-65535  Type: Integer  Oracle   Default: 1521   Valid values: 1150-65535   SQL Server   Default: 1433   Valid values: 1150-65535 except 1234, 1434, 3260, 3343, 3389, 47001, and 49152-49156.  Amazon Aurora   Default: 3306   Valid values: 1150-65535  Type: Integer
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter. For more information, see The Backup Window in the Amazon RDS User Guide.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Instance Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more information, see Amazon RDS Maintenance Window.   Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.  Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it uses, and that public access is not permitted if the security group assigned to the DB instance doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. Default: The default behavior varies depending on whether DBSubnetGroupName is specified. If DBSubnetGroupName isn't specified, and PubliclyAccessible isn't specified, the following applies:   If the default VPC in the target region doesn’t have an Internet gateway attached to it, the DB instance is private.   If the default VPC in the target region has an Internet gateway attached to it, the DB instance is public.   If DBSubnetGroupName is specified, and PubliclyAccessible isn't specified, the following applies:   If the subnets are part of a VPC that doesn’t have an Internet gateway attached to it, the DB instance is private.   If the subnets are part of a VPC that has an Internet gateway attached to it, the DB instance is public.  
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.  Amazon Aurora  Not applicable. The encryption for DB instances is managed by the DB cluster.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * Tags to assign to the DB instance.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The password for the given ARN from the key store in order to access the device.
    */
  var TdeCredentialPassword: js.UndefOr[String] = js.native
  /**
    * The time zone of the DB instance. The time zone parameter is currently supported only by Microsoft SQL Server. 
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * A list of Amazon EC2 VPC security groups to associate with this DB instance.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. Default: The default EC2 VPC security group for the DB subnet group's VPC.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object CreateDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceClass: String, DBInstanceIdentifier: String, Engine: String): CreateDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceClass = DBInstanceClass.asInstanceOf[js.Any], DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBInstanceMessage]
  }
  @scala.inline
  implicit class CreateDBInstanceMessageOps[Self <: CreateDBInstanceMessage] (val x: Self) extends AnyVal {
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
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setCharacterSetName(value: String): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setDBName(value: String): Self = this.set("DBName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    @scala.inline
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupName: Self = this.set("DBParameterGroupName", js.undefined)
    @scala.inline
    def setDBSecurityGroupsVarargs(value: String*): Self = this.set("DBSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroupNameList): Self = this.set("DBSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroups: Self = this.set("DBSecurityGroups", js.undefined)
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setDomainIAMRoleName(value: String): Self = this.set("DomainIAMRoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainIAMRoleName: Self = this.set("DomainIAMRoleName", js.undefined)
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnableCloudwatchLogsExports", js.Array(value :_*))
    @scala.inline
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCloudwatchLogsExports: Self = this.set("EnableCloudwatchLogsExports", js.undefined)
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = this.set("EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIAMDatabaseAuthentication: Self = this.set("EnableIAMDatabaseAuthentication", js.undefined)
    @scala.inline
    def setEnablePerformanceInsights(value: BooleanOptional): Self = this.set("EnablePerformanceInsights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePerformanceInsights: Self = this.set("EnablePerformanceInsights", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setMaxAllocatedStorage(value: IntegerOptional): Self = this.set("MaxAllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllocatedStorage: Self = this.set("MaxAllocatedStorage", js.undefined)
    @scala.inline
    def setMonitoringInterval(value: IntegerOptional): Self = this.set("MonitoringInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("MonitoringInterval", js.undefined)
    @scala.inline
    def setMonitoringRoleArn(value: String): Self = this.set("MonitoringRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("MonitoringRoleArn", js.undefined)
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    @scala.inline
    def setPerformanceInsightsKMSKeyId(value: String): Self = this.set("PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsKMSKeyId: Self = this.set("PerformanceInsightsKMSKeyId", js.undefined)
    @scala.inline
    def setPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = this.set("PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsRetentionPeriod: Self = this.set("PerformanceInsightsRetentionPeriod", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = this.set("ProcessorFeatures", js.Array(value :_*))
    @scala.inline
    def setProcessorFeatures(value: ProcessorFeatureList): Self = this.set("ProcessorFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessorFeatures: Self = this.set("ProcessorFeatures", js.undefined)
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTdeCredentialArn(value: String): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    @scala.inline
    def setTdeCredentialPassword(value: String): Self = this.set("TdeCredentialPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdeCredentialPassword: Self = this.set("TdeCredentialPassword", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
  
}

