package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scripthashInputMod {
  
  object check {
    
    inline def apply(script: js.Array[Double | Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(script: js.Array[Double | Buffer], allowIncomplete: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any], allowIncomplete.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(script: Buffer, allowIncomplete: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any], allowIncomplete.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("bitcoinjs-lib/types/templates/scripthash/input", "check")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/templates/scripthash/input", "check.toJSON")
    @js.native
    def toJSON: js.Function0[String] = js.native
    inline def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
  }
}
