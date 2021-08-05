package typings.bip174

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varintMod {
  
  @JSImport("bip174/src/lib/converter/varint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decode(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encode(_number: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encode(_number: Double, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(_number: Double, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(_number: Double, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodingLength(_number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(_number.asInstanceOf[js.Any]).asInstanceOf[Double]
}
