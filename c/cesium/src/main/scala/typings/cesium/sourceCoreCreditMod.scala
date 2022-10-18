package typings.cesium

import typings.cesium.mod.Credit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCreditMod {
  
  @JSImport("cesium/Source/Core/Credit", JSImport.Default)
  @js.native
  open class default protected () extends Credit {
    def this(html: String) = this()
    def this(html: String, showOnScreen: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Credit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(credit: Credit): Credit = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(credit.asInstanceOf[js.Any]).asInstanceOf[Credit]
    
    /**
      * Returns true if the credits are equal
      * @param left - The first credit
      * @param right - The second credit
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(left: Credit, right: Credit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
