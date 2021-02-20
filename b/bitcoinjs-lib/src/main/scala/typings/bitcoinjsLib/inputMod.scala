package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Stack
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  object check {
    
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check")
    @js.native
    def apply(script: Stack): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check")
    @js.native
    def apply(script: Stack, allowIncomplete: Boolean): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check")
    @js.native
    def apply(script: Buffer): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check")
    @js.native
    def apply(script: Buffer, allowIncomplete: Boolean): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/templates/multisig/input", "check.toJSON")
    @js.native
    def toJSON: js.Function0[String] = js.native
    @scala.inline
    def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
  }
}
