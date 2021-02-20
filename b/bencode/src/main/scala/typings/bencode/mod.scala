package typings.bencode

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bencode", "byteLength")
  @js.native
  def byteLength(value: js.Any): Double = js.native
  
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], encoding: String): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: js.UndefOr[scala.Nothing], end: Double): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: js.UndefOr[scala.Nothing], end: Double, encoding: String): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: Double): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: Double, end: js.UndefOr[scala.Nothing], encoding: String): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: Double, end: Double): js.Any = js.native
  @JSImport("bencode", "decode")
  @js.native
  def decode(data: Buffer, start: Double, end: Double, encoding: String): js.Any = js.native
  
  @JSImport("bencode", "encode")
  @js.native
  def encode(data: js.Any): Buffer = js.native
  @JSImport("bencode", "encode")
  @js.native
  def encode(data: js.Any, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
  @JSImport("bencode", "encode")
  @js.native
  def encode(data: js.Any, buffer: Buffer): Buffer = js.native
  @JSImport("bencode", "encode")
  @js.native
  def encode(data: js.Any, buffer: Buffer, offset: Double): Buffer = js.native
  
  @JSImport("bencode", "encodingLength")
  @js.native
  def encodingLength(value: js.Any): Double = js.native
}
