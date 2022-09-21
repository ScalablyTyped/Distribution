package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
    * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle. You can update a bucket's bundle only one time within a monthly Amazon Web Services billing cycle. Use the UpdateBucketBundle action to change a bucket's bundle.
    */
  var ableToUpdateBundle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that describes the access log configuration for the bucket.
    */
  var accessLogConfig: js.UndefOr[BucketAccessLogConfig] = js.undefined
  
  /**
    * An object that describes the access rules of the bucket.
    */
  var accessRules: js.UndefOr[AccessRules] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the bundle currently applied to the bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. Use the UpdateBucketBundle action to change the bundle of a bucket.
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the distribution was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the location of the bucket, such as the Amazon Web Services Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[BucketName] = js.undefined
  
  /**
    * Indicates whether object versioning is enabled for the bucket. The following options can be configured:    Enabled - Object versioning is enabled.    Suspended - Object versioning was previously enabled but is currently suspended. Existing object versions are retained.    NeverEnabled - Object versioning has never been enabled.  
    */
  var objectVersioning: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of strings that specify the Amazon Web Services account IDs that have read-only access to the bucket.
    */
  var readonlyAccessAccounts: js.UndefOr[PartnerIdList] = js.undefined
  
  /**
    * The Lightsail resource type of the bucket (for example, Bucket).
    */
  var resourceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of objects that describe Lightsail instances that have access to the bucket. Use the SetResourceAccessForBucket action to update the instances that have access to a bucket.
    */
  var resourcesReceivingAccess: js.UndefOr[AccessReceiverList] = js.undefined
  
  /**
    * An object that describes the state of the bucket.
    */
  var state: js.UndefOr[BucketState] = js.undefined
  
  /**
    * The support code for a bucket. Include this code in your email to support when you have questions about a Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tag keys and optional values for the bucket. For more information, see Tags in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The URL of the bucket.
    */
  var url: js.UndefOr[NonEmptyString] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setAbleToUpdateBundle(value: Boolean): Self = StObject.set(x, "ableToUpdateBundle", value.asInstanceOf[js.Any])
    
    inline def setAbleToUpdateBundleUndefined: Self = StObject.set(x, "ableToUpdateBundle", js.undefined)
    
    inline def setAccessLogConfig(value: BucketAccessLogConfig): Self = StObject.set(x, "accessLogConfig", value.asInstanceOf[js.Any])
    
    inline def setAccessLogConfigUndefined: Self = StObject.set(x, "accessLogConfig", js.undefined)
    
    inline def setAccessRules(value: AccessRules): Self = StObject.set(x, "accessRules", value.asInstanceOf[js.Any])
    
    inline def setAccessRulesUndefined: Self = StObject.set(x, "accessRules", js.undefined)
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: BucketName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectVersioning(value: NonEmptyString): Self = StObject.set(x, "objectVersioning", value.asInstanceOf[js.Any])
    
    inline def setObjectVersioningUndefined: Self = StObject.set(x, "objectVersioning", js.undefined)
    
    inline def setReadonlyAccessAccounts(value: PartnerIdList): Self = StObject.set(x, "readonlyAccessAccounts", value.asInstanceOf[js.Any])
    
    inline def setReadonlyAccessAccountsUndefined: Self = StObject.set(x, "readonlyAccessAccounts", js.undefined)
    
    inline def setReadonlyAccessAccountsVarargs(value: NonEmptyString*): Self = StObject.set(x, "readonlyAccessAccounts", js.Array(value*))
    
    inline def setResourceType(value: NonEmptyString): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourcesReceivingAccess(value: AccessReceiverList): Self = StObject.set(x, "resourcesReceivingAccess", value.asInstanceOf[js.Any])
    
    inline def setResourcesReceivingAccessUndefined: Self = StObject.set(x, "resourcesReceivingAccess", js.undefined)
    
    inline def setResourcesReceivingAccessVarargs(value: ResourceReceivingAccess*): Self = StObject.set(x, "resourcesReceivingAccess", js.Array(value*))
    
    inline def setState(value: BucketState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: NonEmptyString): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUrl(value: NonEmptyString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
