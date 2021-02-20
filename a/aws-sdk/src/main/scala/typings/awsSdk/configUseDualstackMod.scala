package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configUseDualstackMod {
  
  @js.native
  trait UseDualstackConfigOptions extends StObject {
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. 
      * In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. 
      * Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    var useDualstack: js.UndefOr[Boolean] = js.native
  }
  object UseDualstackConfigOptions {
    
    @scala.inline
    def apply(): UseDualstackConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDualstackConfigOptions]
    }
    
    @scala.inline
    implicit class UseDualstackConfigOptionsMutableBuilder[Self <: UseDualstackConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseDualstack(value: Boolean): Self = StObject.set(x, "useDualstack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDualstackUndefined: Self = StObject.set(x, "useDualstack", js.undefined)
    }
  }
}
