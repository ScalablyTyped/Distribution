package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.AmazonCustomerByEmail
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.CanonicalUser
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGranteeMod {
  
  trait Grantee extends StObject {
    
    /**
      * <p>Screen name of the grantee.</p>
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Email address of the grantee.</p>
      */
    var EmailAddress: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The canonical user ID of the grantee.</p>
      */
    var ID: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Type of grantee</p>
      */
    var Type: AmazonCustomerByEmail | CanonicalUser | Group | String
    
    /**
      * <p>URI of the grantee group.</p>
      */
    var URI: js.UndefOr[String] = js.undefined
  }
  object Grantee {
    
    inline def apply(Type: AmazonCustomerByEmail | CanonicalUser | Group | String): Grantee = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grantee]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grantee] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setType(value: AmazonCustomerByEmail | CanonicalUser | Group | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
    }
  }
  
  type UnmarshalledGrantee = Grantee
}
