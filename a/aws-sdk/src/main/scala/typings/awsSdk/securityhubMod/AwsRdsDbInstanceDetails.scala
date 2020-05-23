package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceDetails extends js.Object {
  /**
    * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles] = js.native
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[NonEmptyString] = js.native
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance. 
    */
  var DBName: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed. 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Indicates whether the DB instance has deletion protection enabled. When deletion protection is enabled, the database cannot be deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.native
  /**
    * Provides the name of the database engine to use for this DB instance.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines.   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of VPC security groups that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.native
}

object AwsRdsDbInstanceDetails {
  @scala.inline
  def apply(
    AssociatedRoles: AwsRdsDbInstanceAssociatedRoles = null,
    CACertificateIdentifier: NonEmptyString = null,
    DBClusterIdentifier: NonEmptyString = null,
    DBInstanceClass: NonEmptyString = null,
    DBInstanceIdentifier: NonEmptyString = null,
    DBName: NonEmptyString = null,
    DbInstancePort: js.UndefOr[Integer] = js.undefined,
    DbiResourceId: NonEmptyString = null,
    DeletionProtection: js.UndefOr[Boolean] = js.undefined,
    Endpoint: AwsRdsDbInstanceEndpoint = null,
    Engine: NonEmptyString = null,
    EngineVersion: NonEmptyString = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
    InstanceCreateTime: NonEmptyString = null,
    KmsKeyId: NonEmptyString = null,
    PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
    StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
    TdeCredentialArn: NonEmptyString = null,
    VpcSecurityGroups: AwsRdsDbInstanceVpcSecurityGroups = null
  ): AwsRdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (AssociatedRoles != null) __obj.updateDynamic("AssociatedRoles")(AssociatedRoles.asInstanceOf[js.Any])
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier.asInstanceOf[js.Any])
    if (DBName != null) __obj.updateDynamic("DBName")(DBName.asInstanceOf[js.Any])
    if (!js.isUndefined(DbInstancePort)) __obj.updateDynamic("DbInstancePort")(DbInstancePort.get.asInstanceOf[js.Any])
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.get.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled.get.asInstanceOf[js.Any])
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.get.asInstanceOf[js.Any])
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn.asInstanceOf[js.Any])
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRdsDbInstanceDetails]
  }
}

