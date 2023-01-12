package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigUseDualstackMod {
  
  trait UseDualstackConfigOptions extends StObject {
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. 
      * In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. 
      * Note, however, that currently on Windows, the IPv4 address will be preferred.
      * @deprecated Use {@link ConfigBase.useDualstackEndpoint}
      */
    var useDualstack: js.UndefOr[Boolean] = js.undefined
  }
  object UseDualstackConfigOptions {
    
    inline def apply(): UseDualstackConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDualstackConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseDualstackConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setUseDualstack(value: Boolean): Self = StObject.set(x, "useDualstack", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackUndefined: Self = StObject.set(x, "useDualstack", js.undefined)
    }
  }
}
