package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBucketRequest extends StObject {
  
  /**
    * An object that describes the access log configuration for the bucket.
    */
  var accessLogConfig: js.UndefOr[BucketAccessLogConfig] = js.undefined
  
  /**
    * An object that sets the public accessibility of objects in the specified bucket.
    */
  var accessRules: js.UndefOr[AccessRules] = js.undefined
  
  /**
    * The name of the bucket to update.
    */
  var bucketName: BucketName
  
  /**
    * An array of strings to specify the Amazon Web Services account IDs that can access the bucket. You can give a maximum of 10 Amazon Web Services accounts access to a bucket.
    */
  var readonlyAccessAccounts: js.UndefOr[PartnerIdList] = js.undefined
  
  /**
    * Specifies whether to enable or suspend versioning of objects in the bucket. The following options can be specified:    Enabled - Enables versioning of objects in the specified bucket.    Suspended - Suspends versioning of objects in the specified bucket. Existing object versions are retained.  
    */
  var versioning: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateBucketRequest {
  
  inline def apply(bucketName: BucketName): UpdateBucketRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBucketRequest]
  }
  
  extension [Self <: UpdateBucketRequest](x: Self) {
    
    inline def setAccessLogConfig(value: BucketAccessLogConfig): Self = StObject.set(x, "accessLogConfig", value.asInstanceOf[js.Any])
    
    inline def setAccessLogConfigUndefined: Self = StObject.set(x, "accessLogConfig", js.undefined)
    
    inline def setAccessRules(value: AccessRules): Self = StObject.set(x, "accessRules", value.asInstanceOf[js.Any])
    
    inline def setAccessRulesUndefined: Self = StObject.set(x, "accessRules", js.undefined)
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setReadonlyAccessAccounts(value: PartnerIdList): Self = StObject.set(x, "readonlyAccessAccounts", value.asInstanceOf[js.Any])
    
    inline def setReadonlyAccessAccountsUndefined: Self = StObject.set(x, "readonlyAccessAccounts", js.undefined)
    
    inline def setReadonlyAccessAccountsVarargs(value: NonEmptyString*): Self = StObject.set(x, "readonlyAccessAccounts", js.Array(value*))
    
    inline def setVersioning(value: NonEmptyString): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
  }
}
