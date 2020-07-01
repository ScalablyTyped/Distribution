package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    *  The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable. 
    */
  var domain: DomainName = js.native
  /**
    *  The encryption key for the domain. This is used to encrypt content stored in a domain. An encryption key can be a key ID, a key Amazon Resource Name (ARN), a key alias, or a key alias ARN. To specify an encryptionKey, your IAM role must have kms:DescribeKey and kms:CreateGrant permissions on the encryption key that is used. For more information, see DescribeKey in the AWS Key Management Service API Reference and AWS KMS API Permissions Reference in the AWS Key Management Service Developer Guide.    CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric CMK with your domain. For more information, see Using symmetric and asymmetric keys in the AWS Key Management Service Developer Guide.  
    */
  var encryptionKey: js.UndefOr[Arn] = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(domain: DomainName, encryptionKey: Arn = null): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

