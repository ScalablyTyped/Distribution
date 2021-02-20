package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classifyMod {
  
  @JSImport("bitcoinjs-lib/types/classify", "input")
  @js.native
  def input(script: Buffer): String = js.native
  @JSImport("bitcoinjs-lib/types/classify", "input")
  @js.native
  def input(script: Buffer, allowIncomplete: Boolean): String = js.native
  
  @JSImport("bitcoinjs-lib/types/classify", "output")
  @js.native
  def output(script: Buffer): String = js.native
  
  object types {
    
    @JSImport("bitcoinjs-lib/types/classify", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/classify", "types.NONSTANDARD")
    @js.native
    def NONSTANDARD: String = js.native
    @scala.inline
    def NONSTANDARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONSTANDARD")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.NULLDATA")
    @js.native
    def NULLDATA: String = js.native
    @scala.inline
    def NULLDATA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULLDATA")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2MS")
    @js.native
    def P2MS: String = js.native
    @scala.inline
    def P2MS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2MS")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2PK")
    @js.native
    def P2PK: String = js.native
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2PKH")
    @js.native
    def P2PKH: String = js.native
    @scala.inline
    def P2PKH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2PKH")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def P2PK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2PK")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2SH")
    @js.native
    def P2SH: String = js.native
    @scala.inline
    def P2SH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2SH")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2WPKH")
    @js.native
    def P2WPKH: String = js.native
    @scala.inline
    def P2WPKH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2WPKH")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.P2WSH")
    @js.native
    def P2WSH: String = js.native
    @scala.inline
    def P2WSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P2WSH")(x.asInstanceOf[js.Any])
    
    @JSImport("bitcoinjs-lib/types/classify", "types.WITNESS_COMMITMENT")
    @js.native
    def WITNESS_COMMITMENT: String = js.native
    @scala.inline
    def WITNESS_COMMITMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WITNESS_COMMITMENT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bitcoinjs-lib/types/classify", "witness")
  @js.native
  def witness(script: js.Array[Buffer]): String = js.native
  @JSImport("bitcoinjs-lib/types/classify", "witness")
  @js.native
  def witness(script: js.Array[Buffer], allowIncomplete: Boolean): String = js.native
}
