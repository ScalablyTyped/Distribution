package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAccessBlockConfiguration extends StObject {
  
  /**
    * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   PUT Bucket calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs.
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.undefined
  
  /**
    * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies.
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.undefined
  
  /**
    * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.undefined
  
  /**
    * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS service principals and authorized users within this account if the bucket has a public policy. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
}
object PublicAccessBlockConfiguration {
  
  inline def apply(): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
  
  extension [Self <: PublicAccessBlockConfiguration](x: Self) {
    
    inline def setBlockPublicAcls(value: Setting): Self = StObject.set(x, "BlockPublicAcls", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAclsUndefined: Self = StObject.set(x, "BlockPublicAcls", js.undefined)
    
    inline def setBlockPublicPolicy(value: Setting): Self = StObject.set(x, "BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "BlockPublicPolicy", js.undefined)
    
    inline def setIgnorePublicAcls(value: Setting): Self = StObject.set(x, "IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    inline def setIgnorePublicAclsUndefined: Self = StObject.set(x, "IgnorePublicAcls", js.undefined)
    
    inline def setRestrictPublicBuckets(value: Setting): Self = StObject.set(x, "RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    inline def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "RestrictPublicBuckets", js.undefined)
  }
}
