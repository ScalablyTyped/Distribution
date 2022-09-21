package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.basicMod.uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonceMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/nonce", "MAX_NONCE")
  @js.native
  val MAX_NONCE: /* 4294967295.0 */ Double = js.native
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/nonce", "MIN_NONCE")
  @js.native
  val MIN_NONCE: /* 0 */ Double = js.native
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/nonce", "Nonce")
  @js.native
  open class Nonce () extends StObject {
    def this(n: Double) = this()
    
    def assertValue(): Unit = js.native
    
    /* private */ val bytes: Any = js.native
    
    def getBytes(): js.typedarray.Uint8Array = js.native
    
    def getUint64(): uint64 = js.native
    
    def increment(): Unit = js.native
    
    /* private */ var n: Any = js.native
    
    /* private */ val view: Any = js.native
  }
}
