package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferModifyMod {
  
  @JSImport("bitwise/esm/buffer/modify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(buffer: Buffer, bits: js.Array[Bit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
