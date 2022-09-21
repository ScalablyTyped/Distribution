package typings.cborg

import typings.cborg.cborgStrings.`CBOR decode errorColon`
import typings.cborg.cborgStrings.`CBOR encode errorColon`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("cborg/types/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertEnoughData(data: js.typedarray.Uint8Array, pos: Double, need: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEnoughData")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], need.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("cborg/types/lib/common", "decodeErrPrefix")
  @js.native
  val decodeErrPrefix: `CBOR decode errorColon` = js.native
  
  @JSImport("cborg/types/lib/common", "encodeErrPrefix")
  @js.native
  val encodeErrPrefix: `CBOR encode errorColon` = js.native
  
  @JSImport("cborg/types/lib/common", "uintMinorPrefixBytes")
  @js.native
  val uintMinorPrefixBytes: js.Array[Any] = js.native
}
