package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIdentityDescriptionMod {
  
  trait IdentityDescription extends StObject {
    
    /**
      * <p>Date on which the identity was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    var LastModifiedDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  }
  object IdentityDescription {
    
    inline def apply(): IdentityDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityDescription]
    }
    
    extension [Self <: IdentityDescription](x: Self) {
      
      inline def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date | String | Double): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setLogins(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
      
      inline def setLoginsVarargs(value: String*): Self = StObject.set(x, "Logins", js.Array(value*))
    }
  }
  
  trait UnmarshalledIdentityDescription
    extends StObject
       with IdentityDescription {
    
    /**
      * <p>Date on which the identity was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    @JSName("LastModifiedDate")
    var LastModifiedDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    @JSName("Logins")
    var Logins_UnmarshalledIdentityDescription: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledIdentityDescription {
    
    inline def apply(): UnmarshalledIdentityDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledIdentityDescription]
    }
    
    extension [Self <: UnmarshalledIdentityDescription](x: Self) {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setLogins(value: js.Array[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
      
      inline def setLoginsVarargs(value: String*): Self = StObject.set(x, "Logins", js.Array(value*))
    }
  }
}
