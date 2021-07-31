package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMailboxExportJobRequest extends StObject {
  
  /**
    * The idempotency token for the client request.
    */
  var ClientToken: IdempotencyClientToken
  
  /**
    * The mailbox export job description.
    */
  var Description: js.UndefOr[typings.awsSdk.workmailMod.Description] = js.undefined
  
  /**
    * The identifier of the user or resource associated with the mailbox.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the exported mailbox content.
    */
  var KmsKeyArn: typings.awsSdk.workmailMod.KmsKeyArn
  
  /**
    * The identifier associated with the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
    */
  var RoleArn: typings.awsSdk.workmailMod.RoleArn
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: typings.awsSdk.workmailMod.S3BucketName
  
  /**
    * The S3 bucket prefix.
    */
  var S3Prefix: S3ObjectKey
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
  implicit class StartMailboxExportJobRequestMutableBuilder[Self <: StartMailboxExportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: S3ObjectKey): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
  }
}
