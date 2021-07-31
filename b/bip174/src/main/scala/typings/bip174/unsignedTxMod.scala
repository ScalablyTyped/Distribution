package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsignedTxMod {
  
  @JSImport("bip174/src/lib/converter/global/unsignedTx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def encode(data: Transaction): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
}
