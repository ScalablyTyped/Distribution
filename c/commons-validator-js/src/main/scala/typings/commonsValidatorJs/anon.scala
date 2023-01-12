package typings.commonsValidatorJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowLocal extends StObject {
    
    var allowLocal: Boolean
    
    var allowTld: Boolean
  }
  object AllowLocal {
    
    inline def apply(allowLocal: Boolean, allowTld: Boolean): AllowLocal = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowLocal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowLocal] (val x: Self) extends AnyVal {
      
      inline def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
      
      inline def setAllowTld(value: Boolean): Self = StObject.set(x, "allowTld", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowLocalBoolean extends StObject {
    
    var allowLocal: Boolean
  }
  object AllowLocalBoolean {
    
    inline def apply(allowLocal: Boolean): AllowLocalBoolean = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowLocalBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowLocalBoolean] (val x: Self) extends AnyVal {
      
      inline def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
    }
  }
}
