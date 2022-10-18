package typings.bitwise

import typings.bitwise.esmTypesMod.Bits
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBufferCreateMod {
  
  @JSImport("bitwise/esm/buffer/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
