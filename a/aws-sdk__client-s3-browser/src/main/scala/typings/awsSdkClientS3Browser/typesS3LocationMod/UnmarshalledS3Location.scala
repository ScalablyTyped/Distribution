package typings.awsSdkClientS3Browser.typesS3LocationMod

import typings.awsSdkClientS3Browser.typesEncryptionMod.UnmarshalledEncryption
import typings.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Browser.typesMetadataEntryMod.UnmarshalledMetadataEntry
import typings.awsSdkClientS3Browser.typesTaggingMod.UnmarshalledTagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledS3Location extends S3Location {
  
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
  
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.native
  
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  @JSName("Tagging")
  var Tagging_UnmarshalledS3Location: js.UndefOr[UnmarshalledTagging] = js.native
  
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledMetadataEntry]] = js.native
}
object UnmarshalledS3Location {
  
  @scala.inline
  def apply(BucketName: String, Prefix: String): UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledS3Location]
  }
  
  @scala.inline
  implicit class UnmarshalledS3LocationOps[Self <: UnmarshalledS3Location] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListVarargs(value: UnmarshalledGrant*): Self = this.set("AccessControlList", js.Array(value :_*))
    
    @scala.inline
    def setAccessControlList(value: js.Array[UnmarshalledGrant]): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    
    @scala.inline
    def setEncryption(value: UnmarshalledEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setTagging(value: UnmarshalledTagging): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    
    @scala.inline
    def setUserMetadataVarargs(value: UnmarshalledMetadataEntry*): Self = this.set("UserMetadata", js.Array(value :_*))
    
    @scala.inline
    def setUserMetadata(value: js.Array[UnmarshalledMetadataEntry]): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
}
