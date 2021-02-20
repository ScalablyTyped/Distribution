package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nulldataMod {
  
  object check {
    
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "check")
    @js.native
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "check")
    @js.native
    def apply(script: Buffer): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "check")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "check.toJSON")
    @js.native
    def toJSON: js.Function0[String] = js.native
    @scala.inline
    def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
  }
  
  object output {
    
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "output")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "output.check")
    @js.native
    def check: js.Function1[/* script */ Buffer | (js.Array[Double | Buffer]), Boolean] = js.native
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "output.check")
    @js.native
    def check(script: js.Array[Double | Buffer]): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/nulldata", "output.check")
    @js.native
    def check(script: Buffer): Boolean = js.native
    @scala.inline
    def check_=(x: js.Function1[/* script */ Buffer | (js.Array[Double | Buffer]), Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
  }
}
