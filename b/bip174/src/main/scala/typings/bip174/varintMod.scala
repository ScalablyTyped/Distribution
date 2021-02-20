package typings.bip174

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object varintMod {
  
  @JSImport("bip174/src/lib/converter/varint", "decode")
  @js.native
  def decode(buffer: Buffer): Double = js.native
  @JSImport("bip174/src/lib/converter/varint", "decode")
  @js.native
  def decode(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("bip174/src/lib/converter/varint", "encode")
  @js.native
  def encode(_number: Double): Buffer = js.native
  @JSImport("bip174/src/lib/converter/varint", "encode")
  @js.native
  def encode(_number: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
  @JSImport("bip174/src/lib/converter/varint", "encode")
  @js.native
  def encode(_number: Double, buffer: Buffer): Buffer = js.native
  @JSImport("bip174/src/lib/converter/varint", "encode")
  @js.native
  def encode(_number: Double, buffer: Buffer, offset: Double): Buffer = js.native
  
  @JSImport("bip174/src/lib/converter/varint", "encodingLength")
  @js.native
  def encodingLength(_number: Double): Double = js.native
}
