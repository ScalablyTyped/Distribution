package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketRequest extends js.Object {
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.native
  /**
    * The name of the bucket to create.
    */
  var Bucket: BucketName = js.native
  /**
    * The configuration information for the bucket.
    */
  var CreateBucketConfiguration: js.UndefOr[typings.awsSdk.s3Mod.CreateBucketConfiguration] = js.native
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3Mod.GrantFullControl] = js.native
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3Mod.GrantRead] = js.native
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3Mod.GrantReadACP] = js.native
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.
    */
  var GrantWrite: js.UndefOr[typings.awsSdk.s3Mod.GrantWrite] = js.native
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3Mod.GrantWriteACP] = js.native
  /**
    * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
    */
  var ObjectLockEnabledForBucket: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabledForBucket] = js.native
}

object CreateBucketRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ACL: BucketCannedACL = null,
    CreateBucketConfiguration: CreateBucketConfiguration = null,
    GrantFullControl: GrantFullControl = null,
    GrantRead: GrantRead = null,
    GrantReadACP: GrantReadACP = null,
    GrantWrite: GrantWrite = null,
    GrantWriteACP: GrantWriteACP = null,
    ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket] = js.undefined
  ): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration.asInstanceOf[js.Any])
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl.asInstanceOf[js.Any])
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead.asInstanceOf[js.Any])
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP.asInstanceOf[js.Any])
    if (GrantWrite != null) __obj.updateDynamic("GrantWrite")(GrantWrite.asInstanceOf[js.Any])
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP.asInstanceOf[js.Any])
    if (!js.isUndefined(ObjectLockEnabledForBucket)) __obj.updateDynamic("ObjectLockEnabledForBucket")(ObjectLockEnabledForBucket.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
}

