package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Stack
import typings.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptMod {
  
  @JSImport("bitcoinjs-lib/types/script", "compile")
  @js.native
  def compile(chunks: Stack): Buffer = js.native
  @JSImport("bitcoinjs-lib/types/script", "compile")
  @js.native
  def compile(chunks: Buffer): Buffer = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "decompile")
  @js.native
  def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = js.native
  @JSImport("bitcoinjs-lib/types/script", "decompile")
  @js.native
  def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "fromASM")
  @js.native
  def fromASM(asm: String): Buffer = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "isCanonicalPubKey")
  @js.native
  def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "isCanonicalScriptSignature")
  @js.native
  def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "isDefinedHashType")
  @js.native
  def isDefinedHashType(hashType: Double): Boolean = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "isPushOnly")
  @js.native
  def isPushOnly(value: Stack): Boolean = js.native
  
  object number {
    
    @JSImport("bitcoinjs-lib/types/script", "number.decode")
    @js.native
    def decode(buffer: Buffer): Double = js.native
    @JSImport("bitcoinjs-lib/types/script", "number.decode")
    @js.native
    def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
    @JSImport("bitcoinjs-lib/types/script", "number.decode")
    @js.native
    def decode(buffer: Buffer, maxLength: Double): Double = js.native
    @JSImport("bitcoinjs-lib/types/script", "number.decode")
    @js.native
    def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
    
    @JSImport("bitcoinjs-lib/types/script", "number.encode")
    @js.native
    def encode(_number: Double): Buffer = js.native
  }
  
  object signature {
    
    @JSImport("bitcoinjs-lib/types/script", "signature.decode")
    @js.native
    def decode(buffer: Buffer): ScriptSignature = js.native
    
    @JSImport("bitcoinjs-lib/types/script", "signature.encode")
    @js.native
    def encode(signature: Buffer, hashType: Double): Buffer = js.native
  }
  
  @JSImport("bitcoinjs-lib/types/script", "toASM")
  @js.native
  def toASM(chunks: js.Array[Double | Buffer]): String = js.native
  @JSImport("bitcoinjs-lib/types/script", "toASM")
  @js.native
  def toASM(chunks: Buffer): String = js.native
  
  @JSImport("bitcoinjs-lib/types/script", "toStack")
  @js.native
  def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = js.native
  @JSImport("bitcoinjs-lib/types/script", "toStack")
  @js.native
  def toStack(chunks: Buffer): js.Array[Buffer] = js.native
  
  type OpCode = Double
}
