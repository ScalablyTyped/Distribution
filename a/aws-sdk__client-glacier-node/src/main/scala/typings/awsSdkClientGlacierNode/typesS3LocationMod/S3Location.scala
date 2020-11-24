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
import typings.awsSdkClientGlacierNode.typesEncryptionMod.Encryption
import typings.awsSdkClientGlacierNode.typesGrantMod.Grant
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends js.Object {
  
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.native
  
  /**
    * <p>The name of the Amazon S3 bucket where the job results are stored.</p>
    */
  var BucketName: js.UndefOr[String] = js.native
  
  /**
    * <p>The canned access control list (ACL) to apply to the job results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.native
  
  /**
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  var Encryption: js.UndefOr[typings.awsSdkClientGlacierNode.typesEncryptionMod.Encryption] = js.native
  
  /**
    * <p>The prefix that is prepended to the results for this request.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>The storage class used to store the job results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String] = js.native
  
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  var Tagging: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  var UserMetadata: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}
object S3Location {
  
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListVarargs(value: Grant*): Self = this.set("AccessControlList", js.Array(value :_*))
    
    @scala.inline
    def setAccessControlList(value: js.Array[Grant] | Iterable[Grant]): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    
    @scala.inline
    def setCannedACL(
      value: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
    ): Self = this.set("CannedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCannedACL: Self = this.set("CannedACL", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    
    @scala.inline
    def setTagging(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
}
