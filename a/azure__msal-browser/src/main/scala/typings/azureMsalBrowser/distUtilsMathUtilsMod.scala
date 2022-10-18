package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMathUtilsMod {
  
  @JSImport("@azure/msal-browser/dist/utils/MathUtils", "MathUtils")
  @js.native
  open class MathUtils () extends StObject
  /* static members */
  object MathUtils {
    
    @JSImport("@azure/msal-browser/dist/utils/MathUtils", "MathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decimal to Hex
      *
      * @param num
      */
    inline def decimalToHex(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decimalToHex")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
