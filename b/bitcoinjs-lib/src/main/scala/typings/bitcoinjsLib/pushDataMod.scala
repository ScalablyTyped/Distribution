package typings.bitcoinjsLib

import typings.bitcoinjsLib.anon.Number
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushDataMod {
  
  @JSImport("bitcoinjs-lib/src/push_data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer, offset: Double): Number | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Number | Null]
  
  inline def encode(buffer: Buffer, num: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any], num.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encodingLength(i: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(i.asInstanceOf[js.Any]).asInstanceOf[Double]
}
