package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferReadMod {
  
  @JSImport("bitwise/esm/buffer/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buffer: Buffer): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  inline def default(buffer: Buffer, offset: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  inline def default(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  inline def default(buffer: Buffer, offset: Unit, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
}
