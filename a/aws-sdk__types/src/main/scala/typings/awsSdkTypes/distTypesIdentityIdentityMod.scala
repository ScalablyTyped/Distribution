package typings.awsSdkTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIdentityIdentityMod {
  
  trait Identity extends StObject {
    
    /**
      * A `Date` when the identity or credential will no longer be accepted.
      */
    val expiration: js.UndefOr[js.Date] = js.undefined
  }
  object Identity {
    
    inline def apply(): Identity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    }
  }
  
  type IdentityProvider[IdentityT /* <: Identity */] = js.Function1[/* identityProperties */ js.UndefOr[Record[String, Any]], js.Promise[IdentityT]]
}
