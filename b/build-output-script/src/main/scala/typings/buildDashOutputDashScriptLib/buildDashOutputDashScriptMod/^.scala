package typings
package buildDashOutputDashScriptLib.buildDashOutputDashScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("build-output-script", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Builds a P2PKH Bitcoin transaction output script from an array of P2PKH addresses and amounts.
    * Will also work with any Bitcoin derived cryptocurrencies with a single byte pubkey hash address prefix.
    *
    * The output script is returned as a hex string and can be passed directly in to ledgerjs.
    *
    * @param outputs An array of one or more output objects.
    * @returns A (hex string) P2PKH transaction output script.
    */
  def apply(outputs: js.Array[Output]): java.lang.String = js.native
}

