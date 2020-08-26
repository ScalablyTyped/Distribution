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
  def apply(): AwsRdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceDetails]
  }
  @scala.inline
  implicit class AwsRdsDbInstanceDetailsOps[Self <: AwsRdsDbInstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociatedRolesVarargs(value: AwsRdsDbInstanceAssociatedRole*): Self = this.set("AssociatedRoles", js.Array(value :_*))
    @scala.inline
    def setAssociatedRoles(value: AwsRdsDbInstanceAssociatedRoles): Self = this.set("AssociatedRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedRoles: Self = this.set("AssociatedRoles", js.undefined)
    @scala.inline
    def setCACertificateIdentifier(value: NonEmptyString): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: NonEmptyString): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: NonEmptyString): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: NonEmptyString): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    @scala.inline
    def setDBName(value: NonEmptyString): Self = this.set("DBName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    @scala.inline
    def setDbInstancePort(value: Integer): Self = this.set("DbInstancePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbInstancePort: Self = this.set("DbInstancePort", js.undefined)
    @scala.inline
    def setDbiResourceId(value: NonEmptyString): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setEndpoint(value: AwsRdsDbInstanceEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    @scala.inline
    def setInstanceCreateTime(value: NonEmptyString): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    @scala.inline
    def setTdeCredentialArn(value: NonEmptyString): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRdsDbInstanceVpcSecurityGroup*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
  
}

