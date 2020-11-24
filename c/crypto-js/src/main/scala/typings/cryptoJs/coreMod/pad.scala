package typings.cryptoJs.coreMod

import typings.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/core", "pad")
@js.native
object pad extends js.Object {
  
  /**
    * ANSI X.923 padding strategy.
    */
  val AnsiX923: Padding = js.native
  
  /**
    * ISO 10126 padding strategy.
    */
  val Iso10126: Padding = js.native
  
  /**
    * ISO/IEC 9797-1 Padding Method 2.
    */
  val Iso97971: Padding = js.native
  
  /**
    * A noop padding strategy.
    */
  val NoPadding: Padding = js.native
  
  /**
    * PKCS #5/7 padding strategy.
    */
  val Pkcs7: Padding = js.native
  
  /**
    * Zero padding strategy.
    */
  val ZeroPadding: Padding = js.native
}
