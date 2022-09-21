package typings.b2a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("b2a", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atob(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts base64url string back into original text
    */
  inline def atobu(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atobu")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts text into base64 string
    */
  inline def btoa(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts text into base64url string
    */
  inline def btoau(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoau")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
