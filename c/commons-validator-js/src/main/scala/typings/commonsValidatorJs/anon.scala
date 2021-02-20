package typings.commonsValidatorJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllowLocal extends StObject {
    
    var allowLocal: Boolean = js.native
    
    var allowTld: Boolean = js.native
  }
  object AllowLocal {
    
    @scala.inline
    def apply(allowLocal: Boolean, allowTld: Boolean): AllowLocal = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowLocal]
    }
    
    @scala.inline
    implicit class AllowLocalMutableBuilder[Self <: AllowLocal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTld(value: Boolean): Self = StObject.set(x, "allowTld", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AllowLocalBoolean extends StObject {
    
    var allowLocal: Boolean = js.native
  }
  object AllowLocalBoolean {
    
    @scala.inline
    def apply(allowLocal: Boolean): AllowLocalBoolean = {
      val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowLocalBoolean]
    }
    
    @scala.inline
    implicit class AllowLocalBooleanMutableBuilder[Self <: AllowLocalBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLocal(value: Boolean): Self = StObject.set(x, "allowLocal", value.asInstanceOf[js.Any])
    }
  }
}
