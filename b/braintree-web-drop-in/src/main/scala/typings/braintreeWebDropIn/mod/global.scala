package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.Create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Global
object global {
  
  object braintree {
    
    @JSGlobal("braintree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("braintree.dropin")
    @js.native
    def dropin: Create = js.native
    inline def dropin_=(x: Create): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropin")(x.asInstanceOf[js.Any])
  }
}
