package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicAccessBlockConfiguration extends js.Object {
  
  /**
    * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   PUT Bucket calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs.
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies.
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.native
  
  /**
    * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS service principals and authorized users within this account if the bucket has a public policy. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.native
}
object PublicAccessBlockConfiguration {
  
  @scala.inline
  def apply(): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
  
  @scala.inline
  implicit class PublicAccessBlockConfigurationOps[Self <: PublicAccessBlockConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBlockPublicAcls(value: Setting): Self = this.set("BlockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicAcls: Self = this.set("BlockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: Setting): Self = this.set("BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("BlockPublicPolicy", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: Setting): Self = this.set("IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePublicAcls: Self = this.set("IgnorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: Setting): Self = this.set("RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictPublicBuckets: Self = this.set("RestrictPublicBuckets", js.undefined)
  }
}
