package typings.bitcoinjsLib

import org.scalablytyped.runtime.StringDictionary
import typings.bitcoinjsLib.paymentsMod.Stack
import typings.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/script", JSImport.Namespace)
@js.native
object scriptMod extends js.Object {
  
  def compile(chunks: Stack): Buffer = js.native
  def compile(chunks: Buffer): Buffer = js.native
  
  def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = js.native
  def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = js.native
  
  def fromASM(asm: String): Buffer = js.native
  
  def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
  
  def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
  
  def isDefinedHashType(hashType: Double): Boolean = js.native
  
  def isPushOnly(value: Stack): Boolean = js.native
  
  def toASM(chunks: js.Array[Double | Buffer]): String = js.native
  def toASM(chunks: Buffer): String = js.native
  
  def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = js.native
  def toStack(chunks: Buffer): js.Array[Buffer] = js.native
  
  @js.native
  object OPS extends /* index */ StringDictionary[Double]
  
  @js.native
  object number extends js.Object {
    
    def decode(buffer: Buffer): Double = js.native
    def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
    def decode(buffer: Buffer, maxLength: Double): Double = js.native
    def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
    
    def encode(_number: Double): Buffer = js.native
  }
  
  @js.native
  object signature extends js.Object {
    
    def decode(buffer: Buffer): ScriptSignature = js.native
    
    def encode(signature: Buffer, hashType: Double): Buffer = js.native
  }
  
  type OpCode = Double
}
