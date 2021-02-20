package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.FULL_CONTROL
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.READ_ACP
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.WRITE_ACP
import typings.awsSdkClientS3Browser.typesGranteeMod.Grantee
import typings.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantMod {
  
  @js.native
  trait Grant extends StObject {
    
    /**
      * _Grantee shape
      */
    var Grantee: js.UndefOr[typings.awsSdkClientS3Browser.typesGranteeMod.Grantee] = js.native
    
    /**
      * <p>Specifies the permission given to the grantee.</p>
      */
    var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.native
  }
  object Grant {
    
    @scala.inline
    def apply(): Grant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grant]
    }
    
    @scala.inline
    implicit class GrantMutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
      
      @scala.inline
      def setPermission(value: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledGrant extends Grant {
    
    /**
      * _Grantee shape
      */
    @JSName("Grantee")
    var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.native
  }
  object UnmarshalledGrant {
    
    @scala.inline
    def apply(): UnmarshalledGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrant]
    }
    
    @scala.inline
    implicit class UnmarshalledGrantMutableBuilder[Self <: UnmarshalledGrant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantee(value: UnmarshalledGrantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    }
  }
}
