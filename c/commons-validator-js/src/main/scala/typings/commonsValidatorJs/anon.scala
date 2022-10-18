package typings.commonsValidatorJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowLocal extends StObject {
    
    var allowLocal: Boolean
  }
  object AllowLocal {
    
    inline def apply(allowLocal: Boolean): AllowLocal = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowLocal]
    }
    
    extension [Self <: AllowLocal](x: Self) {
      
      inline def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowTld extends StObject {
    
    var allowLocal: Boolean
    
    var allowTld: Boolean
  }
  object AllowTld {
    
    inline def apply(allowLocal: Boolean, allowTld: Boolean): AllowTld = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowTld]
    }
    
    extension [Self <: AllowTld](x: Self) {
      
      inline def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
      
      inline def setAllowTld(value: Boolean): Self = StObject.set(x, "allowTld", value.asInstanceOf[js.Any])
    }
  }
}
