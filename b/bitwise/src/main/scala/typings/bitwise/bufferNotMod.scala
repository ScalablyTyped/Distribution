package typings.bitwise

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferNotMod {
  
  @JSImport("bitwise/buffer/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
