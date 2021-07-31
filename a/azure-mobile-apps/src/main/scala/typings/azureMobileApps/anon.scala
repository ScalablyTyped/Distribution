package typings.azureMobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encrypt extends StObject {
    
    var encrypt: Boolean
  }
  object Encrypt {
    
    @scala.inline
    def apply(encrypt: Boolean): Encrypt = {
      val __obj = js.Dynamic.literal(encrypt = encrypt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encrypt]
    }
    
    @scala.inline
    implicit class EncryptMutableBuilder[Self <: Encrypt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    }
  }
}
