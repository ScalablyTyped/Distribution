package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessRules extends StObject {
  
  /**
    * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual objects override the getObject option that is currently specified. When this is true, you can use the PutObjectAcl Amazon S3 API action to set individual objects to public (read-only) using the public-read ACL, or to private using the private ACL.
    */
  var allowPublicOverrides: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the anonymous access to all objects in a bucket. The following options can be specified:    public - Sets all objects in the bucket to public (read-only), making them readable by anyone in the world. If the getObject value is set to public, then all objects in the bucket default to public regardless of the allowPublicOverrides value.    private - Sets all objects in the bucket to private, making them readable only by you or anyone you give access to. If the getObject value is set to private, and the allowPublicOverrides value is set to true, then all objects in the bucket default to private unless they are configured with a public-read ACL. Individual objects with a public-read ACL are readable by anyone in the world.  
    */
  var getObject: js.UndefOr[AccessType] = js.undefined
}
object AccessRules {
  
  inline def apply(): AccessRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessRules]
  }
  
  extension [Self <: AccessRules](x: Self) {
    
    inline def setAllowPublicOverrides(value: Boolean): Self = StObject.set(x, "allowPublicOverrides", value.asInstanceOf[js.Any])
    
    inline def setAllowPublicOverridesUndefined: Self = StObject.set(x, "allowPublicOverrides", js.undefined)
    
    inline def setGetObject(value: AccessType): Self = StObject.set(x, "getObject", value.asInstanceOf[js.Any])
    
    inline def setGetObjectUndefined: Self = StObject.set(x, "getObject", js.undefined)
  }
}
