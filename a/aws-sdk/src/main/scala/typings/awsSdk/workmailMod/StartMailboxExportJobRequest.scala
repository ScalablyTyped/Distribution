package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMailboxExportJobRequest extends js.Object {
  
  /**
    * The idempotency token for the client request.
    */
  var ClientToken: IdempotencyClientToken = js.native
  
  /**
    * The mailbox export job description.
    */
  var Description: js.UndefOr[typings.awsSdk.workmailMod.Description] = js.native
  
  /**
    * The identifier of the user or resource associated with the mailbox.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the exported mailbox content.
    */
  var KmsKeyArn: typings.awsSdk.workmailMod.KmsKeyArn = js.native
  
  /**
    * The identifier associated with the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
    */
  var RoleArn: typings.awsSdk.workmailMod.RoleArn = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: typings.awsSdk.workmailMod.S3BucketName = js.native
  
  /**
    * The S3 bucket prefix.
    */
  var S3Prefix: S3ObjectKey = js.native
}
object StartMailboxExportJobRequest {
  
  @scala.inline
  def apply(
    ClientToken: IdempotencyClientToken,
    EntityId: WorkMailIdentifier,
    KmsKeyArn: KmsKeyArn,
    OrganizationId: OrganizationId,
    RoleArn: RoleArn,
    S3BucketName: S3BucketName,
    S3Prefix: S3ObjectKey
  ): StartMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Prefix = S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMailboxExportJobRequest]
  }
  
  @scala.inline
  implicit class StartMailboxExportJobRequestOps[Self <: StartMailboxExportJobRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: IdempotencyClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: S3ObjectKey): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
