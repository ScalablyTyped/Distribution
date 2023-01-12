package typings.azureMobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encrypt extends StObject {
    
    var encrypt: Boolean
  }
  object Encrypt {
    
    inline def apply(encrypt: Boolean): Encrypt = {
      val __obj = js.Dynamic.literal(encrypt = encrypt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encrypt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encrypt] (val x: Self) extends AnyVal {
      
      inline def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    }
  }
}
