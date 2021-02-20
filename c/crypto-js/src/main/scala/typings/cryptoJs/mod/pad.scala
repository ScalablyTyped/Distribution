package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pad {
  
  /**
    * ANSI X.923 padding strategy.
    */
  @JSImport("crypto-js", "pad.AnsiX923")
  @js.native
  val AnsiX923: Padding = js.native
  
  /**
    * ISO 10126 padding strategy.
    */
  @JSImport("crypto-js", "pad.Iso10126")
  @js.native
  val Iso10126: Padding = js.native
  
  /**
    * ISO/IEC 9797-1 Padding Method 2.
    */
  @JSImport("crypto-js", "pad.Iso97971")
  @js.native
  val Iso97971: Padding = js.native
  
  /**
    * A noop padding strategy.
    */
  @JSImport("crypto-js", "pad.NoPadding")
  @js.native
  val NoPadding: Padding = js.native
  
  /**
    * PKCS #5/7 padding strategy.
    */
  @JSImport("crypto-js", "pad.Pkcs7")
  @js.native
  val Pkcs7: Padding = js.native
  
  /**
    * Zero padding strategy.
    */
  @JSImport("crypto-js", "pad.ZeroPadding")
  @js.native
  val ZeroPadding: Padding = js.native
}
