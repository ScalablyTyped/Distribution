package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typings.awsSdkClientS3Node.typesGranteeMod.Grantee
import typings.awsSdkClientS3Node.typesGranteeMod.UnmarshalledGrantee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTargetGrantMod {
  
  trait TargetGrant extends StObject {
    
    /**
      * _Grantee shape
      */
    var Grantee: js.UndefOr[typings.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.undefined
    
    /**
      * <p>Logging permissions assigned to the Grantee for the bucket.</p>
      */
    var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.undefined
  }
  object TargetGrant {
    
    inline def apply(): TargetGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGrant]
    }
    
    extension [Self <: TargetGrant](x: Self) {
      
      inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
      
      inline def setPermission(value: FULL_CONTROL | READ | WRITE | String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    }
  }
  
  trait UnmarshalledTargetGrant
    extends StObject
       with TargetGrant {
    
    /**
      * _Grantee shape
      */
    @JSName("Grantee")
    var Grantee_UnmarshalledTargetGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
  }
  object UnmarshalledTargetGrant {
    
    inline def apply(): UnmarshalledTargetGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTargetGrant]
    }
    
    extension [Self <: UnmarshalledTargetGrant](x: Self) {
      
      inline def setGrantee(value: UnmarshalledGrantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    }
  }
}
