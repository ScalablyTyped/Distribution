package typings.bitwise

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferReadIntMod {
  
  @JSImport("bitwise/esm/buffer/read-int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
}
