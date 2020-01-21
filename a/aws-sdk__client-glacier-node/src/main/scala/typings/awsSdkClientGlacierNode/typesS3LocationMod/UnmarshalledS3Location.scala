package typings.awsSdkClientGlacierNode.typesS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD_IA
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`authenticated-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`aws-exec-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-full-control`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`private`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read-write`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read`
import typings.awsSdkClientGlacierNode.typesEncryptionMod.UnmarshalledEncryption
import typings.awsSdkClientGlacierNode.typesGrantMod.UnmarshalledGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledS3Location extends S3Location {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
  /**
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.undefined
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  @JSName("Tagging")
  var Tagging_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UnmarshalledS3Location {
  @scala.inline
  def apply(
    AccessControlList: js.Array[UnmarshalledGrant] = null,
    BucketName: String = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: UnmarshalledEncryption = null,
    Prefix: String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String = null,
    Tagging: StringDictionary[String] = null,
    UserMetadata: StringDictionary[String] = null
  ): UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledS3Location]
  }
}

