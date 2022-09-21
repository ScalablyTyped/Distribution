package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserStringUtilsMod {
  
  @JSImport("@azure/msal-browser/dist/utils/BrowserStringUtils", "BrowserStringUtils")
  @js.native
  open class BrowserStringUtils () extends StObject
  /* static members */
  object BrowserStringUtils {
    
    @JSImport("@azure/msal-browser/dist/utils/BrowserStringUtils", "BrowserStringUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converst string to ArrayBuffer
      * @param dataString
      */
    inline def stringToArrayBuffer(dataString: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer")(dataString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Converts string to Uint8Array
      * @param sDOMStr
      */
    inline def stringToUtf8Arr(sDOMStr: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToUtf8Arr")(sDOMStr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Converts Uint8Array to a string
      * @param aBytes
      */
    inline def utf8ArrToString(aBytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ArrToString")(aBytes.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
