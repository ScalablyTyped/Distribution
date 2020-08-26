package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectAclRequest extends js.Object {
  /**
    * The canned ACL to apply to the object. For more information, see Canned ACL.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.native
  /**
    * Contains the elements that set the ACL permissions for an object per grantee.
    */
  var AccessControlPolicy: js.UndefOr[typings.awsSdk.s3Mod.AccessControlPolicy] = js.native
  /**
    * The bucket name that contains the object to which you want to attach the ACL.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to verify that the request body was not corrupted in transit. For more information, go to RFC 1864.&gt; 
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
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
    * Key for which the PUT operation was initiated.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectAclRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): PutObjectAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectAclRequest]
  }
  @scala.inline
  implicit class PutObjectAclRequestOps[Self <: PutObjectAclRequest] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setACL(value: ObjectCannedACL): Self = this.set("ACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    @scala.inline
    def setAccessControlPolicy(value: AccessControlPolicy): Self = this.set("AccessControlPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlPolicy: Self = this.set("AccessControlPolicy", js.undefined)
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    @scala.inline
    def setGrantFullControl(value: GrantFullControl): Self = this.set("GrantFullControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantFullControl: Self = this.set("GrantFullControl", js.undefined)
    @scala.inline
    def setGrantRead(value: GrantRead): Self = this.set("GrantRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantRead: Self = this.set("GrantRead", js.undefined)
    @scala.inline
    def setGrantReadACP(value: GrantReadACP): Self = this.set("GrantReadACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantReadACP: Self = this.set("GrantReadACP", js.undefined)
    @scala.inline
    def setGrantWrite(value: GrantWrite): Self = this.set("GrantWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantWrite: Self = this.set("GrantWrite", js.undefined)
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

