package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptNumberMod {
  
  @JSImport("bitcoinjs-lib/types/script_number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def decode(buffer: Buffer, maxLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def decode(buffer: Buffer, maxLength: Unit, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def encode(_number: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
