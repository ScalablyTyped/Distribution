package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.FULL_CONTROL
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ_ACP
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE_ACP
import typings.awsSdkClientGlacierNode.typesGranteeMod.Grantee
import typings.awsSdkClientGlacierNode.typesGranteeMod.UnmarshalledGrantee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantMod {
  
  trait Grant extends StObject {
    
    /**
      * <p>The grantee.</p>
      */
    var Grantee: js.UndefOr[typings.awsSdkClientGlacierNode.typesGranteeMod.Grantee] = js.undefined
    
    /**
      * <p>Specifies the permission given to the grantee. </p>
      */
    var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
  }
  object Grant {
    
    inline def apply(): Grant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
      
      inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
      
      inline def setPermission(value: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    }
  }
  
  trait UnmarshalledGrant
    extends StObject
       with Grant {
    
    /**
      * <p>The grantee.</p>
      */
    @JSName("Grantee")
    var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
  }
  object UnmarshalledGrant {
    
    inline def apply(): UnmarshalledGrant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledGrant] (val x: Self) extends AnyVal {
      
      inline def setGrantee(value: UnmarshalledGrantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
      
      inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    }
  }
}
