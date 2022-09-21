package typings.deta

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("deta/dist/types/utils/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferToUint8Array(buffer: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToUint8Array")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def stringToUint8Array(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToUint8Array")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
