package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typings.awsSdkClientS3Browser.typesGranteeMod.Grantee
import typings.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTargetGrantMod {
  
  @js.native
  trait TargetGrant extends StObject {
    
    /**
      * _Grantee shape
      */
    var Grantee: js.UndefOr[typings.awsSdkClientS3Browser.typesGranteeMod.Grantee] = js.native
    
    /**
      * <p>Logging permissions assigned to the Grantee for the bucket.</p>
      */
    var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.native
  }
  object TargetGrant {
    
    @scala.inline
    def apply(): TargetGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGrant]
    }
    
    @scala.inline
    implicit class TargetGrantMutableBuilder[Self <: TargetGrant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
      
      @scala.inline
      def setPermission(value: FULL_CONTROL | READ | WRITE | String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledTargetGrant extends TargetGrant {
    
    /**
      * _Grantee shape
      */
    @JSName("Grantee")
    var Grantee_UnmarshalledTargetGrant: js.UndefOr[UnmarshalledGrantee] = js.native
  }
  object UnmarshalledTargetGrant {
    
    @scala.inline
    def apply(): UnmarshalledTargetGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTargetGrant]
    }
    
    @scala.inline
    implicit class UnmarshalledTargetGrantMutableBuilder[Self <: UnmarshalledTargetGrant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantee(value: UnmarshalledGrantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    }
  }
}
